// Fig. 9.6: EmpleadoBaseMasComision.java
// La clase EmpleadoBaseMasComision representa a un empleado que recibe
// un salario base, adem�s de la comisi�n.

public class EmpleadoBaseMasComision
{
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;
   private double ventasBrutas; // ventas totales por semana
   private double tarifaComision; // porcentaje de comisi�n
   private double salarioBase; // salario base por semana

   // constructor con seis argumentos
   public EmpleadoBaseMasComision( String nombre, String apellido, 
      String nss, double ventas, double tarifa, double salario )
   {
      // la llamada impl�cita al constructor de Object ocurre aqu�
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = nss;
      establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
      establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisi�n
      establecerSalarioBase( salario ); // valida y almacena el salario base
   } // fin del constructor de EmpleadoBaseMasComision con seis argumentos

   // establece el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   } // fin del m�todo establecerPrimerNombre

   // devuelve el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } // fin del m�todo obtenerPrimerNombre

   // establece el apellido paterno
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   } // fin del m�todoestablecerApellidoPaterno

   // devuelve el apellido paterno
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } // fin del m�todo obtenerApellidoPaterno

   // establece el n�mero de seguro social
   public void establecerNumeroSeguroSocial( String nss )
   {
      numeroSeguroSocial = nss; // debe validar
   } // fin del m�todo establecerNumeroSeguroSocial

   // devuelve el n�mero de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } // fin del m�todo obtenerNumeroSeguroSocial

   // establece el monto de ventas brutas
   public void establecerVentasBrutas( double ventas )
   {
      if ( ventas >= 0.0 )
         ventasBrutas = ventas;
      else
         throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0" );
   } // fin del m�todo establecerVentasBrutas

   // devuelve el monto de ventas brutas
   public double obtenerVentasBrutas()
   {
      return ventasBrutas;
   } // fin del m�todo obtenerVentasBrutas

   // establece la tarifa de comisi�n
   public void establecerTarifaComision( double tarifa )
   {
      if ( tarifa > 0.0 && tarifa < 1.0 )
         tarifaComision = tarifa;
      else
         throw new IllegalArgumentException(
            "La tarifa de comisi�n debe ser > 0.0 y < 1.0" );
   } // fin del m�todo establecerTarifaComision

   // devuelve la tarifa de comisi�n
   public double obtenerTarifaComision()
   {
      return tarifaComision;
   } // fin del m�todo obtenerTarifaComision

   // establece el salario base
   public void establecerSalarioBase( double salario )
   {
      if ( salario >= 0.0 )
         salarioBase = salario;
      else
         throw new IllegalArgumentException(
            "El salario base debe ser >= 0.0" );
   } // fin del m�todo establecerSalarioBase

   // devuelve el salario base
   public double obtenerSalarioBase()
   {
      return salarioBase;
   } // fin del m�todo obtenerSalarioBase

   // calcula los ingresos
   public double ingresos()
   {
      return salarioBase + ( tarifaComision * ventasBrutas );
   } //fin del m�todo ingresos

   // devuelve representaci�n String de EmpleadoBaseMasComision
   @Override  // indica que este m�todo sobrescribe el m�todo de la superclase
   public String toString()
   {
      return String.format( 
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
         "empleado por comision con sueldo base", primerNombre, apellidoPaterno, 
         "numero de seguro social", numeroSeguroSocial, 
         "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision, 
         "salario base", salarioBase );
   } // find el m�todo toString
} // fin de la clase EmpleadoBaseMasComision


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