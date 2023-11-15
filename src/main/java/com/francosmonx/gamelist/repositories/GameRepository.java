package com.francosmonx.gamelist.repositories;
//nome padronizado : entidade + componente
//operações básicas para manipular dados do B.D.

import org.springframework.data.jpa.repository.JpaRepository;

import com.francosmonx.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
