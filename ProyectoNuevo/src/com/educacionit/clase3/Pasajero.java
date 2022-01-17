package com.educacionit.clase3;

public class Pasajero {
	private int bolsos;
	private int bolsosPagos;
	private double tarifaXbolso;
	private double totalPagar;
	private int totalEquipaje;
	private String Nombre;
	
	//Constructor vacio
	public Pasajero () {
		
	}

	//Constructor 2 con un parametro que llama al constructor privado
	public Pasajero (int bolsos) {
		this(bolsos > 1 ? 50.0d : 25.0d); //Operador ternario
		this.bolsos = bolsos;
		totalPagar = bolsos * tarifaXbolso;
		totalEquipaje = bolsos;
	}

	//Constructor 3 con dos parametros. Llama al constructor dos que a su vez llama al constructor privado
	public Pasajero (int bolsos, int bolsosPagos) {
	
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalPagar = bolsos * tarifaXbolso;
		
	}
	
    //Constructor 4 privado
	private Pasajero (double tarifaXbolso) {
	this.tarifaXbolso = tarifaXbolso;
	}

	
	//Getter
	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaXbolso() {
		return tarifaXbolso;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}
	
	
	//Getter y Setter
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
	public static void mostrarListaDePasajeros(Pasajero listaPasajeros[]) {
		for (Pasajero p1 : listaPasajeros) {
			System.out.println("**********");
			System.out.println("Pasajero tarifa por Bolso: " + p1.getTarifaXbolso());
			System.out.println("Pasajero total a pagar: " + p1.getTotalPagar());
			System.out.println("Pasajero total de bolsos: " + p1.getTotalEquipaje());
		}
	}
	
	
	
	
	

	
}
