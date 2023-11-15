package com.francosmonx.gamelist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//liga game a gamelist que, por sua vez, possui um relacionamento n para n criando esta classe
//a chave primaria são as duas chaves estrangeiras e tem de ser representadas por apenas um Objeto, como pode ser visto no GameRepository

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	//tem a referencia de game  e gamelist
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	private Integer position;
	
	public Belonging() {}
	
	//comentario pode estar errado
	//como o relacionamento desta tabela e de muitos para um com as tabelas game e list, é importante que seja inluído nesta para que seja posicionada em amdas as tabelas simultaneamente
	public Belonging(Game game, GameList list, Integer position) {
		this.id.setGame(game);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
