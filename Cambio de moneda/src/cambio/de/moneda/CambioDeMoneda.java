
package cambio.de.moneda;
import java.io.*;
/**
 *
 * @author ocervantes
 */
public class CambioDeMoneda {


    public static void main(String[] args) throws IOException {

        // TODO code application logic here
                BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
  double cambio = 0;
  double cant;
  int moneda;
  // elejir la moneda
  System.out.println("seleccione moneda a cambiar");
  System.out.println("1:peso mexicano ");
  System.out.println("2:Euro");
  System.out.println("3:colones");
  System.out.println("4:quetzal");
  moneda = Integer.parseInt(bufEntrada.readLine());
  // esto es para que te muestre el nombre de la moneda que seleccionaste
  if (moneda==1) {
   System.out.println("Ud. selecciono peso mexicano ");
  } else {
   if (moneda==2) {
    System.out.println("Ud. selecciono Euro");
   } else {
    if (moneda==3) {
     System.out.println("Ud. selecciono Colones");
    } else {
     if (moneda==4) {
      System.out.println("Ud. selecciono Quetzales");
     }
    }
   }
  }
  System.out.println(" ");
  // aqui ingresas la cantidad de dinero en dolares
  System.out.println("ingrese cantidad en dolares   para cambiar");
  cant = Double.parseDouble(bufEntrada.readLine());
  // aqui segun la variable moneda, se realizara la operacion.
  switch (moneda) {
  case 1:
   System.out.println("Cambiar a pesos mexicanos ");
   // esto equivale a pesos mexicanos 
   cambio = cant*18.54;
   break;
  case 2:
   System.out.println("Cambiar a euros");
   // esto equivale a euros
   cambio = cant*1.11816;
   break;
  case 3:
   System.out.println("Cambiar colones");
   // esto equivale a colones 
   cambio = cant*8.75;
   break;
  case 4:
   System.out.println("Cambiar a quetzal");
   // esto equivale a quetzales 
   cambio = cant*7.35;
   break;
  default:
   System.out.println("la moneda elegida es invalida");
  }
  System.out.println(" ");
  System.out.println("El cambio en la moneda seleccionada es: "+cambio);
  System.out.println(" ");
    }
    
}
        
        
        

