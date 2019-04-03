package com.marcos.data.access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.marcos.data.conversion.DataConverter;
import com.marcos.view.general.Tablero;

public class FicheroReader {

	
	private static String FICHERO = "datos.txt";
	private Tablero tablero;
	
	
	
	
	
	
	public FicheroReader() {
		
		tablero = new Tablero();
	}
	
	
	
	
	
	
	public void leer() {
		
		try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
 
            // leo una linea del fichero          
            String linea=ficheroEntrada.readLine();
            while(linea!=null){
            	
            	int fila = DataConverter.filaConverter(linea.charAt(0));
            	int columna = DataConverter.columnaConverter(Integer.parseInt(linea.substring(1)));
            	
            	tablero.setTocado(fila,columna);		

            	linea=ficheroEntrada.readLine();
            	
            }           
 
            ficheroEntrada.close();
            tablero.print();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
}
