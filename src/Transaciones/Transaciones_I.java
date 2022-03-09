import java.sql.*;
/*
 * En  el modulo de trasanción intentamos que un número x de instrucciones de SQLs se ejecuten al unísono.
 * El motivo por el cúal nos puede ser interesante dicho comportamientos; puede ser, porque las tablas
 * a las que afectan dichas instrucciones estén relacionadas.
 */
public class Transaciones_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection miConexion = null;
			try{					
					
				miConexion=DriverManager.getConnection( "jdbc:postgresql://localhost:5433/Transaciones", "postgres", "1234");	
//				1º Paso. Implementar el método setAutoCommit(false). Lo que hará que funcione las instrucciones como bloque.
				miConexion.setAutoCommit(false);
				Statement miStatement =miConexion.createStatement();
				
			    String instruccionSql_1="INSERT INTO CLIENTES (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
				    
			    miStatement.executeUpdate(instruccionSql_1);
				    
			    String instruccionSql_2="INSERT INTO PEDIDOS (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";
				    
			    miStatement.executeUpdate(instruccionSql_2);
/*
 * 			    2º Paso. El método commit es el encargado de verificar que todas las instrudcciones
 *               se han ejecutado correctamente.
 */
			    miConexion.commit();
			    System.out.println("Datos INSERTADOS correctamente");
					
			}catch(Exception e){
					
				System.out.println("ERROR EN LA INSERCION DE DATOS!!");
				
/*				3º Paso. El método rollback es el encargado de evaluar que al haber salido 
 *              algo mal, volver los registros al inicio. Es decir, los registros no se habrán ingresado o registrado
 *              (ninguno).
 */
				
				try {
					miConexion.rollback();
					System.out.println("ERROR en la Transación!!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				e.printStackTrace();	
					
					
				}

			}

		}