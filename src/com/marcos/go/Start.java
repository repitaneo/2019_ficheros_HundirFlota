package com.marcos.go;

import java.util.ArrayList;

import com.marcos.data.access.FicheroReader;
import com.marcos.data.access.Posicion;
import com.marcos.view.general.Tablero;

public class Start {

	
	public static void main (String [ ] args) {


		FicheroReader fr = new FicheroReader();
		Tablero tablero = new Tablero();
		

		ArrayList<Posicion> datos = fr.getDatos();
		tablero.setDatosTocados(datos);
		
		tablero.print();
		
		
		

		

	}	
}
