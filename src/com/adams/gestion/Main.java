package com.adams.gestion;

import java.io.FileWriter; // Import boligrafo que escribe en archivo
import java.io.IOException; // Por si el programa se rompe error
import java.util.ArrayList; // Import creado tras crear ArrayList es el listado para meter a los empleados

// FASE 2. Creo la clase Main que la clase dedé la que arrancare el programa y donde ocurre la magia
// en ella crearé la lista, meyo alos empleados ya con su nombre y lo guardaré en el archivo file
//1. La clase la creo con el método main

public class Main {

	public static void main(String[] args) {

		// 2. Creo el listado con los empleados uso (ArrayList)

		ArrayList<Empleado> plantilla = new ArrayList<>();

		// FASE 4: Ahora empiezo con esta fase 4 y luego continuo ocon la fase 3 mas
		// abajo donde meteré
		// los nombres de los empleados ya que el punto 3 y 4 es fuera del main

		// 1. El main llama al metodó cargar plantilla

		cargarPlantilla(plantilla);

		// 3. Ahora el archivo .txt
		// 4. Para ello uso bloque try-catch

		FileWriter escritor = null;

		try {
			// creo el archivo de "empleados_nomina.txt"

			escritor = new FileWriter("empleados_nomina.txt");

			// 2. Ahora recorro el listado uno a uno

			for (Empleado e : plantilla) {

				// Aunque no entra en examen añado esta linea para ver cppor consola

				System.out.println(e.obtenerDetalles());

				// Escribo lo que me diga el método obtenerDetalles()

				escritor.write(e.obtenerDetalles() + "\n"); // Este es para mi archivo de papel
			}

			System.out.println(" ¡Archivo guardado con éxito! ");

		} catch (IOException error) {

			// Si algo sale mal aviso

			System.out.println(" ¡Vaya! Hubo un problema con el archivo. ");

		} finally { // Es obloigatorio de hacer

			// Ahora cierro el boligrafo

			try {

				if (escritor != null) {
					escritor.close(); // Este es el paso mas importante para cerrar bien el programa.

				}

			} catch (IOException errorCerrando) {

				System.out.println(" No pudo cerrar el archivo ");

			}
		}

	}

	// Fuera del main me quedan cosas de la Fase 3

	// Metodo que mete a los 3 programadores en la lista

	public static void cargarPlantilla(ArrayList<Empleado> lista) {

		lista.add(new Programador(" Nieves Garoz", 500.0));
		lista.add(new Programador(" Pepe Grillo ", 400.0));
		lista.add(new Programador(" Bill Gates ", 1000.0));
	}

}
