package com.adams.gestion;

//1. Ahora creo la clase hijo Programador que va heredar de la clase padre Empleado

// añado extends  a la clase programador eso quiere decir que hereda de epmpleado 

public class Programador extends Empleado {

	// Añado el atributo privado bono (double) esta es un extra.

	private double bono;

	// Ahora el constructor completo
	// Recibe el nombre y el bono

	public Programador(String nombre, double bono) {
		super(nombre); // Le envío el nombre al padre
		this.bono = bono;
	}

	// Aquí cumplo la promesa que hice en la clase epmleado, sobreescribo el método

	@Override
	public String obtenerDetalles() {
		double sueldoBase = 1250.0;
		double sueldoTotal = sueldoBase + bono;

		// Esto me devuelve el texto solicitado en el examen

		return "Programador: " + getNombre() + "- Sueldo: " + sueldoTotal + " € ";

	}

}
