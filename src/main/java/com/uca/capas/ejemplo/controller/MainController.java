package com.uca.capas.ejemplo.controller;


import java.time.DayOfWeek;
import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

	@RequestMapping("/nombre")
	public @ResponseBody String ejemplo() {
		String nombre = "Ruben ";
		String apellido = "Siguenza "; 
		String carnet = "00068817 ";
		String carrera = "ing. informatica ";
		String año = "4to año ";
		return "Nombre: "+nombre +"<br>"+
				"Apellido: "+apellido +"<br>"+
				"Carnet: "+carnet +"<br>"+ 
				"Carrera: "+ carrera +"<br>"+ 
				"Año de carrera: "+ año;
	}
	
	
	@RequestMapping("/fecha")
	public @ResponseBody String parametro(HttpServletRequest request) {
		int day = Integer.parseInt(request.getParameter("dia"));
        int month = Integer.parseInt(request.getParameter("mes"));
        int year = Integer.parseInt(request.getParameter("anio"));
      
        LocalDate date = LocalDate.of(year, month, day);
        String dia = date.getDayOfWeek().toString();
        //return "Dia de la semana: " +date.getDayOfWeek();
        String dayR = "error";
        
        switch(dia) {
        case "SUNDAY":	
        	dayR = "Domingo";
        	break;
        case "MONDAY":	
        	dayR = "Lunes";
        	break;
        case "TUESDAY":	
        	dayR = "Martes";
        	break;
        case "WEDNESDAY":	
        	dayR = "Miercoles";
        	break;
        case "THURSDAY":	
        	dayR = "Jueves";
        	break;
        case "FRIDAY":	
        	dayR = "Viernes";
        	break;
        case "SATURDAY":	
        	dayR = "Sabado";
        	break;
        }
        
        return "El dia es " + dayR;
	}
}
