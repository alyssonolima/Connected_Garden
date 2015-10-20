package br.com.connectedgarden.jsf;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.connectedgarden.dao.UserGardenDao;

@ManagedBean 
@SessionScoped
public class RegisterMB extends SuperMB {
	
	private String name;
	private String nickName;
	private String email;
	private String password1;
	private String password2;
	
	private UserGardenDao dao;
	
	public RegisterMB(){
		reset();
	}
	
	public void reset(){
		name = "";
		nickName = "";
		email = "";
		password1 = "";
		password2 = "";
	}
	
	public String initRegisterUser(){
		reset();
		
		return "/register";
	}
	
	public String registerUser() throws SQLException{
		if(!validateRegisterUserGarden())
			return null;
		
		
		dao = new UserGardenDao();
		dao.storeUserGarden(name, email, nickName, password1);
		
		
		return "Sucess!";
	}
	
	public boolean validateRegisterUserGarden(){
				
		if(name == null || name == "")
			return false;
		
		if(nickName == null || nickName == "")
			return false;
		
		if(email == null || email == "")
			return false;
		
		if(password1 == null || password1 == "")
			return false;
		
		if(password2 == null || password2 == "")
			return false;
		
		if(!password1.equals(password2))
			return false;
	
		return true;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
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
	
}
