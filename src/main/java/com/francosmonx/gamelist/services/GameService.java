package com.francosmonx.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francosmonx.gamelist.dto.GameMin;
import com.francosmonx.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMin> findAll(){
		var result = gameRepository.findAll();
		List<GameMin> dto = result.stream().map(x -> new GameMin(x)).toList();
		return dto;
	}
}
