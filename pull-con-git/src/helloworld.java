import java.util.Scanner;

public class Cuatro_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número para convertir a binario: ");
        numero = sc.nextInt();

        int[] almacenar = new int[50];
        int cuenta = 0;

        // Guardar restos en orden inverso
        while (numero > 0) {
            almacenar[cuenta] = numero % 2;
            numero /= 2;
            cuenta++;
        }

        // Imprimir en orden inverso para mostrar binario correcto
        System.out.print("Binario: ");
        for (int i = cuenta - 1; i >= 0; i--) {
            System.out.print(almacenar[i]);
        }
    }
}



