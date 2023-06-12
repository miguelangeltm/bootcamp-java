/*Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números
y se divide por 5, ya que el usuario agregó 5 números.*/

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[5];

        float acumulador=0;
        for (int i=0; i<5; i++) {
            System.out.println("Ingrese 5 numeros enteros");
            numero[i] = sc.nextInt();
        }
        for (int i=0; i<5; i++) {
            acumulador += (float) numero[i];

        }
    float promedio = acumulador/numero.length;
        System.out.println("El promedio es:" + promedio);
    }
}
