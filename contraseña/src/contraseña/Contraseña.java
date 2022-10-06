
package contraseña;
import java.util.Scanner;
import java.util.Random;
/**
 *UPEM
 * @author ocervantes OSCAR CERVANTES ROSALES 
 * RODRÍGUEZ JUÁREZ CARLOS ALFREDO
 * BRIAN RIVERA NEZA -
 * 
 */
public class Contraseña {

   
    public static void main(String[] args) {
        //Se declara Scanner para escribir
     Scanner sc=new Scanner(System.in);
     
        System.out.println("Escribe Nombre y contraseña");
        String nom=sc.next();
        int seña=sc.nextInt();
        //Se indica el nombre y contraseña  para el acceso
        if( "UPEM".equals(nom) &&  seña==123 )   
        {
            System.out.println("Contraseña y Nombre correctos:");
            System.out.println("Bienvenido:");
            System.out.println("Ten un buen día:");
            System.out.println("Que desea hacer");
        System.out.println("1 Areas");
        System.out.println("2 Convercion de mm a cm y m");
        System.out.println("3 Suerte");
        System.out.println("4 derivada");
        System.out.println("5 Promedio");
        System.out.println("6 Cambio de Moneda");
        int vl=sc.nextInt();
        //A que quiere acceder 
        
        switch(vl){
            
            case 1:
                System.out.println("Usted escogio Áreas: Opción 1 ");
                 System.out.println("Designe una area a calcular");
                 System.out.println("10 Cuadrado");
                 System.out.println("11 Circulo");
                 System.out.println("12 Triangulo");
                 int num=sc.nextInt();
                 switch(num){
                     case 10:
                         System.out.println("Selecciono el área del cuadrado: ");
                         System.out.println("Designe un valor:");
                         
                         double L=sc.nextDouble();
                         double ar=L*L;
                         System.out.println("El area del cuadrado es: "+ar);
                             
                         break;
                     case 11: 
                         System.out.println("Selecciono el área del circulo: ");
                         System.out.println("Designe un valor:");
                         double R=sc.nextDouble();
                         double c=3.1416*R*2;
                         System.out.println("El area del circulo es: "+c);
                         break;
                     case 12:
                         System.out.println("Selecciono el área del triangulo: ");
                         System.out.println("Designe la Base ");
                         double B=sc.nextDouble();
                         System.out.println("Designe la Altura");
                         double Al=sc.nextDouble();
                         double AT=B*Al/2;
                         System.out.println("El Área del triangulo: "+AT);
                         
                         break;
                         default:
                             System.out.println("Error Seleccione los numeros asignados");
                 }
                 //termina el case1
                break;
            case 2:
                System.out.println("Ud. Escogio convercion de mm a cm y m: Opcion 2");
                System.out.println("Empezemos: ");

                System.out.println("Ingrese el valor en mm :");
                double MM=sc.nextDouble();
               System.out.println("La medida que ingreso en mm es: "+MM);
                double CM=MM/100;
                System.out.println("La medida en cm es: "+CM);
                double Metro=MM/1000;
                System.out.println("La medida en m es: "+Metro);
                     
                //Termina el case 2
                break;
                
            case 3: 
                
                System.out.println("Ud. Escogio Suerte: Opcion 3");
                System.out.println("Empezemos: ");
                Random A=new Random();
                int n;
                n=(A.nextInt(6)+1);
                System.out.println(n);
                if(n==1)
                {
                    System.out.println("Es tu día de suerte: ");
                }
                if(n==2)
                {
                    System.out.println("Es un buen día para salir a pasear: ");
                }
                if(n==3)
                {
                System.out.println("El numero de suerte para el día de hoy es 7: ");
                }
                if(n==4)
                {
                    System.out.println("Es momento para dar un abrazo a una persona especial: ");
                }
                if(n==5)
                {
                    System.out.println("Es hora de comenzar, a trabajar en tu proyecto de tu vida: ");
                }
                if(n==6)
                {
                    System.out.println("Comienza hacer realidad tus sueños: ");
                }
                if(n==7)
                {
                    System.out.println("Es un buen día para Sonríe ");
                }         
                //Termina el case 3
                
                break;
                
            case 4:
               System.out.println("Ud. Escogio derivadas: Opcion 4");
                System.out.println("Empezemos: ");
                int coef,pot,x,xco,xpo;
                int coeficiente, potencia,xc,xp;
                int coeficiente2, potencia2,xc2,xp2;
                Scanner teclado = new Scanner (System.in);
                do {
                    System.out.println("Que tipo de funcoin deseas derivar ?:");
                    System.out.println("1 ax^b ");
                    System.out.println("2(ax^b)/(cx^d) ");
                    System.out.println("3(ax^b)(cx^d)");
                    x = teclado.nextInt();
                if (x==1){ 
                System.out.println("Derivar funciones de la forma ax^b \n");
                System.out.println("Escribe el coeficiente:");
                coef = teclado.nextInt();
                System.out.println("Escribe la potencia:");
                pot = teclado.nextInt();
                xco = coef*pot;
                xpo = pot - 1;
                System.out.println("La derivada es: "+xco+"x^"+xpo+"\n");
                }
                 if (x==2){
                 System.out.println("Escribe el primer coeficiente:");
                 coeficiente = teclado.nextInt();
                 System.out.println("Escribe la primera potencia:");
                 potencia = teclado.nextInt();
                 xc = coeficiente*potencia;
                 xp = potencia - 1;
                 System.out.println("Escribe el segundo coeficiente:");
                 coeficiente2 = teclado.nextInt();
                 System.out.println("Escribe la segunda potencia:");
                 potencia2 = teclado.nextInt();
                 xc2 = coeficiente2*potencia2;
                 xp2 = potencia2 - 1;
                 System.out.println("La derivada es: (("+ coeficiente2+"x^"+potencia2+")("+xc+"x^"+xp+") - ("+coeficiente+"x^"+potencia+")("+xc2+"x^"+xp2+"))/("+coeficiente2+"x^"+potencia2+")^2");
                 }   
                if (x==3){
                 System.out.println("Escribe el primer coeficiente:");
                 coeficiente = teclado.nextInt();
                 System.out.println("Escribe la primera potencia:");
                 potencia = teclado.nextInt();
                 xc = coeficiente*potencia;
                 xp = potencia - 1;
                 System.out.println("Escribe el segundo coeficiente:");
                 coeficiente2 = teclado.nextInt();
                 System.out.println("Escribe la segunda potencia:");
                 potencia2 = teclado.nextInt();
                 xc2 = coeficiente2*potencia2;
                 xp2 = potencia2 - 1;
                 System.out.println("La derivada es: ("+ coeficiente+"x^"+potencia+")("+xc2+"x^"+xp2+") + ("+coeficiente2+"x^"+potencia2+")("+xc+"x^"+xp+")");
      
                 } 
                   System.out.println("DESEA INTENTER DE NUEVO");
                   System.out.println("1si_ 2no");
                   x=teclado.nextInt(); 
                  
                }
                while (x==1);
                 break;
            case 6:
                System.out.println("Ud. Escogio Cambio de moneda: Opcion 6");
                System.out.println("Empezemos: ");
                System.out.println("seleccione moneda a cambiar");
                // elejir la moneda
    
               System.out.println("1:peso mexicano ");
               System.out.println("2:Euro");
               System.out.println("3:colones");
               System.out.println("4:quetzal");
               int moneda=sc.nextInt();
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
                 System.out.println("ingrese cantidad en dolares   para cambiar");
                 double cambio=sc.nextDouble();
                 double cant=sc.nextDouble();
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
 
                   System.out.println("El cambio en la moneda seleccionada es: "+cambio);
 
             break;   
                
            case 5:
                System.out.println("Ud. a escogido sacar el promedio: Opción 5");
                System.out.println("Comencemos a identificar las materias: ");
                System.out.println("Las materias son las siguientes: ");
                System.out.println("Primer materia es: Algoritmos. ");
                System.out.println("Segunda materia es: Temas Selectos.");
                System.out.println("Tercera materia es: Administración.");
                System.out.println("Cuarta materia es: Dinamica. ");
                System.out.println("Quinta materia es: Lectura Redaccion oral y escrita. ");
                System.out.println("Sexta materia es: calculo. ");
                
                System.out.println("\n Antes de continuar desea ingresar 1 parcial o los 2 parciales ");
                System.out.println("Si va ingresar 1 parcial precione la tecla 1.");
                System.out.println("Si va ingresar los 2 parciales precione la tecla 2.");
                int vl1=sc.nextInt();
                
                
                switch(vl1)
                {
                    case 1: System.out.println("Ud. selecciono ingresar solamente un parcial: ");
                    
                    
                    System.out.println("Ingrese calificación 1 Algoritmos: ");
                    double cal1=sc.nextDouble();
                    System.out.println("Ingrese calificación 2 Temas selectos:");
                    double cal2=sc.nextDouble();
                    System.out.println("Ingrese calificación 3 Administración: ");
                    double cal3=sc.nextDouble();
                    System.out.println("Ingrese calificación 4 Dinamica: ");
                    double cal4=sc.nextDouble();
                    System.out.println("Ingrese calificación 5 Lectura Oral y Escrita");
                    double cal5=sc.nextDouble();
                    System.out.println("Ingrese calificación 6 Calculo");
                    double cal6=sc.nextDouble();
                    
                    
                    
                    double prom=(cal1+cal2+cal3+cal4+cal5+cal6)/6;
                    
                    System.out.println("Su promedio es de: "+prom);
                    if(prom>=5)
                    {
                        System.out.println("Aprobado");
                    }
                    else 
                    {
                        System.out.println("Reprobado");
                    }
                            break;     
                    case 2:
                {
                         System.out.println("Ud. selecciono ingresar 2 parciales:");
                      System.out.println("Ingrese calificación 1 Algoritmos - 1 parcial: ");
                      double cali1=sc.nextDouble();
                      System.out.println("Ingrese calificación 2 Temas selectos - 1 parcial:");
                      double cali2=sc.nextDouble();
                      System.out.println("Ingrese calificación 3 Administración - 1 parcial: ");
                      double cali3=sc.nextDouble();
                      System.out.println("Ingrese calificación 4 Dinamica - 1 parcial: ");
                      double cali4=sc.nextDouble();
                      System.out.println("Ingrese calificación 5 Lectura Oral y Escrita - 1 parcial:");
                      double cali5=sc.nextDouble();
                      System.out.println("Ingrese calificación 6 Calculo  - 1 parcial:");
                       double cali6=sc.nextDouble();
                       
                      System.out.println("Ingrese el 2 parcial:");
                      System.out.println("Ingrese calificación 1 Algoritmos - 2 parcial:  ");
                      double calif1=sc.nextDouble();
                      System.out.println("Ingrese calificación 2 Temas selectos - 2 parcial:");
                      double calif2=sc.nextDouble();
                      System.out.println("Ingrese calificación 3 Administración - 2 parcial: ");
                      double calif3=sc.nextDouble();
                      System.out.println("Ingrese calificación 4 Dinamica - 2 parcial: ");
                      double calif4=sc.nextDouble();
                      System.out.println("Ingrese calificación 5 Lectura Oral y Escrita - 2 parcial:");
                      double calif5=sc.nextDouble();
                      System.out.println("Ingrese calificación 6 Calculo - 2 parcial:");
                       double calif6=sc.nextDouble();
                      
                        double prome=(cali1+cali2+cali3+cali4+cali5+cali6)/6;
                        double promed=(calif1+calif2+calif3+calif4+calif5+calif6)/6;
                         System.out.println("Su promedio es del primer parcial: "+prome);
                         System.out.println("Su promedio es del segundo parcial: "+promed);
                         double total=(prome+promed)/2;
                         System.out.println("EL PROMEDIO TOTAL ES DE : "+total);
                         if(total>=5)
                          {
                           System.out.println("Aprobado");
                          }
                           else 
                          {
                           System.out.println("Reprobado");
                          }
                         
                     }
              
               //termina el case 4
             break;
                    default:
                    System.out.println("Error de ingreso");         
             }
                
               
                
                
        }
         
    }
        //En caso de que la contraseña y/o usuario se diferente 
     else
     {
     System.out.println("Nombre y/o Contraseña Incorrecta:");
            
      }
             
        
    }
    
}
