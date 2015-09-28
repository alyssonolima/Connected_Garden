package entidades;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;




public class ListaVasoDao {

	
public List<Vaso> buscaVasos(){
		
		List<Vaso> vasos = new ArrayList<Vaso>();
		String sql = "SELECT * FROM connected_garden.vaso";
		
		try {
			SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
	 		dataSource.setDriver(new com.mysql.jdbc.Driver());
	        dataSource.setUrl("jdbc:mysql://localhost/connected_garden");
	        dataSource.setUsername("root");
	        dataSource.setPassword("alysson1989");
	        JdbcTemplate jt = new JdbcTemplate(dataSource);			
			List<Map<String, Object>> result = jt.queryForList(sql);			
			
			for(Map<String, Object> map: result){
				Vaso vaso = new Vaso();
				vaso.setId(((Integer) map.get("id")).longValue());
				vaso.setDescricao((String) map.get("descricao"));
				vaso.setMac1((String) map.get("mac1"));
				vaso.setMac2((String) map.get("mac2"));
				vaso.setTemp((int) map.get("temp"));
				vaso.setUmidSolo((int) map.get("umidsolo"));
				vaso.setUmidAr((int) map.get("umidar"));
				vaso.setLuz((int) map.get("luz"));
				vaso.setBomba((int) map.get("bomba"));
				vaso.setBombaAT((int) map.get("bombaAT"));
				vaso.setAtivo((int) map.get("ativo"));				
								
				vasos.add(vaso);				
			}		
		
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			
		}		
		
		return vasos;
	}
	
}
