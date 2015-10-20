package br.com.connectedgarden.entity;

import java.util.Date;

public class Alert {

	private int id;	
	
	private int idPot;
			
	private int idAlertType;
		
	private String description;
		
	private Date activationDate;
		
	private boolean active;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdPot() {
		return idPot;
	}
	public void setIdPot(int idPot) {
		this.idPot = idPot;
	}
	public int getIdAlertType() {
		return idAlertType;
	}
	public void setIdAlertType(int idAlertType) {
		this.idAlertType = idAlertType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
