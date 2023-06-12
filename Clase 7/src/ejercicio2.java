import java.util.Scanner;

/*Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.*/
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("Ingrese 5 numeros enteros");
            numero[i] = sc.nextInt();
        }

        int max = numero[0];  // Se asigna el primer elemento al Max
        int min = numero[0];  // Se asigna el primer elemento al Min
        System.out.println("===============================");

        for (int i=0; i<5; i++){
            if (numero[i] > max) {
                max = numero[i];
            }

            if (numero[i] < min) {
                min = numero[i];
            }
            System.out.println(numero[i]);

        }
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
    }
}
