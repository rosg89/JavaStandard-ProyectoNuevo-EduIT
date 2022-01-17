package com.educacionit.clase3;
//Clase hijo que hereda de Vuelo
public class VueloCarga extends Vuelo {
	//Total de asientos
	public int asientos = 12;
	//Pies cubicos de espacio en la bodega
	public float espacioMaximoDeCarga = 1000;
	//Usamos esta variable para ver la cantidad de espacio de bodega
	public float espacioDeCargaUsado;
	
	//Metodo para agregar un paquete a la bodega del avion
	public void agregarPaquete (float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;
		if (espacioDeCargaDisponible(size)) {
			espacioDeCargaUsado += size;
			System.out.println("Ya esta su encomienda a bordo");
		} else {
			faltaDeEspacio();
		}
		
	}
	
	
	
	//Metodo privado que imprime mensaje de falta de espacio
	private void faltaDeEspacio() {
		System.out.println("No tenemos mas espacio");
	}
	
	//Metodo privado para asegurarnos que tenemos suficiente espacio
	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioDeCargaUsado + tamanio <= espacioMaximoDeCarga;
	}
	
	@Override
	public int getAsiento() {
		return 12;
	}

	
	
	
}
