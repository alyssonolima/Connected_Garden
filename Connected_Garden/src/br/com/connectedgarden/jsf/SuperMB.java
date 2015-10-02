package br.com.connectedgarden.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javafx.util.Pair;

@ManagedBean 
@SessionScoped
public class SuperMB {

	public static final long LOGOUT = 0;
	public static final long HOME = 1;
	public static final long GARDEN = 2;
	public static final long ALERTS = 3;
	public static final long PROFILE = 4;
	public static final long ABOUT = 5;
	
	
	private long modulo;
	private Pair<String,String> userLogin;
		
	public SuperMB(){
		modulo = 0;
		userLogin = new Pair<String, String>("", "");
	}

	public long getModulo() {
		return modulo;
	}

	public void setModulo(long modulo) {
		this.modulo = modulo;
	}

	public Pair<String, String> getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(Pair<String, String> userLogin) {
		this.userLogin = userLogin;
	}
	
	public boolean existUserLoged(){
		if(userLogin.getKey() != null && !userLogin.getKey().equals("")  && userLogin.getValue() != null && !userLogin.getValue().equals(""))
			return true;
		else 
			return false;
	}
	
}
