package com.francosmonx.gamelist.projections;

public interface GameMinProjection {
	//colocar metodos gets correspondente a consulta sql
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
