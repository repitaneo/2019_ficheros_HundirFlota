package com.marcos.data.conversion;

import com.marcos.errors.FormatNotFoundException;

public class DataConverter {

	
	/**
	 * Convierte filas, representadas por letras A, B, C, ... en 
	 * 0, 1, 2, ... para un array
	 * @param fila el char a convertir
	 * @return el int que se corresponde con la tabla
	 * @throws FormatNotFoundException cuando no le cuadra la letra porque este algoritmo
	 * solamente contempla desde la A hasta la E
	 */
	public static int filaConverter(char fila) throws FormatNotFoundException {
		
		switch(fila) {
		
			case 'a':
			case 'A': return 0;
				
			case 'b':
			case 'B': return 1;
			
			case 'c':
			case 'C': return 2;
			
			case 'd':
			case 'D': return 3;
		
			case 'e':
			case 'E': return 4;
			
			default: throw new FormatNotFoundException();
		}
	}
	
	
	
	
	
	/**
	 * Convierte filas, representadas por letras 1, 2, 3, ... en 
	 * 0, 1, 2, ... para un array
	 * @param columna el int a convertir
	 * @return el int que se corresponde con la tabla
	 * @throws FormatNotFoundException cuando no le cuadra la columna porque este algoritmo
	 * solamente contempla desde el 1 hasta el 5
	 */
	public static int columnaConverter(int columna) throws FormatNotFoundException {
		
		if((columna>=1)&&(columna<=5)) {
			
			return columna-1;
		}
		else throw new FormatNotFoundException();
	}
		
	
}
