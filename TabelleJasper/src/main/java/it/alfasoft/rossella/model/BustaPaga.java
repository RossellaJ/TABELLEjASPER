package it.alfasoft.rossella.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class BustaPaga {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id_busta;
	
	//private Dipendente dipendente;
	private String nome;
	private String dataEmissione;
	private double importo;
	
	public BustaPaga(){
		
	}

//	public BustaPaga(long id_busta, Dipendente dipendente, String dataEmissione, double importo) {
//		
//		this.dipendente = dipendente;
//		this.dataEmissione = dataEmissione;
//		this.importo = importo;
//	}

	public BustaPaga(String nome, String dataEmissione, double importo) {
		super();
		this.nome = nome;
		this.dataEmissione = dataEmissione;
		this.importo = importo;
	}

	public long getId_busta() {
		return id_busta;
	}

	public void setId_busta(long id_busta) {
		this.id_busta = id_busta;
	}

//	public Dipendente getDipendente() {
//		return dipendente;
//	}
//
//	public void setDipendente(Dipendente dipendente) {
//		this.dipendente = dipendente;
//	}

	public String getDataEmissione() {
		return dataEmissione;
	}

	public void setDataEmissione(String dataEmissione) {
		this.dataEmissione = dataEmissione;
	}

	public double getImporto() {
		return importo;
	}

	public void setImporto(double importo) {
		this.importo = importo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
//	public boolean isValid() {
//
//		boolean res=false;
//		if(dipendente!=null && 
//				!dataEmissione.isEmpty() && dataEmissione!=null &&
//				importo!=0) {
//			
//			res=true;
//		}
//		
//		return res;
//}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
