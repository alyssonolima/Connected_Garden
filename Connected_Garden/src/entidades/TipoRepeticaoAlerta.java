package entidades;

public class TipoRepeticaoAlerta {

	public static final long NENHUMA = 0;
		
	public static final long DIARIAMENTE = 1;
	
	public static final long SEMANALMENTE = 2;
	
	public static final long MENSALMENTE = 3;
	
	public static final long ANUALMENTE = 4;
	
	private long id;
	
	private String descricao;

	public void inicializar(){
		id=0l;
		descricao = new String();
	}
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
