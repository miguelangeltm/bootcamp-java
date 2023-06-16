import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] personas = new String[10];
        personas[0] = "Lucas";
        personas[1] = "Aldo";
        personas[2] = "Pepita";
        personas[3] = "Juanito";
        personas[4] = "Miguel";
        personas[5] = "Sharon";
        personas[6] = "Jose";
        personas[7] = "Andrea";
        personas[8] = "Lucy";
        personas[9] = "Ezequiel";

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese su busqueda: ");
        String busqueda = sc.nextLine();

        //Arrays.stream(personas).filter(nombre -> nombre.contains(busqueda));

        for(String nombrePersona : personas){

            if(nombrePersona.startsWith(busqueda)){
                System.out.println("La persona encontrada: " +nombrePersona);
            }
        }
    }
}