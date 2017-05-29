package com.springdb.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdb.beans.Jugador;
import com.springdb.dao.DAOJugador;

@Repository
public class DAOJugadorImpl implements DAOJugador{

	@Autowired
	private DataSource dataSource;

	
	public void registrar(Jugador jugador) throws Exception {
		String sql = "INSERT INTO jugador (id, nombre,idequipo,idcamiseta) values (?, ? , ?, ?) ";
		Connection con = null;
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, jugador.getId());
			ps.setString(2, jugador.getNombre());
			ps.setInt(3, jugador.getEquipo().getId());
			ps.setInt(4, jugador.getCamiseta().getId());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			throw e;
		}finally{
			if(con != null){				
				con.close();
			}
		}
		
	}



}
