package model;

import javax.persistence.*;

@Entity
public class Avaliacao {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idAvaliacao;
@Column
private int idCand;
@Column
private int idJur;
@Column
private int postura;
@Column
private int charme;
@Column
private int simpatia;
@Column
private int desenvoltura;
@Column
private int elegancia;
@Column
private int trajePrimavera;
@Column
private int trajeGala;

public int getId() {
	return idCand;
}
public void setId(int idAvaliacao) {
	this.idAvaliacao = idAvaliacao;
}

public int getIdCand() {
	return idCand;
}
public void setIdCand(int idCand) {
	this.idCand = idCand;
}

public int getIdJur() {
	return idJur;
}

public void setIdJur(int idJur) {
	this.idJur = idJur;
}

public int getPostura() {
	return postura;
}

public void setpostura(int postura) {
	this.postura = postura;
}

public int getCharme() {
	return postura;
}

public void setCharme(int charme) {
	this.charme = charme;
}

public int getSimpatia() {
	return simpatia;
}

public void setSimpatia(int Simpatia) {
	this.simpatia = Simpatia;
}

public int getElegancia() {
	return elegancia;
}

public void setElegancia(int Elegancia) {
	this.elegancia = Elegancia;
}

public int getTrajePrimavera() {
	return trajePrimavera;
}

public void setTrajePrimavera(int TrajePrimavera) {
	this.trajePrimavera = TrajePrimavera;
}

public int getTrajeGala() {
	return trajeGala;
}

public void setTrajeGala(int TrajeGala) {
	this.trajeGala = TrajeGala;
}
}
