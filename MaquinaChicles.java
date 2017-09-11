package maquinachicles;
import java.util.Scanner;

public class MaquinaChicles {

 
    public static void main(String[] args)
    {
      Utils maquina = new Utils();
      int opcion = 0;
      int cantidadnueva = 0;
      Scanner sc = new Scanner (System.in);
      
      maquina.inicializar(100, 0);
      while (opcion != 5)
      {
          
          System.out.println ("1. Comprar  " );
          System.out.println ("2. Stock " );
          System.out.println ("3. Cantidad de Chicles vendidos " );
          System.out.println ("4. Carga de Stock ");
          System.out.println ("5. Finalizar ");
          System.out.println("");
          System.out.println("");
          System.out.println ("Ingrece Opcion " );
          opcion = sc.nextInt();
          System.out.println("");
          System.out.println("");
          
          switch (opcion)
          {
              case 1:
                  maquina.comprar();
                  break;
              case 2:
                  System.out.println("El estock disponible es " + maquina.stockchicles);
                  System.out.println("");
                  System.out.println("");
                  break;
              case 3:
                  System.out.println("Cantidad de dinero recaudado es: " + maquina.cantventas);
                  System.out.println("La Cantidad de chicle vendidos es : " + maquina.cantventas);
                  System.out.println("");
                  System.out.println("");
                  break;
              case 4:
                  System.out.println("Indique nuevo Stock");
                  System.out.println("");
                  System.out.println("");
                  maquina.cargarStock(cantidadnueva);
                  break;
          }
       } 
      System.out.println("Gracias por operar con nuestra maquina");
    }
 }
