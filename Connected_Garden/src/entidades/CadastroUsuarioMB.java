package entidades;

import java.awt.Desktop;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




@SessionScoped
@ManagedBean(name="cadastroUsuarioMB")
public class CadastroUsuarioMB {

	private static final String CADASTRO = "/cadastroUsuario";
	private static final String SERVIDOR = "http://leao.lasic.ufrn.br/~labisic/teste/form.php?msg=";
	
	private Usuario user;
	private String senha1;
	private String senha2;
	private String msg;
	
	public CadastroUsuarioMB(){
		reset();
	}
	
	public void reset(){
		user = new Usuario();
		senha1="";
		senha2="";
	}
	
	public String iniciarCadastro(){
		reset();		
		return CADASTRO;
	}
	
	public String cadastrar(){
		
		msg = SERVIDOR + "CADASTRO_USUARIO" + "_1_" +
						user.getNome() + "_1_" +
						user.getNick() + "_1_" +
						user.getEmail() + "_1_" +
						user.getLogin() + "_1_" +
						user.getSenha();
								
		
		return msg;
	}

      
    public void enviar() {  
        Desktop desk = java.awt.Desktop.getDesktop();       
        try {      
            desk.browse(new java.net.URI(cadastrar()));      
        } catch (Exception e) {      
            e.printStackTrace();      
        }     
    }

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public String getSenha1() {
		return senha1;
	}

	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	} 
	
}
