package br.com.connectedgarden.jsf;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.connectedgarden.dao.AlertsDao;
import br.com.connectedgarden.entity.Alert;

@ManagedBean
@SessionScoped
public class AlertsMB extends SuperMB{

	public static final String ALERTS = "/alerts.jsf";
	
	private AlertsDao dao;
	
	public String iniciar(){
		return ALERTS;
	}
	
	public List<Alert> findAlerts() throws SQLException{
		dao = new AlertsDao();		
		return dao.findAlerts(getUser().getId()); 
	}
	
}
