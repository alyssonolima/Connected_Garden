package br.com.connectedgarden.entity;

public class UserGarden {
	
	private int id;
	
	private String name;
		
	private String nickName;
		
	private String email;
		
	private String password;
		
	private boolean active;
		
	public UserGarden(){
		
	}
	
	public void reset(){
		id = 0;
		name = "";
		nickName = "";
		email = "";
		password = "";
		active = false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
