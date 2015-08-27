package entidades;

public class Usuario {
	
	private String nome;
	private String nick;
	private String email;
	private String login;
	private String senha;
	
	public Usuario(){
		init();
	}
	
	public void init(){
		nome="";
		nick="";
		email="";
		login="";
		senha="";		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
