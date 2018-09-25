package model;

import javax.persistence.*;

@Entity
public class Jurados {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int idJur;
@Column
private String nome;
@Column
private String senha;

public int getId() {
	return idJur;
}
public void setId(int idJur) {
	this.idJur = idJur;
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
