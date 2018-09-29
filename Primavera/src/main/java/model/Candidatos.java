package model;

import javax.persistence.*;

@Entity
@Table(name="tbCandidatos")
public class Candidatos {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idCand;
@Column
private String nome;
@Column
private String turma;
@Column
private boolean sexo;

public int getId() {
	return idCand;
}
public void setId(int idCand) {
	this.idCand = idCand;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

public String getTurma() {
	return turma;
}
public void setTurma(String turma) {
	this.turma = turma;
}

public boolean getSexo() {
	return sexo;
}

public void setSexo(Boolean sexo) {
	this.sexo = sexo;
}
}
