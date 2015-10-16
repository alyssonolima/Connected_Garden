package br.com.connectedgarden.jsf;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.connectedgarden.dao.LoginDao;
import javafx.util.Pair;

@ManagedBean 
@SessionScoped
public class LoginMB extends SuperMB {
	private String email;
	private String password;
	private LoginDao dao;
	
	public LoginMB(){
		reset();
	}
	
	public void reset(){
		email = "";
		password = "";
		dao = new LoginDao();
	}
	
	public String login() throws SQLException{
		if(!validate())
			return null;
		
		setUser(dao.login(email, password));
		if(getUser() != null){
			setModulo(HOME);				
			return "/home";
		}else {
			return "/index";
		}
		
	}	
	
	public boolean validate(){
		if(email == null || email == "")
			return false;
		
		if(password == null || password == "")
			return false;
		
		return true;
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
	

}
