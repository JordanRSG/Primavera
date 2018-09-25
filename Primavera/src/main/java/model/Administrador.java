package model;

import javax.persistence.*;

@Entity
public class Administrador {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idAdm;
@Column
private String nome;
@Column
private String senha;

public int getId() {
	return idAdm;
}
public void setId(int idAdm) {
	this.idAdm = idAdm;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}

}
