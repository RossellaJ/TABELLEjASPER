package it.alfasoft.rossella.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Dipendente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String nome;
	private String cognome;
	private int eta;
	private Date dataNascita;
	private Blob foto;
	
	
	
	
	
	public Dipendente() {
		
	}





	public Dipendente(String nome, String cognome, int eta, Date dataNascita) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.dataNascita = dataNascita;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getCognome() {
		return cognome;
	}





	public void setCognome(String cognome) {
		this.cognome = cognome;
	}





	public int getEta() {
		return eta;
	}





	public void setEta(int eta) {
		this.eta = eta;
	}





	public Date getDataNascita() {
		return dataNascita;
	}





	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}





	public Blob getFoto() {
		return foto;
	}





	public void setFoto(Blob foto) {
		this.foto = foto;
	}
	
	
	
	
	

}
