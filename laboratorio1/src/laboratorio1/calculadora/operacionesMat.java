/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1.calculadora;

import java.util.Scanner;

/**
 *
 * @author Alejandra Alza y Daniela Rojas
 */
public class operacionesMat {
    
    Scanner entradaDatos = new Scanner (System.in);
    
     public float resultado;
     public float n[]; //= new float[Integer.parseInt(entradaDatos)];
     public double num1;
     public double num2;
     public float numd1;
     public float numd2;
    
    public operacionesMat(){
        num1=0;
        num2=0;
        numd1=0;
        numd2=0;
        resultado=0;
    }
    
    public double sumar(double numero){
        
         System.out.println("Digite los numeros a sumar");
       int tamano=entradaDatos.nextInt();
         n = new float[tamano];
        for (int i=0; i<numero; i++){
               
                n[i] = entradaDatos.nextInt();
                resultado+=n[i];
        }
        return resultado;
    }
    
    
    public double restar(double contador){
        
         System.out.println("Digite los numeros a restar");
       
        for (int i=0; i< contador; i++){
            n[i] = entradaDatos.nextInt();
            if(i==0){
                resultado=n[i];
            }
            else{ 
                resultado = resultado - n[i];
            }
        }
        return resultado;
    }
    public double multiplicar(double contador){
        
         System.out.println("Digite los numeros a multiplicar");
       
        for (int i=0; i< contador; i++){
            n[i] = entradaDatos.nextInt();
            if(i==0){
                resultado=n[i];
            }
            else{ 
                resultado = resultado* n[i];
            }
        }
        return resultado;
    }
    
  public float Division(float n1, float n2){
       numd1=n1;
       numd2=n2;
       return numd1/numd2;
   }
    public double potencia(double n1, double n2){
        num1= n1;
        num2= n2;
        return Math.pow(num1,num2);
    }
    public double raiz(double n1, double n2){
        num1=n1;
        num2=n2;
        return Math.pow(num1,(1/num2));
    }
    
    public double iva(double n1){
        num1=n1;
        return num1*0.19;
    }
    
    public double seno(double n){
        num1 = Math.toRadians(n);
        return Math.sin(num1);
    }
    
    public double cos(double n){
        num1 = Math.toRadians(n);
        return Math.cos(num1);
    }
    
    public double tan(double n){
        
        num1 = Math.toRadians(n);
        return Math.tan(num1);
    }
   
  
}
