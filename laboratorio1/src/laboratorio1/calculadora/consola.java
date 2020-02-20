
package laboratorio1.calculadora;

import java.util.Scanner;


/**
 *
 * @author Alejandra Alza y Daniela Rojas
 */
public class consola {
    
     public static void main(String[]args){
         
        operacionesMat calculo=new operacionesMat();
        Scanner entradaDatos = new Scanner (System.in);
        
        int operacion;
        float n[] = new float[99];
        int cantidad;
        float num1 ,num2;
            
        System.out.println("-----CALCULADORA-----");
        
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Sen");
        System.out.println("6. Cos");
        System.out.println("7. Tan");
        System.out.println("8. Raiz enesima");
        System.out.println("9. Potencia enesima");
        System.out.println("10. Iva 19%");
        System.out.println("Elija la operacion a realizar");
        operacion= entradaDatos.nextInt();
       
        switch (operacion){
            case 1: 
                System.out.println("Cuántos números desea sumar?");
                cantidad = entradaDatos.nextInt();
            float resultado = (float)calculo.sumar(cantidad);
                System.out.println(""+resultado);
                break;

            case 2: 
               System.out.println("Cuántos números desea restar?");
                cantidad = entradaDatos.nextInt();
                 resultado =(float)calculo.restar(cantidad);                
                 System.out.println(""+resultado);
                break;
            case 3: 
                 System.out.println("Cuántos números multiplicar?");
                cantidad = entradaDatos.nextInt();
                 resultado =(float)calculo.multiplicar(cantidad);                
                 System.out.println(""+resultado);
                break;
            case 4:
                  System.out.println("dividendo : ");
                num1 = entradaDatos.nextFloat();
                 System.out.println("Ingrese el divisor : ");
                num2 = entradaDatos.nextFloat();
                
                if(num2 == 0){
                    System.out.println("ERROR ");
                }
                else{
                System.out.println("la respuesta es : "+calculo.Division(num1, num2));
                }
              
              break;    
            case 5: 
                System.out.println("Ingrese el angulo : ");
                num1 = entradaDatos.nextFloat();
                System.out.println("la respuesta es : "+calculo.seno(num1));
                break;
            case 6: 
                System.out.println("Ingrese el angulo : ");
                num1 = entradaDatos.nextFloat();
                System.out.println("la respuesta es : "+calculo.cos(num1));
                break;
            case 7: 
                System.out.println("Ingrese el angulo : ");
                num1 = entradaDatos.nextFloat();
                if (num1== 90){System.out.println("ERROR");}
                else{
                System.out.println("la respuesta es : "+calculo.tan(num1));
                }
                break;
            case 8: 
                 System.out.println("Ingrese la base : ");
                num1 = entradaDatos.nextFloat();
                 System.out.println("Ingrese el exponente : ");
                num2 = entradaDatos.nextFloat();
                System.out.println("la respuesta es : "+calculo.raiz(num1, num2));
              
                break;
            case 9:
                System.out.println("Ingrese la base : ");
                num1 = entradaDatos.nextFloat();
                 System.out.println("Ingrese el exponente : ");
                num2 = entradaDatos.nextFloat();
                System.out.println("la respuesta es : "+calculo.potencia(num1, num2));
                break;
            case 10:
                 System.out.println("Ingrese el valor del ue desea saber el iva");
                num1 = entradaDatos.nextFloat();
                System.out.println("la respuesta es : "+calculo.iva(num1));
                break;
                
            default:
                System.out.println("Operacion no valida");
             }
            
        }  
       
    
     
}
