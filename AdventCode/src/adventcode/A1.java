package adventcode;
import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        ArrayList<Integer> barco = new ArrayList<Integer>();        
        int incrementos=0;
        Scanner leer = new Scanner (System.in);
        String auxiliar="";
        
        /*Mientras que el usuario no escriba parar o hayan menos de dos datos
        se ejecuta el program*/
        while(true){
            System.out.println("Coordenada numérica o \"parar\": ");
            auxiliar = leer.nextLine();
            if (auxiliar.toLowerCase().equals("parar") & barco.size()>=2) {
                break;
            }else if(auxiliar.toLowerCase().equals("parar") & barco.size()<2){
                System.out.println("Se necesita más de una coordenada para comparar");
                
            }
            try {
            int coordenada = Integer.parseInt(auxiliar);
            barco.add(coordenada);
            } catch (Exception e){
                System.out.println("Tienes que escribir un numero o \"parar\" (Siempre que haya más de 1 coordenada)");
            }
        }     
        
        for(int i=1; i<barco.size(); i++){ 
                    if(barco.get(i-1)<barco.get(i)){
                        incrementos+=1;
                    }
                }  
        System.out.println("Se ha incrmentado: " + incrementos + " veces");
        }
}


