package com.francosmonx.gamelist.controllers;
//porta de entrada para o backend

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.francosmonx.gamelist.dto.GameMin;
import com.francosmonx.gamelist.entities.Game;
import com.francosmonx.gamelist.services.GameService;

//fazendo o mapeamento

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	//controller injeta service >> injeta repository (camadas)
	@Autowired
	private GameService gameService;
	
	//endpoint para obter/resgatar
	@GetMapping
	public List<GameMin> findAll(){
		List<GameMin> result = gameService.findAll();
		return result;
	}
}
