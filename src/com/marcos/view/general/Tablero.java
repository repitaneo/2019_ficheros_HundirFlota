package com.marcos.view.general;

public class Tablero {

	
	private final int FILAS_COLUMNAS = 5;
	private int datos[][];
	
	
	public Tablero() {
		
		datos = new int[FILAS_COLUMNAS][FILAS_COLUMNAS];
	}
	
	
	
	
	
	
	
	
	
	
	public void setTocado(int fila,int columna) {
		
		datos[fila][columna] = 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void print() {
		
		System.out.print("  ");
		for (int j=0;j<FILAS_COLUMNAS;j++) {
			System.out.print(j+1+ " ");
		}			
		System.out.println();

		for (int i=0;i<FILAS_COLUMNAS;i++) {
			switch(i) {
				case 0: System.out.print("A "); break; 
				case 1: System.out.print("B "); break;
				case 2: System.out.print("C "); break;
				case 3: System.out.print("D "); break;
				case 4: System.out.print("E "); break;
			}
			
			for (int j=0;j<FILAS_COLUMNAS;j++) {
				
				if(datos[i][j]==0) {
					System.out.print("  ");
				}
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
