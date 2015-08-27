package login;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidades.Usuario;

@ManagedBean 
@SessionScoped
public class LoginMB {
	
	private static final String HOME = "/home";
	private static final String LOGIN = "/login";
	private static final String INICIO = "/inicio";	
	private static final String SOBRE = "/sobre";
		
	
	private Usuario user;
	
	public LoginMB(){
		reset();
	}
	
	public String iniciarLogin(){
		reset();
		return LOGIN;
	}
	
	public String logar(){
		
		return INICIO;
	}
	
	public void reset(){
		user = new Usuario();
	}
	
	public String logout(){
		reset();
		return iniciarLogin();		
	}
	
	public String home(){
		reset();
		return HOME;
	}
		
	public String sobre(){
		
		return SOBRE;
	}
	
	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
}
