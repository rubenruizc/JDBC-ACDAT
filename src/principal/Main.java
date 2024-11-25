package principal;

import java.util.List;

import dal.AccesoDatos;
import ent.Persona;

public class Main {
	public static void main(String[] args) {
		// Obtención de una lista de personas que cumplen las siguientes condiciones:
	    // - El estado civil es "casado".
	    // - La edad está entre 25 y 35 años.
	    // - El nombre contiene la letra "a".
	    // - El apellido termina con "z".
		listadoPersonalizado();

	}

	public static void insertar() {
		AccesoDatos.creacionTablaPersona();
		AccesoDatos.insertarPersonas();
	}

	public static void listadoOrdenadoPorEdad() {
		List<Persona> personas = AccesoDatos.getPersonasEx("*", "edad", "");

		pintaTablaCompleta(personas, "PERSONAS ORDENADAS POR LA EDAD");
	}

	public static void listadoNombreApellidoOrdenadoApellido() {
		List<Persona> personas = AccesoDatos.getPersonasEx("nombre, apellido", "apellido", "");

		pintaTablaNombreApellidos(personas, "ORDENADO POR APELLIDO");
	}

	public static void listadoNombreApellidoOrdenadoEdad() {
		List<Persona> personas = AccesoDatos.getPersonasEx("nombre, apellido", "", "edad > 30");

		pintaTablaNombreApellidos(personas, "ORDENADO POR EDAD");
	}

	public static void listadoNombreEmpiezaJOrdenadoApellido() {
		List<Persona> personas = AccesoDatos.getPersonasEx("nombre", "apellido", "nombre like 'J%'");

		System.out.println("\t\tNombres por J");
		System.out.println("----------------------------------------");
		for (Persona persona : personas) {
			System.out.println(persona.getNombre());
			System.out.println("----------------------------------------");
		}
	}

	public static void getMediaEdad() {
		double media = AccesoDatos.getMediaEdad("AVG(Edad)", "", "");
		System.out.println("La edad media son: " + media + " años");
	}

	public static void listadoApellidosOhMa() {
		List<Persona> personas = AccesoDatos.getPersonasEx("apellido", "",
				"apellido like '%oh%' or apellido like '%ma%'");

		System.out.println("\t\tApellidos que contienen oh o ma");
		System.out.println("----------------------------------------");
		for (Persona persona : personas) {
			System.out.println(persona.getApellido());
			System.out.println("----------------------------------------");
		}
	}

	public static void listadoPersonas24y32() {
		List<Persona> personas = AccesoDatos.getPersonasEx("*", "", "edad between 24 and 32");

		pintaTablaCompleta(personas, "PERSONAS ENTRE 24 Y 32 AÑOS");
	}

	private static void listadoPersonasMas65() {
		List<Persona> personas = AccesoDatos.getPersonasEx("*", "", "edad > 65");

		pintaTablaCompleta(personas, "PERSONAS MÁS DE 65 AÑOS");
	}

	private static void listadoPersonalizado() {
	    // Obtención de una lista de personas que cumplen las siguientes condiciones:
	    // - El estado civil es "casado".
	    // - La edad está entre 25 y 35 años.
	    // - El nombre contiene la letra "a".
	    // - El apellido termina con "z".
	    List<Persona> personasFiltradas = AccesoDatos.getPersonasEx(
	            "*", 
	            "apellido",
	            "(estado_civil like 'casado') and (edad between 25 and 35) and (nombre like '%a%') and (apellido like '%z')"
	    );

	    // Llamada a un método para mostrar los resultados en forma de tabla
	    // con un encabezado que describe los filtros aplicados.
	    pintaTablaCompleta(
	            personasFiltradas, 
	            "PERSONAS CASADAS ENTRE 25 Y 35 AÑOS\n" 
	            + " ".repeat(20) + "SU NOMBRE CONTIENE LA LETRA 'A'\n" 
	            + " ".repeat(20) + "Y SU APELLIDO TERMINA EN 'Z'"
	    );
	}
	

	public static void pintaTablaCompleta(List<Persona> personas, String titulo) {
		// Título centrado
		System.out.println("\n" + " ".repeat(20) + titulo);
		System.out.println("=".repeat(60));

		// Encabezados
		System.out.printf("| %-5s | %-15s | %-15s | %-5s |%n", "ID", "Nombre", "Apellido", "Edad");
		System.out.println("-".repeat(60));

		// Filas de datos
		for (Persona persona : personas) {
			System.out.printf("| %-5d | %-15s | %-15s | %-5d |%n", persona.getId(), persona.getNombre(),
					persona.getApellido(), persona.getEdad());
		}

		// Pie de tabla
		System.out.println("=".repeat(60));
		System.out.printf("Total de personas: %d%n", personas.size());
	}

	public static void pintaTablaNombreApellidos(List<Persona> personas, String titulo) {
		// Título centrado
		System.out.println("\n" + " ".repeat(20) + titulo);
		System.out.println("=".repeat(60));

		// Encabezados
		System.out.printf("| %-25s | %-25s |%n", "Nombre", "Apellido");
		System.out.println("-".repeat(60));

		// Filas de datos
		for (Persona persona : personas) {
			System.out.printf("| %-25s | %-25s |%n", persona.getNombre(), persona.getApellido());
		}

		// Pie de tabla
		System.out.println("=".repeat(60));
		System.out.printf("Total de personas: %d%n", personas.size());
	}

}