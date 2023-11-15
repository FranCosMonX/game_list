package com.francosmonx.gamelist.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francosmonx.gamelist.dto.GameDTO;
import com.francosmonx.gamelist.dto.GameListDTO;
import com.francosmonx.gamelist.dto.GameMinDTO;
import com.francosmonx.gamelist.services.GameListService;
import com.francosmonx.gamelist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAllListGames(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
