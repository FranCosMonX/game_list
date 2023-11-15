package com.francosmonx.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francosmonx.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	//lembrando: pode ser implementado "na mao", mas este projeto está usando o que o JPA já nos da
}
