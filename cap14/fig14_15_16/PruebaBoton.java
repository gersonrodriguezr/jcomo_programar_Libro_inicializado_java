// Fig. 15.16: PruebaBoton.java
// Prueba de MarcoBoton.
import javax.swing.JFrame;

public class PruebaBoton 
{
   public static void main( String[] args )
   { 
      MarcoBoton marcoBoton = new MarcoBoton(); // crea MarcoBoton
      marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      marcoBoton.setSize( 300, 110 ); // establece el tama�o del marco
      marcoBoton.setVisible( true ); // muestra el marco
   } // fin de main
} // fin de la clase PruebaBoton

/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
