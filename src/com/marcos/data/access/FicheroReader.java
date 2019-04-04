package com.marcos.data.access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.marcos.data.conversion.DataConverter;
import com.marcos.view.general.Tablero;

public class FicheroReader {

	
	private static String FICHERO = "datos.txt";
	private Tablero tablero;
	
	
	
	
	
	
	public FicheroReader() {
		
		tablero = new Tablero();
	}
	
	
	
	
	
	/**
	 * Lee los datos del fichero y los traslada a un ArrayList
	 * @return el Arraylist con los datos leidos y trasnformados en Posicion
	 */
	public ArrayList<Posicion> getDatos() {
		
		// el arrayList que pretendo devolver
        ArrayList<Posicion> datos = new ArrayList<Posicion>();

        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
 
            // leo una linea del fichero          
            String linea=ficheroEntrada.readLine();
            
            // mientras que las lineas existan
            while(linea!=null){
            	
            	// obtenemos la fila y columna de la linea leida 
            	int fila = DataConverter.filaConverter(linea.charAt(0));
            	int columna = DataConverter.columnaConverter(Integer.parseInt(linea.substring(1)));

            	// creamos los objetos posicion
            	Posicion posicion = new Posicion();
            	posicion.setFila(fila);
            	posicion.setColumna(columna);

            	// añadimos al arraylist
            	datos.add(posicion);

            	// volvemos a leer una linea
            	linea=ficheroEntrada.readLine();
            }           
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // devolvemos el arraylist generado
        return datos;
		
	}
	
}
