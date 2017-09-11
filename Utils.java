package maquinachicles;
import java.util.Scanner;
public class Utils {
    int stockchicles = 0;
    int cantventas = 0;
    int cantmonedas=0 ;
    int cant = 0;
    
    public void inicializar(int stockactual , int monedas)
    {
        this.stockchicles = stockactual;
        this.cantmonedas  = monedas;
    }
   
    public void comprar ()
        {            
            Scanner sc = new Scanner (System.in);
            if (stockchicles > 0)
                //hay venta
                
                {
                   System.out.println("Ingrese un maximo de 5 monedas ");
                   cant = sc.nextInt();
                    if(cant <= 5)
                        {
                            System.out.println("Retire sus: "  + cant + "  chicles.... ");
                        }
                    else 
                        {
                            System.out.println("Solo puede colocar 5 monedas ");
                        }
                   this.stockchicles = stockchicles - cant;
                   this.cantventas = cantventas + cant;
               }
            else 
                {
                    System.out.println("No hay stock retire su dinero");
                }
         }
    
    public int getStockDisponible()
       
        {
            return this.stockchicles;
        }
    
    public void cargarStock(int cantidadnueva)
        {
            this.stockchicles = cantidadnueva; 
        }
  
}
