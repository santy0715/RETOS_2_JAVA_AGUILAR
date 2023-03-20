import java.util.Scanner;

public class reto2_3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int cant;
        boolean num2 = false;
        System.out.print("Ingrese la cantidad de numeros que desea ingresar ");
        cant = lectura.nextInt();
        int[] numeros = new int[cant];
        for (int i = 0; i < cant; i++) {
            System.out.print("Ingrese el numero #" + (i + 1));
            numeros[i] = lectura.nextInt();
        }
        for (int i = 0; i < cant; i++) {
            if (numeros[i] == 2) {
                num2 = true;
                break;
            }
        }
        if (num2) {
            System.out.println("El número 2 si está  en el array.");
        } else {
            System.out.println("El número 2 no está  en el array.");
        }
        lectura.close();
    }
}

