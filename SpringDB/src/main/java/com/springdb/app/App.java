package com.springdb.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdb.beans.*;
import com.springdb.service.*;

/**
 * Hello world!
 * Samir
 * rere
 */
public class App 
{
	
	
	
	
    public static void main( String[] args )
    {
    	
       Marca marca1 = new Marca();
       marca1.setId(2);
       marca1.setNombre("Adidas");
       
       Equipo equipo1 = new Equipo();
       equipo1.setId(3);
       equipo1.setNombre("Manchester");
       
       Camiseta camiseta1 = new Camiseta();
       camiseta1.setId(4);
       camiseta1.setMarca(marca1);
       camiseta1.setNumero("10");
       
       Jugador jugador1 = new Jugador();
       jugador1.setId(8);
       jugador1.setNombre("Luis Perez");
       jugador1.setEquipo(equipo1);
       jugador1.setCamiseta(camiseta1);
       
       
       ApplicationContext appContext =
    		   //new ClassPathXmlApplicationContext("com/springdb/xml/beans.xml");
    		   new ClassPathXmlApplicationContext("com/springdb/xml/beansPlaceholder.xml");
       
       ServiceJugador sj = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
       try{
    	   sj.registrar(jugador1);
    	   
       }catch(Exception e){
    	   System.out.println(e.getMessage());
    	   
       }
       
       
    }
}
