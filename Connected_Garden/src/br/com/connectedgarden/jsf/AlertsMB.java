package br.com.connectedgarden.jsf;

import java.sql.SQLException;
import java.util.ArrayList;
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
	
	private List<Alert> alerts;
	
	public AlertsMB(){
		init();
	}
	
	public void init(){
		alerts = new ArrayList<Alert>();
	}
	
	public String iniciar(){
		return ALERTS;
	}
	
	public String findAlerts() throws SQLException{
		dao = new AlertsDao();
		
		alerts = dao.findAlerts(getUser().getId());
		
		return ALERTS;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}
	
}
