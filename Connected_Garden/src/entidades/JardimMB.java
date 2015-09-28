package entidades;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class JardimMB {

	private static final String LISTAGEM_JARDIM = "/listaMeuJardim";
	
	public JardimMB(){
		reset();
	}
	
	public void reset(){
		
	}
	
	public String iniciarMeuJardim(){
		
		return LISTAGEM_JARDIM;
	}
	
}
