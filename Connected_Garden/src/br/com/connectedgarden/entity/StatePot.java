package br.com.connectedgarden.entity;

public class StatePot {


	private int id;
		
	private int idPot;
		
	private String description;
		
	private int temp;
		
	private int humAir;
		
	private int humSoil;
		
	private int light;
		
	private boolean active;
		
	private boolean irrigationAuto;
		
	private boolean irrigationActive;

	
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

	public boolean isIrrigationAuto() {
		return irrigationAuto;
	}

	public void setIrrigationAuto(boolean irrigationAuto) {
		this.irrigationAuto = irrigationAuto;
	}

	public boolean isIrrigationActive() {
		return irrigationActive;
	}

	public void setIrrigationActive(boolean irrigationActive) {
		this.irrigationActive = irrigationActive;
	}
	
}
