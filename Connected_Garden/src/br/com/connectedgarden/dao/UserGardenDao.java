package br.com.connectedgarden.dao;

import java.util.Date;

import java.sql.SQLException;
import java.sql.Timestamp;

import org.springframework.jdbc.core.JdbcTemplate;



public class UserGardenDao {

	
	private JdbcTemplate jt;
	
	public void storeUserGarden(String name,  String email, String nickName, String password) throws SQLException{
		testeGarden();
			
		String sql = "INSERT INTO `connected_garden`.`user_garden` " +
				"(`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) " +
				"VALUES ('" + name + "', '" + email + "', '" + nickName + "', '" + password + "', " + 1 + ")";
		
		jt = new JdbcTemplate(Fabrica.getDataSource());	
		jt.execute(sql);
		jt.getDataSource().getConnection().close();

	}
	
	public void testeGarden() throws SQLException{			
		StringBuilder sql = new StringBuilder(
				" INSERT INTO `connected_garden`.`garden` " +
				" (`ID_USER`, `DESCRIPTION`, `OBS`, `IP_SERVER`, `IP_CONCENTRATOR`, `LAST_UPDATE`, `ACTIVE`)  " +
				" VALUES ('" + 
				1 + "', '" + 
				"teste" + "', '" + 
				"teste" + "', '" + 
				"teste" + "', '" + 
				"teste" + "', '" + 
				new Timestamp(System.currentTimeMillis())   + "', " + 
				1 + ");"
			);
			
			jt = new JdbcTemplate(Fabrica.getDataSource());
			jt.execute(sql.toString());
			jt.getDataSource().getConnection().close();	
	}
	
}
