
package programa1random;
import java.util.Random;

/**
 * UPEM
 * @author oscarcervantes
 */
public class Programa1Random {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Random A=new Random();
        int n;
        n=(A.nextInt(6)+1);
        System.out.println(n);
        if(n==1){
            System.out.println("Es tu día de suerte");
        }
        if(n==2){
            System.out.println("Ten un excelente día");
        }
        if(n==3)
            System.out.println("conceras a personas especiales");
        if(n==4){
            System.out.println("Hola mundo");
        }
        if(n==4){
            System.out.println("Tu numero de suerte es el 7");
        }
        if(n==5){
            System.out.println("Has deporte");
        }
        if(n==6){
            System.out.println("Sigue adelante tu puedes");
        }
    }
    
}
