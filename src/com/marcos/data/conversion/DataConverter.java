package com.marcos.data.conversion;

import com.marcos.errors.FormatNotFoundException;

public class DataConverter {

	
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
	
	
	
	
	
	
	public static int columnaConverter(int columna) throws FormatNotFoundException {
		
		if((columna>=1)&&(columna<=5)) {
			
			return columna-1;
		}
		else throw new FormatNotFoundException();
	}
		
	
}
