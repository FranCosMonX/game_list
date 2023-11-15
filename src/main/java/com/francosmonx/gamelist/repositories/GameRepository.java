package com.francosmonx.gamelist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.francosmonx.gamelist.entities.Game;
import com.francosmonx.gamelist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	//nativeQuery = true >> informa que o código é SQL e não JPQL (linguagem de consulta da jpa)
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId); //o resulltado da consulta é uma interface Projection
}