import dao.Dao;
import dao.DatabaseConnector;
import pojos.*;
import print.*;

import java.sql.Connection;
import java.util.*;


public class Main {

    public static String CATALOGO = "hr_database";
    public static String NOMBRE_TABLA = "CLIENTES";
    public static String T_FACTURAS = "FACTURAS";
    public static String T_LINEAS_FACTURA = "LINEAS_FACTURA";
    public static String INSERT_CLIENTES = "INSERT INTO CLIENTES(DNI,APELLIDOS,CP) VALUES "
            + "('78901234X','NADALES','44126'),"
            + "('89012345E','HOJAS', null),"
            + "('56789012B','SAMPER','29730'),"
            + "('09876543K','LAMIQUIZ', null);";


    public static void main(String[] args) {


        // Ejemplo de uso
        try {
            DatabaseConnector connector = new DatabaseConnector();
            Connection connection = connector.connection;

            if (connection == null) {
                throw new Exception("Error al obtener la conexión a la base de datos.");
            }
            System.out.println(connection.getMetaData().getURL());

            Dao dao = new Dao(connection);

            ImprimirResultados print = new ImprimirResultados();
//            /**
//             * Ejecutamos una sentencia DDL para crear una tabla
//             */
            dao.crearTablaClientesSiNoExiste();

            List<String[]> datosFinales = Arrays.asList(
                    new String[]{"33333333E", "JOSE", "28910"},
                    new String[]{"99999999Q", "JORGE", null},
                    new String[]{"66666666G", "MANOLA", "28914"}
            );

            try (Scanner sc = new Scanner(System.in)) {
                // Cerramos la conexion

//                Ej4_1 ej41 = new Ej4_1();
//                ej41.reescribirTabla(connection, datosFinales);

//                Ej4_2 ej42 = new Ej4_2();
//                ej42.imprimirRegistros2(connection,"COMPANIES");

//                Ej4_3 ej43 = new Ej4_3();
//                ej43.nombresInvertidos(connection);
//
                //                Ej4_4 ej44 = new Ej4_4();
                //               ej44.contarFilas(connection,"SELECT * FROM countries");
//
                //                Ej4_5 ej4_5 = new Ej45();
                //               String[] dnis = {"66666666G", "33333333E"};
                //               ej45.printClientesDni(connection, dnis);
//
                Ej4_6 ej46 = new Ej4_6();
                List<Company> companies = new ArrayList<>(Arrays.asList(
                        new Company("26331733A", "INDRA", "I+D"),
                        new Company("66666666E", "BBVA", "Banca"),
                        new Company("23523454B", "ACCENTURE", "INFORMATICA")
                ));
                ej46.rollback(connection, companies);
//
//                Ej4_7 ej47 = new Ej4_7();
//                System.out.println("Introduce el DNI del que te gustaría saber el apellido");
//                ej47.getApellidosFromDni(connection, sc.next());
//
//                Ej4_8 ej48 = new Ej4_8();
//                ej48.navegarTabla(connection,"COUNTRIES");


            }
            connection.close();
        } catch (Exception e) {
            System.err.println("Fallo al intentar obtener la conexion a la base de datos.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}