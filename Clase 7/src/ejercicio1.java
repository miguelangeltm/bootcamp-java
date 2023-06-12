import java.util.Scanner;

/* Hacer un programa que permita al usuario ingresar 5 números y mostrarlos. */
public class ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("Ingrese 5 numeros enteros");
            numero[i] = sc.nextInt();
        }
        for (int i=0; i<5; i++){
            System.out.println(numero[i]);

        }

    }
}
