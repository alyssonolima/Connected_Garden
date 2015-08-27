package entidades;



import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vaso")
public class Vaso {

	
	private long id;
	
	private String descricao;
	
	private String mac1;
	
	private String mac2;
	
	private int temp;
	
	private int umidSolo;

	private int umidAr;
	
	private int luz;
	
	private int bomba;
	
	private int bombaAT;
	
	private int ativo;

	public Vaso(){}
	
	public Vaso(String descricao){		
		this.descricao = descricao;
		this.id = 0;
		this.mac1 = "00:00:00:00:00:00";
		this.mac2 = "00:00:00:00:00:00";
		this.temp = 0;
		this.umidSolo = 0;
		this.umidAr = 0;
		this.luz = 0;
		this.bomba = 0;
		this.bombaAT = 0;
		this.ativo = 1;		
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
	
	public String getMac1() {
		return mac1;
	}

	public void setMac1(String mac1) {
		this.mac1 = mac1;
	}

	public String getMac2() {
		return mac2;
	}

	public void setMac2(String mac2) {
		this.mac2 = mac2;
	}

	public int getBomba() {
		return bomba;
	}

	public void setBomba(int bomba) {
		this.bomba = bomba;
	}

	public int getBombaAT() {
		return bombaAT;
	}

	public void setBombaAT(int bombaAT) {
		this.bombaAT = bombaAT;
	}

	public int getTemp() {
		return this.temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getUmidSolo() {
		return this.umidSolo;
	}
	public void setUmidSolo(int umidSolo) {
		this.umidSolo = umidSolo;
	}
	public int getUmidAr() {
		return this.umidAr;
	}
	public void setUmidAr(int umidAr) {
		this.umidAr = umidAr;
	}
	public int getLuz() {
		return luz;
	}
	public void setLuz(int luz) {
		this.luz = luz;
	}
	public int getAtivo() {
		return ativo;
	}
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

}




