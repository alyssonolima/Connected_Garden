package entidades;

import java.util.Date;

public class Alerta {

	private long id;
	
	private String descricao;
	
	private Date data;
	
	private TipoRepeticaoAlerta repeticao;
	
	public void inicializar(){
		id = 0l;
		descricao = new String();
		data = new Date();
		repeticao =  new TipoRepeticaoAlerta();
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoRepeticaoAlerta getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(TipoRepeticaoAlerta repeticao) {
		this.repeticao = repeticao;
	}
	
}
