package br.com.connectedgarden.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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
	
	
	public SuperMB(){
		modulo = 0;		
	}

	public long getModulo() {
		return modulo;
	}

	public void setModulo(long modulo) {
		this.modulo = modulo;
	}
	
	public HttpSession getSession() {  		  
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);  
    }  
	
	public boolean existUserLoged(){
		if(getUser() != null)
			return true;
		else 
			return false;
	}

	public void setUser(UserGarden user){
		getSession().setAttribute("userLogado", user);
	}
	
	public UserGarden getUser(){
		return (UserGarden) getSession().getAttribute("userLogado");
	}
	
	
}
