package br.com.connectedgarden.entity;

public class Pot {

	private int id;
	
	private int idGarden;
		
	private String description;
		
	private int temp;
		
	private int humAir;
		
	private int humSoil;
		
	private int light;
		
	private boolean active;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdGarden() {
		return idGarden;
	}
	
	public void setIdGarden(int idGarden) {
		this.idGarden = idGarden;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	public int getHumAir() {
		return humAir;
	}
	
	public void setHumAir(int humAir) {
		this.humAir = humAir;
	}
	
	public int getHumSoil() {
		return humSoil;
	}
	
	public void setHumSoil(int humSoil) {
		this.humSoil = humSoil;
	}
	
	public int getLight() {
		return light;
	}
	
	public void setLight(int light) {
		this.light = light;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
