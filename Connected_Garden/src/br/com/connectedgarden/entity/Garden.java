package br.com.connectedgarden.entity;

import java.util.Date;

public class Garden {

private int id;
	
	
	private int idUser;
	
	
	private String description;
	
	
	private String obs;
	
	
	private String ipServer;
	
	
	private String ipConcentrator;
	
	
	private boolean active;
		
	
	private Date lastUpdate;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdUser() {
		return idUser;
	}
	
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getObs() {
		return obs;
	}
	
	public void setObs(String obs) {
		this.obs = obs;
	}
	
	public String getIpServer() {
		return ipServer;
	}
	
	public void setIpServer(String ipServer) {
		this.ipServer = ipServer;
	}
	
	public String getIpConcentrator() {
		return ipConcentrator;
	}
	
	public void setIpConcentrator(String ipConcentrator) {
		this.ipConcentrator = ipConcentrator;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}		

}
