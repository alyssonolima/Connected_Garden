package br.com.connectedgarden.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.connectedgarden.entity.Garden;
import br.com.connectedgarden.entity.Pot;
import br.com.connectedgarden.entity.StatePot;


public class GardenDao {

	JdbcTemplate jt;
	
	public Garden findGardenByUser(int idUser, int idGarden) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" SELECT * " +
			" FROM connected_garden.garden " +
			" WHERE ID_USER = " + idUser );
		
		if(idGarden > 0)
			sql.append(" AND ID_GARDEN = " + idGarden);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Garden> gardens = new ArrayList<Garden>();
		
		for(Map<String, Object> map: result){
			Garden garden = new Garden();
			garden.setId((int) map.get("id_garden"));
			garden.setIdUser((int) map.get("id_user"));
			garden.setDescription((String) map.get("description"));
			garden.setObs((String) map.get("obs"));
			garden.setIpServer((String) map.get("ip_server"));
			garden.setIpConcentrator((String) map.get("ip_concentrator"));
			Boolean active = (Boolean) map.get("active");
			garden.setActive(active);
			garden.setLastUpdate((Date) map.get("last_update"));
			
			gardens.add(garden);							
			
		}
		if(!gardens.isEmpty())
			return gardens.get(0);
		else return new Garden();
	}
	
	public void storesGarden(Garden garden) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
			" INSERT INTO `connected_garden`.`garden` " +
					" (`ID_USER`, `DESCRIPTION`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`, `LAST_UPDATE`, `ACTIVE`)  " +
					" VALUES ('" + 
					garden.getIdUser() + "', '" + 
					garden.getDescription() + "', '" + 
					garden.getObs() + "', '" + 
					garden.getIpServer() + "', '" + 
					garden.getIpConcentrator() + "', '" + 
					new Timestamp(garden.getLastUpdate().getTime()) + "', " + 
					garden.isActive() + ")"
		);
		
		jt = new JdbcTemplate(Fabrica.getDataSource());
		jt.execute(sql.toString());
		jt.getDataSource().getConnection().close();	
	}
	
	
	public List<Pot> findPots(Integer idUser, Integer idGarden) throws SQLException{
		StringBuilder sql = new StringBuilder(
			" select distinct(pot.ID_POT), pot.DESCRIPTION, pot.TEMP, pot.HUM_AIR, pot.HUM_SOIL, pot.LIGHT , state.ID_STATE_POT, (state.TEMP) as stateTemp, " +
			" (state.HUM_AIR) as state_HUMAIR, (state.HUM_SOIL) as stateHUMSOIL, (state.LIGHT) as stateLight " +
			" from connected_garden.pot pot " +
			" inner join connected_garden.garden garden on garden.ID_GARDEN = pot.ID_GARDEN " +
			" inner join connected_garden.state_pot state on state.ID_POT = pot.ID_POT " +
			" where 1=1 "
		);
		
		if(idUser != null && idUser >= 0)
			sql.append(" and garden.ID_USER = " + idUser);
		
		if(idGarden != null && idGarden >= 0)
			sql.append(" and pot.ID_GARDEN = " + idGarden);
		
			
		jt = new JdbcTemplate(Fabrica.getDataSource());
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Pot> pots = new ArrayList<Pot>();
		
		for(Map<String, Object> map: result){
			Pot pot = new Pot();		
			StatePot state = new StatePot();
			
			pot.setId((int)map.get("ID_POT"));
			pot.setDescription((String)map.get("DESCRIPTION"));
			pot.setTemp((int) map.get("TEMP"));
			pot.setHumAir((int) map.get("HUM_AIR"));
			pot.setHumSoil((int) map.get("HUM_SOIL"));
			pot.setLight((int) map.get("LIGHT"));
			
			state.setId((int)map.get("ID_STATE_POT"));
			state.setTemp((int) map.get("stateTemp"));
			state.setHumAir((int) map.get("state_HUMAIR"));
			state.setHumSoil((int) map.get("stateHUMSOIL"));
			state.setLight((int) map.get("stateLight"));
			
			pot.setState(state);
						
			pots.add(pot);
		}
		
		return pots;
	}
}
