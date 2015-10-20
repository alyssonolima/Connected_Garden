package br.com.connectedgarden.entity;

public class UserGardenConfiguration {

	private int id;	
		
	private int idUserGarden;
		
	private String description;
		
	private String value;
		
	private String confg;
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUserGarden() {
		return idUserGarden;
	}
	public void setIdUserGarden(int idUserGarden) {
		this.idUserGarden = idUserGarden;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getConfg() {
		return confg;
	}
	public void setConfg(String confg) {
		this.confg = confg;
	}

}
