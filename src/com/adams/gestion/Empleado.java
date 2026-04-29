package com.adams.gestion;

/*
 * Me acaban de contratar como programadora en gran consultora tecnológica. Mi primera
 * misión será desarrollar un sistema de gestión para la plantilla de empleados. Tendré
 * que organizar a estos y guardar la información para que no se pierda en un archivo.
 * Lo primero que he hecho es crear un proyecto al que he llamado ExamenProgramacion
 * luego un paquete para tener todo recogido,  a este le he llamado com.adams.gestion y la 
 * clase empleado que es una clase abstracta que significa que sabemos que todos los 
 * tabajadores tienen nombre, pero no sabemos ni lo que cobrán ni su trabajo.
 * 28-04-2026
 */

// FASE 1. LOS CIMIENTOS Y EL CONTRATO

//1. clase abstract es la superclase ya que es la clase modelo general y la clase padre 

public abstract class Empleado {

//2. Para el empleado voy a usar un atributo privado para que nadie lo pueda cambiar

	private String nombre;

	// 3. Ahora voy crear el constructor completo con sus Gettes y Setters y un
	// metodo abstracto público
	// llamado obtenerDetalles() que devolverá un String.
	// Aquí nace el empleado y le pongo nombre

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	// Ahora los Getters y Setters son las puertas para ver o cambiar el nombre

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// Ahora el método abstracto
	// Todo emoleado tendrá que decir sus detalles pero cada uno a su manera

	public abstract String obtenerDetalles();

}
