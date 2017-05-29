package com.springdb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdb.beans.Marca;
import com.springdb.dao.DAOMarca;
import com.springdb.service.ServiceMarca;

@Service
public class ServiceMarcaImpl implements ServiceMarca{

	@Autowired
	private DAOMarca daoMarca;
	
	public void registrar(Marca marca) throws Exception {
		
		try{
			daoMarca.registrar(marca);
		}catch(Exception e){
			throw e;
		}
		
	}

}
