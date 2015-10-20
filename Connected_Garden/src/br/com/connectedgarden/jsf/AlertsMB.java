package br.com.connectedgarden.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AlertsMB extends SuperMB{

	public static final String ALERTS = "/alerts.jsf";
	
	public String iniciar(){
		return ALERTS;
	}
}
