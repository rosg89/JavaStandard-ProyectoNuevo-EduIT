package com.educacionit.clase3;

//Clase padre
public class Vuelo {
	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean [] asientosDisponibles;
	
	
	
	//Inicializador de bloque
	//Se ejecuta en los contructores
	{
		//Disponibilizador de butacas
		asientosDisponibles = new boolean [150];
		for (int i = 0; i < asientosDisponibles.length; i++) {
			 asientosDisponibles[i] = true;
			 //System.out.println("Estamos disponibilizando la butaca " + (i+1));
		}
	}
	
	
	//Constructores
	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
	}
	
	public Vuelo(int numVuelo) {
	}


	
	
	//Metodos
	public void agregarPasajeros (Pasajero p1) {
		if (asientoDisponible()) {
			pasajeros++;
			System.out.println("Subimos al pasajero " + p1.getNombre());
		}else  {
			faltaAsiento();
		}
		
		
	}
	
	public void faltaAsiento() {
		System.out.println("No tenemos suficientes asientos");
	}
	
	public boolean asientoDisponible() {
		//Valida que el numero de pasajeros sean menos que los asientos
		return pasajeros<getAsiento();
	}
	
	public int getAsientos() {
		return getAsiento();
	}
	
	public int getAsiento() {
		return 150;//Cantidad de asientos
	}
	

	
	
	
	
	
}
