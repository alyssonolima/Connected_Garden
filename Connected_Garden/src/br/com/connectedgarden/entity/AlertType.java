package br.com.connectedgarden.entity;

public class AlertType {

	public static final int HOUR = 1;
	public static final int DAY = 2;
	public static final int WEEK = 3;
	public static final int MONTH = 4;
	public static final int YEAR = 5;
	
	private int id;
		
	private String description;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
