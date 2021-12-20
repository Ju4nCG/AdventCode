package adventcode;
import java.util.Scanner;
import java.util.ArrayList;

public class A3 {
    public static void main(String[] args) {
        ArrayList<String> codigos = new ArrayList<String>();  
        Scanner leer = new Scanner (System.in);
        String codigo;
        int uno = 0;
        int cero = 0;
        String gamma="";
        String epsilon="";
        
        
        while(true){
            //Se pregunta 
            System.out.println("Código binario de 5 dígitos o \"parar\": ");
            codigo = leer.nextLine();           
            System.out.println("");
            
            //Si es parar que pare
            if (codigo.toLowerCase().equals("parar")) {
                break;
            }

            global: if(codigo.length()==5){//son 5 numeros
                for(int i=0; i < codigo.length(); i++){
                    if(codigo.charAt(i)!='1' & codigo.charAt(i)!='0'){
                        System.out.println("El codigo binario ha de estar compuesto por 5 digitos (0-1)");
                        break global;
                    }
                }                    
                codigos.add(codigo);
            }else{
                System.out.println("El codigo binario ha de estar compuesto por 5 digitos (0-1)");
            }                     
            
        } 
        
        /*Scar Numero Binario*/
        for(int i = 0; i < 5; i++) {
            cero=0;
            uno=0;
            //Dentro de cada codigo
                for(int j=0; j<codigos.size();j++){
                    if(codigos.get(j).charAt(i)=='0'){
                        cero += 1;                   
                    }else{
                        uno += 1;
                    }   
                }
            if(cero>uno){
                gamma+="0";
                epsilon+="1";
            }else{
                gamma+="1";
                epsilon+="0";
            }
        }
      
        int numGamma=convertirNum(gamma);
        System.out.println(convertirNum(gamma));
        int numEpsilon=convertirNum(epsilon);
        System.out.println(convertirNum(epsilon));
        int resultado = numGamma*numEpsilon;
        System.out.println("El resultado es: " + resultado);
        
        
    }
    
    public static int convertirNum(String numero){
            int decimal = 0;
            int exponente=(numero.length()-1);
            String auxiliar;           
            
            for(int i=0; i<numero.length(); i++){
                auxiliar = "" + numero.charAt(i);
                int numActual = Integer.parseInt(auxiliar);
                decimal+=(numActual*(Math.pow(2, exponente)));             
                --exponente;
            }
            
            return decimal;
    }
}