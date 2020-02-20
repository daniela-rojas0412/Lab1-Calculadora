
package calculadora.interfaz;

/**
 *
 * @author daniela
 */
public class Operaciones {
    
    public String dato;
    public double numero1;
    public double numero2;
    
    Operaciones(){
        
      this.dato = "";
      this.numero1 = 0;
      this.numero2 = 0;
   
      
    }
    public String getDato() { return dato; }
    
    public void setDato(String dato) { this.dato = dato; }
    
    public void agregarnum(int num){
        
        setDato(dato + num);   
    }

    public void setnumero1(){ numero1=Double.parseDouble(dato); } 
    
    public void setnumero2(){ numero2=Double.parseDouble(dato);}
    
    
    
    public void dorrarDato (){
        dato = "";
    }
     public double suma(){
        
        dato = String.valueOf(numero1+numero2);
        
        return numero1+numero2;
    }
     
    public double resta(){
        dato =String.valueOf(numero1-numero2);
        return numero1-numero2;
    }
    public double multiplicacion(){
        dato = String.valueOf(numero1*numero2);
        return numero1*numero2;
    }
    public double division(){
        
        dato = String.valueOf(numero1/numero2);
        
        if (numero2 !=0){
        return numero1/numero2;
        }
        else{
        return 0;
        }

    }
     public double potencia(){
        dato = String.valueOf(Math.pow(numero1,numero2));
        return  Math.pow(numero1,numero2);
    }
        
    public double raiz(){
        dato = String.valueOf(Math.pow(numero1,(1/numero2)));
        return  Math.pow(numero2,(1/numero1));
    }
        
    public double iva(){
        dato = String.valueOf(numero1*0.19);
        return numero1*0.19;
    }
    
    public double seno(){
        
        numero2 = Math.toRadians(numero2);
        double res = Math.sin(numero2);
        dato = String.valueOf(res);
        return res;
    }
    
    public double coseno(){
            
        numero2 = Math.toRadians(numero2);
        double res = Math.cos(numero2);
        dato=String.valueOf(res);
        return res;
    }  
    
    public double tangente(){
        
        numero2 = Math.toRadians(numero2);
        double res = Math.tan(numero2);
        dato = String.valueOf(res);
        return res;
        
    }
      
    
}
