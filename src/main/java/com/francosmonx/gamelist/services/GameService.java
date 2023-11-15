package com.francosmonx.gamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.francosmonx.gamelist.dto.GameDTO;
import com.francosmonx.gamelist.dto.GameMinDTO;
import com.francosmonx.gamelist.entities.Game;
import com.francosmonx.gamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//garantir que seja respeitado os principios das transações - ACID
	//arg : Operação de leitura
	@Transactional(readOnly = true)
	public GameDTO FindById(Long id) {
		//gameRepository.findById(id) retornar um Optional.
		//teria que ter um tratamento de exceções para caso o id não exista
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	//garantir que seja respeitado os principios das transações - ACID
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
