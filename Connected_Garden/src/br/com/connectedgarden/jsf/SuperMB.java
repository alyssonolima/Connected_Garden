package br.com.connectedgarden.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.connectedgarden.entity.UserGarden;

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
	private static UserGarden user;
		
	public SuperMB(){
		modulo = 0;
		user = new UserGarden();
	}

	public long getModulo() {
		return modulo;
	}

	public void setModulo(long modulo) {
		this.modulo = modulo;
	}
	
	
	public boolean existUserLoged(){
		if(user != null)
			return true;
		else 
			return false;
	}

	public UserGarden getUser() {
		return user;
	}

	public void setUser(UserGarden user) {
		this.user = user;
	}
	
}
