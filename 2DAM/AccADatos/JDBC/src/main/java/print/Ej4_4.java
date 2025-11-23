package print;

import java.sql.*;

/**
 * Actividad 4.4
 * Contar el número de filas devueltas por una consulta sin recorrer todos los registros.
 * Estrategia: solicitar un ResultSet scrollable, mover el cursor a rs.last() y usar rs.getRow().
 */
public class Ej4_4 {

    /**
     * Cuenta las filas devueltas por la consulta SQL dada usando ResultSet scrollable.
     * @param conn Conexión activa.
     * @param sql La consulta a ejecutar (puedes pasar "SELECT * FROM CLIENTES" u otra).
     * @return número de filas encontradas.
     */
    public int contarFilas(Connection conn, String sql) {
        try (Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (!rs.last()) {
                // No hay filas
                System.out.println("La consulta no devolvió filas.");
                return 0;
            }
            int filas = rs.getRow();
            System.out.println("Número de filas (sin iterar): " + filas);
            // Opcional: volver al inicio si luego se quiere leer (rs.beforeFirst())
            rs.beforeFirst();
            return filas;
        } catch (SQLException e) {
            System.err.println("Error en contarFilas: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }
}
