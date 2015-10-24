package br.com.connectedgarden.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.connectedgarden.entity.Alert;

public class AlertsDao {
	
	private JdbcTemplate jt;
	
	public List<Alert> findAlerts(Integer iduser) throws SQLException{
		
		StringBuilder sql = new StringBuilder(
			" SELECT alert.ID_ALERT, alert.ID_POT, alert.ID_ALERT_TYPE, alert.DESCRIPTION, alert.ACTIVATION_DATE, alert.ACTIVE " +
			" FROM connected_garden.alert alert " +
			" INNER JOIN connected_garden.pot pot on pot.ID_POT = alert.ID_POT " +
			" INNER JOIN connected_garden.garden garden on garden.ID_GARDEN = pot.ID_GARDEN " +
			" INNER JOIN connected_garden.user_garden us on us.ID_USER = garden.ID_USER " +
			" where us.ID_USER = " + iduser
		);
		jt = new JdbcTemplate(Fabrica.getDataSource());
		List<Map<String, Object>> result = jt.queryForList(sql.toString());
		List<Alert> alerts = new ArrayList<Alert>();
		
		for(Map<String, Object> map: result){
			Alert alert = new Alert();
			
			alert.setId((int) map.get("id_alert"));
			alert.setIdPot((int) map.get("id_pot"));
			alert.setIdAlertType((int) map.get("id_alert_type"));
			alert.setDescription((String) map.get("description"));
			alert.setActivationDate((Date) map.get("activation_date"));
			Boolean active = (Boolean) map.get("active");
			alert.setActive(active);
			
			alerts.add(alert);
		}
		
		return alerts;
	}
}
