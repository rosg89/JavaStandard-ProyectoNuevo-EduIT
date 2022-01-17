package com.educacionit.test;

import com.educacionit.clase3.Pasajero;
import com.educacionit.clase3.Vuelo;
import com.educacionit.clase3.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("Invoco constructor 1");
		Vuelo v1 = new Vuelo();
		System.out.println("Invoco constructor 2");
		Vuelo v2 = new Vuelo('A');
		System.out.println("Invoco constructor 3");
		Vuelo v3 = new Vuelo(747);
		*/
		
		
		VueloCarga vc = new VueloCarga();
		vc.agregarPaquete(1, 2, 3);
		System.out.println(vc.espacioDeCargaUsado);
		vc.agregarPaquete(10, 2000, 5);
		System.out.println(vc.espacioDeCargaUsado);
		
	
		Pasajero sergio = new Pasajero();
		sergio.setNombre("Sergio");
		Pasajero rocio = new Pasajero();
		rocio.setNombre("Rocio");
		Vuelo f = new VueloCarga();
		
		vc.agregarPasajeros(sergio);
		vc.agregarPasajeros(rocio);
		
		f.agregarPasajeros(sergio);
		f.agregarPasajeros(rocio);
		
		
		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		

	}

}
