package br.com.connectedgarden.dao;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.connectedgarden.entity.UserGarden;

public class LoginDao {

	private JdbcTemplate jt;
	
	public UserGarden login(String email, String password) throws SQLException{
		jt = new JdbcTemplate(Fabrica.getDataSource());	
		String sql = " SELECT * " +
				" FROM connected_garden.user_garden user " +
				" where user.email LIKE '" + email + "' " +
				" AND user.password LIKE '" + password + "'";
		
		Map<String, Object> map = jt.queryForMap(sql);
		
			UserGarden user = new UserGarden();
			user.setId((int)map.get("ID_USER"));
			user.setName((String) map.get("name"));
			user.setEmail((String) map.get("email"));
			user.setNickName((String) map.get("nickName"));
			user.setPassword((String) map.get("password"));
			Boolean active = (Boolean) map.get("active");
			user.setActive( active.booleanValue());			
		
		
		return user;		
	}
}
