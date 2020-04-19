package com.uca.capas.tarea.controller;

import java.time.LocalDate;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/estudiante")
	public @ResponseBody String tarea() {
		String nombre = "Francisco";
		String apellido = "Molina";
		String carnet = "00300917";
		String carrera = "Ingenieria Informatica";
		String nivel = "Cuarto año";
		
		return "Nombre: " + nombre + "<br/>Apellido: " + apellido + "<br/>Carnet: " + carnet +
				"<br/>Carrera: " + carrera + "<br/>Nivel: " + nivel;
	}
	
	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest r1, HttpServletRequest r2, HttpServletRequest r3) {
		Integer param = Integer.parseInt(r1.getParameter("dia"));
		Integer param2 = Integer.parseInt(r2.getParameter("mes"));
		Integer param3 = Integer.parseInt(r3.getParameter("anio"));
		
		LocalDate localDate = LocalDate.of(param3, param2, param);
		
		String dia;
		switch (localDate.getDayOfWeek().getValue()) {
			case 7: dia = "Domingo";
			break;
			case 1: dia = "Lunes";
			break;
			case 2: dia = "Martes";
			break;
			case 3: dia = "Miercoles";
			break;
			case 4: dia = "Jueves";
			break;
			case 5: dia = "Viernes";
			break;
			case 6: dia = "Sabado";
			break;
			default: dia= "Ningun dia seleccionado";
			break;
		}
		
		return "El dia seleccionado es: " + dia;	
	}
}
