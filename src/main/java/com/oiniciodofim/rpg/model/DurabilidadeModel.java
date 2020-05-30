package com.oiniciodofim.rpg.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_durabilidade")
public class DurabilidadeModel {

	private Integer id_durabilidade;
	private String descricao;

	public DurabilidadeModel() {
	}

	public DurabilidadeModel(Integer id_durabilidade, String descricao) {
		this.id_durabilidade = id_durabilidade;
		this.descricao = descricao;
	}

	public Integer getId_durabilidade() {
		return id_durabilidade;
	}

	public void setId_durabilidade(Integer id_durabilidade) {
		this.id_durabilidade = id_durabilidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "DurabilidadeModel [descricao=" + descricao + "]";
	}

}
