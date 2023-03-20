import java.util.Scanner;

public class reto2_2  {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de notas a evaluar: ");
        int cantidadNotas = lectura.nextInt();

        double[] notas = new double[cantidadNotas];
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese la nota " + (i+1) + ": ");
            notas[i] = lectura.nextDouble();
        }
        double sumaNotas = 0;
        for (double nota : notas) {
            sumaNotas += nota;
        }
        double promedioNotas = sumaNotas / cantidadNotas;
        if (promedioNotas < 3) {
            System.out.println("Reprobaste");
        } else if (promedioNotas < 4) {
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        lectura.close();
    }
}
