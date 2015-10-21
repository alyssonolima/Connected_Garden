package br.com.connectedgarden.dao;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.connectedgarden.entity.Garden;


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
}
