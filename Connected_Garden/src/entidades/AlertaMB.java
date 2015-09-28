package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AlertaMB {

	private static final String LISTAGEM = "/listaAlerta";
	
	private List<Alerta> alertas; 
	private Alerta alerta;
	private boolean cadastro;
	
	public AlertaMB(){
		reset();
	}
	
	public void reset(){
		alertas = new ArrayList<Alerta>();
		alerta = new Alerta();
		cadastro = Boolean.FALSE;
	}
	
	public String iniciarListagem(){
		
		return LISTAGEM;
	}
	
	public void preCadastro(){
		alerta = new Alerta();
		cadastro = Boolean.TRUE;
	}
	
	public void cancelarCadastro(){
		alerta = new Alerta();
		cadastro = Boolean.FALSE;
	}
	
	public void cadastrar(){
		alertas.add(alerta);
	}

	public List<Alerta> getAlertas() {
		Alerta alerta =  new Alerta();
		alerta.setData(new Date());
		alerta.setDescricao("Regar");
		alertas.add(alerta);
		
		return alertas;
	}

	public void setAlertas(List<Alerta> alertas) {
		this.alertas = alertas;
	}

	public Alerta getAlerta() {
		return alerta;
	}

	public void setAlerta(Alerta alerta) {
		this.alerta = alerta;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}
	
}
