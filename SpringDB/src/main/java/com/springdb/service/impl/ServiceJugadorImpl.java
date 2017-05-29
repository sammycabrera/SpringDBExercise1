package com.springdb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdb.beans.Jugador;
import com.springdb.dao.DAOJugador;
import com.springdb.service.ServiceJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador{

	@Autowired
	private DAOJugador daoJugador;
	
	public void registrar(Jugador jugador) throws Exception {
		
		try{
			daoJugador.registrar(jugador);
		}catch(Exception e){
			throw e;
		}
		
	}

}
