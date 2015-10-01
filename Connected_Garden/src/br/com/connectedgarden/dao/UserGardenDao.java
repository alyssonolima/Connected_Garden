package br.com.connectedgarden.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;


public class UserGardenDao {

	
	private JdbcTemplate jt;
	
	public void storeUserGarden(String name,  String email, String nickName, String password) throws SQLException{
		jt = new JdbcTemplate(Fabrica.getDataSource());		
		String sql = "INSERT INTO `connected_garden`.`user_garden` " +
				"(`NAME`, `EMAIL`, `NICKNAME`, `PASSWORD`, `ACTIVE`) " +
				"VALUES ('" + name + "', '" + email + "', '" + nickName + "', '" + password + "', " + 1 + ")";
		
		jt.execute(sql);
		jt.getDataSource().getConnection().close();

	}
}
