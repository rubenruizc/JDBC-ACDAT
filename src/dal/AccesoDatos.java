package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ent.Persona;

public class AccesoDatos {

	private static String useDB = "USE ad2425_rruiz;";

	/**
	 * Función que obtiene una lista de personas
	 * 
	 * @return Lista de personas
	 */
	private static List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<>();

		personas.add(new Persona(1, "Krispin", "Lexa", 4));
		personas.add(new Persona(2, "Thain", "McArthur", 85));
		personas.add(new Persona(3, "Don", "Budding", 79));
		personas.add(new Persona(4, "Gabriell", "Garmston", 26));
		personas.add(new Persona(5, "Tiler", "Maddox", 61));
		personas.add(new Persona(6, "Sergio", "Swatheridge", 95));
		personas.add(new Persona(7, "Lesya", "Branni", 72));
		personas.add(new Persona(8, "Binky", "Jovicevic", 96));
		personas.add(new Persona(9, "Francois", "Perkin", 10));
		personas.add(new Persona(10, "Ryann", "Geekin", 97));
		personas.add(new Persona(11, "Upton", "Rolley", 90));
		personas.add(new Persona(12, "Sophey", "Cowper", 28));
		personas.add(new Persona(13, "Gracia", "Olivier", 27));
		personas.add(new Persona(14, "Gaylene", "Cudworth", 22));
		personas.add(new Persona(15, "Rey", "Semiras", 70));
		personas.add(new Persona(16, "Jeffrey", "Spence", 59));
		personas.add(new Persona(17, "Grove", "Conneely", 62));
		personas.add(new Persona(18, "Celestyna", "Dale", 81));
		personas.add(new Persona(19, "Mychal", "Veschambes", 55));
		personas.add(new Persona(20, "Toby", "Casetta", 66));
		personas.add(new Persona(21, "Leoline", "Peet", 82));
		personas.add(new Persona(22, "Audrie", "Soule", 49));
		personas.add(new Persona(23, "Gracia", "Goodby", 86));
		personas.add(new Persona(24, "Antony", "Mollen", 87));
		personas.add(new Persona(25, "Ben", "Whiterod", 2));
		personas.add(new Persona(26, "Beck", "Fetherston", 78));
		personas.add(new Persona(27, "Jewell", "Woodburn", 92));
		personas.add(new Persona(28, "Hillary", "Passler", 38));
		personas.add(new Persona(29, "Hakeem", "Halfhide", 3));
		personas.add(new Persona(30, "Bathsheba", "Cushion", 54));
		personas.add(new Persona(31, "Orbadiah", "Matthisson", 46));
		personas.add(new Persona(32, "Stepha", "Hince", 76));
		personas.add(new Persona(33, "Ilyse", "Shewry", 62));
		personas.add(new Persona(34, "Heinrick", "Nevill", 25));
		personas.add(new Persona(35, "Ruthann", "M'Chirrie", 69));
		personas.add(new Persona(36, "Eirena", "Maccaddie", 11));
		personas.add(new Persona(37, "Clarita", "Banker", 22));
		personas.add(new Persona(38, "Carleton", "Lightewood", 68));
		personas.add(new Persona(39, "Galven", "Alywen", 51));
		personas.add(new Persona(40, "Tris", "Coddington", 12));
		personas.add(new Persona(41, "Juan", "Taleworth", 85));
		personas.add(new Persona(42, "Romy", "Pettiford", 35));
		personas.add(new Persona(43, "Locke", "Vedikhov", 24));
		personas.add(new Persona(44, "Homere", "Gorini", 65));
		personas.add(new Persona(45, "Adriana", "Luisetti", 86));
		personas.add(new Persona(46, "Indira", "Rumin", 48));
		personas.add(new Persona(47, "Garth", "Alloway", 73));
		personas.add(new Persona(48, "Erika", "Athey", 57));
		personas.add(new Persona(49, "Devora", "Dunkinson", 56));
		personas.add(new Persona(50, "Sonny", "Fursland", 88));
		personas.add(new Persona(51, "Carlen", "Mastrantone", 39));
		personas.add(new Persona(52, "Tybalt", "Mathiasen", 61));
		personas.add(new Persona(53, "Justinian", "Boltwood", 36));
		personas.add(new Persona(54, "Jean", "Grunnell", 26));
		personas.add(new Persona(55, "De witt", "MacCarrick", 11));
		personas.add(new Persona(56, "Tod", "Fair", 1));
		personas.add(new Persona(57, "Tracy", "Danilin", 93));
		personas.add(new Persona(58, "Sinclair", "Medler", 72));
		personas.add(new Persona(59, "Virginia", "Bestiman", 95));
		personas.add(new Persona(60, "Patrick", "Pickin", 80));
		personas.add(new Persona(61, "Christie", "Hows", 79));
		personas.add(new Persona(62, "Fifi", "Westnedge", 42));
		personas.add(new Persona(63, "Tony", "Sysland", 68));
		personas.add(new Persona(64, "Zeke", "Arnault", 70));
		personas.add(new Persona(65, "Mil", "Armytage", 35));
		personas.add(new Persona(66, "Christi", "Ephgrave", 46));
		personas.add(new Persona(67, "Avram", "Vivien", 92));
		personas.add(new Persona(68, "Spencer", "Stripp", 39));
		personas.add(new Persona(69, "Sharai", "Tunmore", 94));
		personas.add(new Persona(70, "Melesa", "Eagleton", 98));
		personas.add(new Persona(71, "Krista", "Collins", 47));
		personas.add(new Persona(72, "Des", "Welchman", 49));
		personas.add(new Persona(73, "Nicolle", "Wetter", 2));
		personas.add(new Persona(74, "Editha", "Roulston", 95));
		personas.add(new Persona(75, "Bernard", "Arnauduc", 32));
		personas.add(new Persona(76, "Jeremie", "O'Malley", 8));
		personas.add(new Persona(77, "Junie", "Cornes", 9));
		personas.add(new Persona(78, "Dari", "Salkild", 37));
		personas.add(new Persona(79, "Harlin", "Hlavac", 82));
		personas.add(new Persona(80, "Jacklyn", "Brion", 69));
		personas.add(new Persona(81, "Todd", "Gasquoine", 40));
		personas.add(new Persona(82, "Prentiss", "Welbrock", 74));
		personas.add(new Persona(83, "Raquel", "Stirzaker", 34));
		personas.add(new Persona(84, "Brod", "Gonning", 45));
		personas.add(new Persona(85, "Mora", "Mattam", 50));
		personas.add(new Persona(86, "Gunner", "Leverington", 40));
		personas.add(new Persona(87, "Valma", "Schottli", 38));
		personas.add(new Persona(88, "David", "Convery", 61));
		personas.add(new Persona(89, "Dukey", "Glanton", 81));
		personas.add(new Persona(90, "Reagen", "Kindley", 28));
		personas.add(new Persona(91, "Mayer", "Foxcroft", 74));
		personas.add(new Persona(92, "Almeta", "Petruszka", 86));
		personas.add(new Persona(93, "Wiley", "Spurryer", 10));
		personas.add(new Persona(94, "Emlen", "Kapelhoff", 66));
		personas.add(new Persona(95, "Deane", "Shalliker", 61));
		personas.add(new Persona(96, "Noach", "Gooderick", 18));
		personas.add(new Persona(97, "Juliette", "Hinckesman", 72));
		personas.add(new Persona(98, "Port", "Dillingston", 8));
		personas.add(new Persona(99, "Kathleen", "Okenden", 47));
		personas.add(new Persona(100, "Clara", "Hubback", 4));
		personas.add(new Persona(101, "Ardeen", "Eversfield", 8));
		personas.add(new Persona(102, "Erminie", "Gwynne", 1));
		personas.add(new Persona(103, "Emmalynne", "Bartolomeazzi", 18));
		personas.add(new Persona(104, "Wallis", "Pilch", 82));
		personas.add(new Persona(105, "Helen-elizabeth", "McWhinnie", 50));
		personas.add(new Persona(106, "Hermann", "Shaw", 43));
		personas.add(new Persona(107, "Skyler", "Nutting", 38));
		personas.add(new Persona(108, "Mella", "Perillo", 88));
		personas.add(new Persona(109, "Kimble", "Haseley", 30));
		personas.add(new Persona(110, "Giles", "Iannini", 60));
		personas.add(new Persona(111, "Mandy", "Bims", 49));
		personas.add(new Persona(112, "Merrili", "Daveridge", 63));
		personas.add(new Persona(113, "Jarrid", "Coaker", 30));
		personas.add(new Persona(114, "Brandtr", "Cellone", 8));
		personas.add(new Persona(115, "Ophelia", "Breawood", 57));
		personas.add(new Persona(116, "Angie", "Pelerin", 56));
		personas.add(new Persona(117, "Lanny", "Storkes", 80));
		personas.add(new Persona(118, "Jacquelin", "Greenan", 34));
		personas.add(new Persona(119, "Christean", "Woliter", 90));
		personas.add(new Persona(120, "Isaac", "Sherrum", 30));
		personas.add(new Persona(121, "Carley", "Kerner", 54));
		personas.add(new Persona(122, "Ronald", "Streetfield", 87));
		personas.add(new Persona(123, "Bev", "Cobbledick", 9));
		personas.add(new Persona(124, "Mia", "MacArthur", 65));
		personas.add(new Persona(125, "Hobey", "Abramovicz", 20));
		personas.add(new Persona(126, "Parrnell", "Dashper", 2));
		personas.add(new Persona(127, "Dominic", "Tozer", 24));
		personas.add(new Persona(128, "Perri", "O'Cannovane", 7));
		personas.add(new Persona(129, "Burt", "Manzell", 6));
		personas.add(new Persona(130, "Bibby", "Elloit", 65));
		personas.add(new Persona(131, "Pincas", "Ffrench", 72));
		personas.add(new Persona(132, "Bjorn", "Melley", 70));
		personas.add(new Persona(133, "Curtis", "Cobley", 63));
		personas.add(new Persona(134, "Dione", "Wayt", 99));
		personas.add(new Persona(135, "Faulkner", "Nelmes", 62));
		personas.add(new Persona(136, "Honor", "Decroix", 94));
		personas.add(new Persona(137, "Chandal", "Velte", 70));
		personas.add(new Persona(138, "Joceline", "Trippitt", 97));
		personas.add(new Persona(139, "Conrado", "Ellerton", 58));
		personas.add(new Persona(140, "Jennifer", "Greenstreet", 61));
		personas.add(new Persona(141, "Belvia", "Scohier", 32));
		personas.add(new Persona(142, "Trumann", "Janic", 13));
		personas.add(new Persona(143, "Leroi", "Tresler", 17));
		personas.add(new Persona(144, "Laughton", "Dorricott", 61));
		personas.add(new Persona(145, "Mara", "Boulsher", 14));
		personas.add(new Persona(146, "Gran", "Ely", 32));
		personas.add(new Persona(147, "Bearnard", "Hebbes", 80));
		personas.add(new Persona(148, "Merci", "Bowra", 70));
		personas.add(new Persona(149, "Willy", "Chaulk", 14));
		personas.add(new Persona(150, "Christophorus", "Friel", 7));
		personas.add(new Persona(151, "Kendall", "Barkworth", 89));
		personas.add(new Persona(152, "Meredith", "Addionizio", 22));
		personas.add(new Persona(153, "Samuele", "Breed", 52));
		personas.add(new Persona(154, "Orv", "Paragreen", 6));
		personas.add(new Persona(155, "Rayshell", "Dunbabin", 47));
		personas.add(new Persona(156, "Olly", "Klus", 97));
		personas.add(new Persona(157, "Yelena", "Sharpin", 86));
		personas.add(new Persona(158, "Pauline", "Lovelady", 69));
		personas.add(new Persona(159, "Brody", "Mc Coughan", 68));
		personas.add(new Persona(160, "Kikelia", "Shurmore", 53));
		personas.add(new Persona(161, "Braden", "Dautry", 58));
		personas.add(new Persona(162, "Johna", "Castelijn", 4));
		personas.add(new Persona(163, "Libbi", "Bleakley", 64));
		personas.add(new Persona(164, "Donovan", "Paydon", 59));
		personas.add(new Persona(165, "Leonora", "Salasar", 90));
		personas.add(new Persona(166, "Rycca", "Corsar", 71));
		personas.add(new Persona(167, "Joly", "Blaxley", 63));
		personas.add(new Persona(168, "Marabel", "Rivel", 91));
		personas.add(new Persona(169, "Michal", "Garmons", 11));
		personas.add(new Persona(170, "Kingston", "Pooke", 73));
		personas.add(new Persona(171, "Hershel", "Dannehl", 9));
		personas.add(new Persona(172, "Georgeta", "Bracknell", 19));
		personas.add(new Persona(173, "Gail", "Watman", 89));
		personas.add(new Persona(174, "Haleigh", "Fydo", 48));
		personas.add(new Persona(175, "Felicle", "Natte", 69));
		personas.add(new Persona(176, "Eleonore", "Lilley", 4));
		personas.add(new Persona(177, "Clywd", "Fausset", 81));
		personas.add(new Persona(178, "Holly", "Mioni", 51));
		personas.add(new Persona(179, "Delphinia", "Dundridge", 43));
		personas.add(new Persona(180, "Mozes", "Habercham", 2));
		personas.add(new Persona(181, "Nicolle", "Wynrahame", 60));
		personas.add(new Persona(182, "Correy", "Divers", 73));
		personas.add(new Persona(183, "Rosemonde", "McGiffin", 76));
		personas.add(new Persona(184, "Krystyna", "Hansed", 98));
		personas.add(new Persona(185, "Merrel", "Klementz", 40));
		personas.add(new Persona(186, "Mireille", "Casebourne", 98));
		personas.add(new Persona(187, "Karolina", "Orht", 28));
		personas.add(new Persona(188, "Shayne", "Reaveley", 95));
		personas.add(new Persona(189, "Aimil", "Dunbar", 77));
		personas.add(new Persona(190, "Lutero", "Gossage", 54));
		personas.add(new Persona(191, "Ethelind", "Pocklington", 100));
		personas.add(new Persona(192, "Eveleen", "Cussen", 16));
		personas.add(new Persona(193, "Shanie", "Wildgoose", 21));
		personas.add(new Persona(194, "Kevyn", "Burdfield", 64));
		personas.add(new Persona(195, "Lynea", "Adolfsen", 27));
		personas.add(new Persona(196, "Clifford", "Filer", 100));
		personas.add(new Persona(197, "Dedie", "Lingfoot", 61));
		personas.add(new Persona(198, "Kym", "Whittlesea", 4));
		personas.add(new Persona(199, "Veronica", "Cripps", 62));
		personas.add(new Persona(200, "Elbertine", "Cauderlie", 32));

		return personas;
	}

	/**
	 * Función que comprueba si una tabla existe
	 * 
	 * @param nombreTabla Nombre de la tabla a comprobar
	 * @return True si existe o false si no
	 */
	public static boolean tablaExists(String nombreTabla) {
		Connection conector = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean exists = false;

		try {
			// Establecer conexión
			conector = ConexionDB.connect();

			// Crear el objeto Statement
			stmt = conector.createStatement();

			// Asegúrate de seleccionar la base de datos si es necesario
			stmt.executeUpdate(useDB); // Este paso solo es necesario si no has establecido la base de datos
										// previamente

			// Consulta para verificar si la tabla existe
			String checkTableSql = "SELECT 1 FROM information_schema.tables WHERE table_name = '" + nombreTabla
					+ "' AND table_schema = 'ad2425_asuarez'";

			// Ejecutar la consulta SELECT
			rs = stmt.executeQuery(checkTableSql);

			// Si hay resultados, la tabla existe
			if (rs.next()) {
				exists = true;
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar recursos
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					System.out.println("Ha ocurrido un error cerrando los recursos");
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("Ha ocurrido un error cerrando los recursos");
				}
			}
			if (conector != null) {
				try {
					conector.close();
				} catch (SQLException e) {
					System.out.println("Ha ocurrido un error cerrando los recursos");
				}
			}
		}

		return exists;
	}

	/**
	 * Función que crea la tabla Persona
	 */
	public static void creacionTablaPersona() {
		Statement stmt = null;
		Connection conector = null;
		try {
			conector = ConexionDB.connect();
			// Paso 1. Creamos un nuevo objeto con la conexión
			stmt = conector.createStatement();

			// Paso 2. Seleccionar la base de datos
			stmt.executeUpdate(useDB);

			if (!tablaExists("Persona")) {
				// Paso 3. Definimos la sentencia para crear una nueva tabla
				String createTableSql = "CREATE TABLE Persona (" + "id INT PRIMARY KEY," + "nombre VARCHAR(50),"
						+ "apellido VARCHAR(50)," + "edad INT" + ");";

				// Paso 4. Ejecutar la sentencia de creación
				stmt.executeUpdate(createTableSql);

				System.out.println("Tabla Persona creada");
			} else {
				System.out.println("La tabla persona ya existe");
			}

		} catch (SQLException se) {
			// Gestionamos los posibles errores que puedan surgir durante la ejecución
			se.printStackTrace();
		} catch (Exception e) {
			// Gestionamos los posibles errores
			e.printStackTrace();
		} finally {
			// Paso 5. Cerrar el objeto en uso y la conexión
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					System.out.println("Ha ocurrido un error cerrando los recursos");
				}
			}
			if (conector != null) {
				try {
					conector.close();
				} catch (SQLException e) {
					System.out.println("Ha ocurrido un error cerrando los recursos");
				}
			}
		}
	}

	/**
	 * Función que inserta las personas en la tabla Persona
	 */
	public static void insertarPersonas() {
		PreparedStatement stmt = null;
		Statement statement = null;
		Connection conector = null;

		try {
			conector = ConexionDB.connect();
			// Seleccionar la base de datos
			statement = conector.createStatement();
			statement.executeUpdate(useDB);

			String sql = "INSERT INTO Persona (id, nombre, apellido, edad) VALUES (?, ?, ?, ?)";

			// Obtenemos las personas
			List<Persona> personas = getPersonas();

			// Prepararemos la query para que coja los datos de manera dinamica.
			stmt = conector.prepareStatement(sql);
			for (Persona persona : personas) {
				stmt.setInt(1, persona.getId());
				stmt.setString(2, persona.getNombre());
				stmt.setString(3, persona.getApellido());
				stmt.setInt(4, persona.getEdad());
				stmt.executeUpdate();

				System.out.println(persona.getNombre() + " " + persona.getApellido() + " añadid@");
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				conector.close();
			} catch (SQLException se) {
				System.out.println("No se ha podido cerrar la conexión.");
			}
		}
	}

	/**
	 * Función que realiza una consulta con campos, order y where especificado por
	 * parámetros y devuelve una lista de personas
	 * 
	 * @param campos Campos a obtener
	 * @param order  Regla order by
	 * @param where  Regla where
	 * @return Lista de personas
	 */
	public static List<Persona> getPersonasEx(String campos, String order, String where) {
		PreparedStatement stmt = null;
		Connection conector = null;
		ResultSet resultSet = null;

		// Lista para almacenar las personas
		List<Persona> personas = new ArrayList<>();

		try {
			conector = ConexionDB.connect();
			// Seleccionar la base de datos
			conector.createStatement().executeUpdate(useDB);

			// Construir la consulta dinámica
			String sql = "SELECT " + campos + " FROM Persona";
			if (!where.isEmpty()) {
				sql += " WHERE " + where;
			}
			if (!order.isEmpty()) {
				sql += " ORDER BY " + order;
			}

			// Ejecutar la consulta
			stmt = conector.prepareStatement(sql);
			resultSet = stmt.executeQuery();

			// Obtener metadatos para saber cuántas columnas hay
			ResultSetMetaData metaData = resultSet.getMetaData();
			int columnCount = metaData.getColumnCount();

			// Procesar el resultado dinámicamente
			while (resultSet.next()) {
				Persona persona = new Persona();

				// Asignar valores dinámicamente
				for (int i = 1; i <= columnCount; i++) {
					String columnName = metaData.getColumnName(i).toLowerCase();

					// Asignar según el nombre de la columna
					switch (columnName) {
					case "id":
						persona.setId(resultSet.getInt(i));
						break;
					case "nombre":
						persona.setNombre(resultSet.getString(i));
						break;
					case "apellido":
						persona.setApellido(resultSet.getString(i));
						break;
					case "edad":
						persona.setEdad(resultSet.getInt(i));
						break;
					}
				}

				personas.add(persona);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conector != null) {
					conector.close();
				}
			} catch (SQLException se) {
				System.out.println("No se ha podido cerrar la conexión.");
			}
		}

		return personas;
	}

	public static double getMediaEdad(String campos, String order, String where) {
		PreparedStatement stmt = null;
		Connection conector = null;
		ResultSet resultSet = null;

		double media = 0;

		try {
			conector = ConexionDB.connect();
			// Seleccionar la base de datos
			conector.createStatement().executeUpdate(useDB);

			// Construir la consulta dinámica
			String sql = "SELECT " + campos + " FROM Persona";
			if (!where.isEmpty()) {
				sql += " WHERE " + where;
			}
			if (!order.isEmpty()) {
				sql += " ORDER BY " + order;
			}

			// Ejecutar la consulta
			stmt = conector.prepareStatement(sql);
			resultSet = stmt.executeQuery();

			// Procesar el resultado dinámicamente
			while (resultSet.next()) {
				media = resultSet.getDouble(1);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conector != null) {
					conector.close();
				}
			} catch (SQLException se) {
				System.out.println("No se ha podido cerrar la conexión.");
			}
		}

		return media;
	}

	/**
	 * Función que añade la columna laboral a la tabla Persona, con reestricciones
	 */
	public static void crearColumnaLaboral() {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConexionDB.connect();
			conn.createStatement().executeUpdate(useDB);
			stmt = conn.createStatement();
			String sql = "ALTER TABLE Persona ADD COLUMN laboral VARCHAR(100) CHECK (laboral IN ('estudiante', 'ocupado', 'parado', 'jubilado'));";
			stmt.executeUpdate(sql);
			System.out.println("Columna creada");
		} catch (SQLException se) {
			// Gestionamos los posibles errores que puedan surgir durante la ejecución de la
			// inserción
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println("Se ha producido un error.");
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				System.out.println("No se ha podido cerrar la conexión.");
			}
		}
	}

	/**
	 * Función que inserta los datos en la columna laboral de la tabla Personas,
	 * según los requisitos
	 */
	public static void insertarLaboral() {
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = ConexionDB.connect();
			conn.createStatement().executeUpdate(useDB);
			stmt = conn.createStatement();
			String sql = "UPDATE Persona SET laboral =" + "CASE\n" + " WHEN edad < 18 THEN 'estudiante'\n"
					+ " WHEN edad > 65 THEN 'jubilado'\n"
					+ " WHEN edad BETWEEN 18 AND 65 AND edad % 2 = 1 THEN 'parado'\n" + " ELSE 'ocupado'\n" + "END";

			stmt.executeUpdate(sql);
			System.out.println("Modificado");
		} catch (SQLException se) {
			// Gestionamos los posibles errores que puedan surgir durante la ejecución de la
			// inserción
			se.printStackTrace();
		} catch (Exception e) {
			System.out.println("Se ha producido un error.");
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				System.out.println("No se ha podido cerrar la conexión.");
			}
		}
	}
}
