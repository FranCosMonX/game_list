package com.francosmonx.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.francosmonx.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
