package com.francosmonx.gamelist.services;
//nome padronizado : entidade + componente
//cada funcionalidade pode ter sua regra de negocio complexa, o que ficaria dificil de gerencia se estivesse tudo em "repositories" ou no "controller"

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francosmonx.gamelist.dto.GameMin;
import com.francosmonx.gamelist.entities.Game;
import com.francosmonx.gamelist.repositories.GameRepository;

//componentes em string pode ser criada usando a anotacao Component ou Service
@Service
public class GameService {
	
	//injetando um Game repository em GameService (estrutura em camadas) 
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMin> findAll(){
		var result = gameRepository.findAll(); //gera uma consulta no B.D. e traz uma llista de games
		List<GameMin> dto = result.stream().map(x -> new GameMin(x)).toList();
		return dto;
	}
}
