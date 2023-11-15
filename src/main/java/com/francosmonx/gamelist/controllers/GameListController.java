package com.francosmonx.gamelist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francosmonx.gamelist.dto.GameListDTO;
import com.francosmonx.gamelist.dto.GameMinDTO;
import com.francosmonx.gamelist.services.GameListService;
import com.francosmonx.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAllListGames(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	//me retorna um jogo mas é uma ação da lista
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}
