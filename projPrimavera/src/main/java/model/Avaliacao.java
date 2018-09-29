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
private String postura;
@Column
private String charme;
@Column
private String simpatia;
@Column
private String desenvoltura;
@Column
private String elegancia;
@Column
private String trajePrimavera;
@Column
private String trajeGala;

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

public String getPostura() {
	return postura;
}

public void setpostura(String postura) {
	this.postura = postura;
}

public String getCharme() {
	return postura;
}

public void setCharme(String charme) {
	this.charme = charme;
}

public String getSimpatia() {
	return simpatia;
}

public void setSimpatia(String Simpatia) {
	this.simpatia = Simpatia;
}

public String getDesenvoltura() {
	return desenvoltura;
}

public void setDesenvoltura(String Desenvoltura) {
	this.desenvoltura = Desenvoltura;
}

public String getElegancia() {
	return elegancia;
}

public void setElegancia(String Elegancia) {
	this.elegancia = Elegancia;
}

public String getTrajePrimavera() {
	return trajePrimavera;
}

public void setTrajePrimavera(String TrajePrimavera) {
	this.trajePrimavera = TrajePrimavera;
}

public String getTrajeGala() {
	return trajeGala;
}

public void setTrajeGala(String TrajeGala) {
	this.trajeGala = TrajeGala;
}
}
