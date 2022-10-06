
package areasupemlaboratori;
import java.util.Scanner;

/**
 *UPEM
 * @author oscarcervantes
 */
public class AreasUpemLaboratori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      
        System.out.println("Seleccionar areas 1=cuadrado, 2=circulo, 3= Triangulo");

        Scanner A=new Scanner(System.in );
     int E=A.nextInt();
     switch (E){
     case 1:  System.out.println("Ingresa un lado");
     double L=A.nextDouble();
     double U=L*L;
     System.out.println("el resultado del area es:"+U);        
     break; 
        
        case 2:
            System.out.println("Ingresa un radio");
     double P=A.nextDouble();
     double R=P*P*3.1416;
     System.out.println("el resultado del area es:"+R);        
     break; 
     
        case 3:
               System.out.println("Ingresa un Base y una altura");
     double B=A.nextDouble();
     double AL=A.nextDouble();
     double AR=B*AL/2;
     System.out.println("el resultado del area es:"+AR);        
     break;
    }
    
    }
 }
