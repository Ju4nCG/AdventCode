package adventcode;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] arrayOrden = new String[2];
        int depth=0;
        int horizontal=0;
        System.out.println("Las ordenes tienen que estar compuestas por: \n"
                    + "forward + número\n"
                    + "down + número\n"
                    + "up + número\n"
                    + "Si deseas finalizar debes escribir \"parar\"");
        
        while(true){            
            System.out.println("");
            System.out.println("Orden y distancia a recorrer:");
            String orden = leer.nextLine();
            arrayOrden = orden.split(" ");
            String sentencia = arrayOrden[0];
            
            try {
                if(sentencia.toLowerCase().equals("parar")){
                    int resultado = depth*horizontal;
                    System.out.println("Tu posición es: " + resultado);
                    break;
                }else{
                    int desplazamiento = Integer.parseInt(arrayOrden[1]);  
                    switch (sentencia){
                        case "forward":
                            horizontal += desplazamiento;
                            break;
                        case "down":
                            depth += desplazamiento;
                            break;
                        case "up":
                            depth -= desplazamiento;
                            break;
                    }
                }
            } catch (Exception e){
                System.out.println("Tienes que escribir una orden (forward, down, up) junto a un número o parar");
            }          
            
        }
        
    }     
}
