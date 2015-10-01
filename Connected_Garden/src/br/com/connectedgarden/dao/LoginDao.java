package br.com.connectedgarden.dao;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDao {

	private JdbcTemplate jt;
	
	public boolean login(String email, String password) throws SQLException{
		jt = new JdbcTemplate(Fabrica.getDataSource());	
		String sql = " SELECT * " +
				" FROM connected_garden.user_garden user " +
				" where user.email LIKE '" + email + "' " +
				" AND user.password LIKE '" + password + "'";
		
		Map<String, Object> result = jt.queryForMap(sql);
		
		return result.size() > 1;		
	}
}
