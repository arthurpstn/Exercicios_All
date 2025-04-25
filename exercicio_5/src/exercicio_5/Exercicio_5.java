
package exercicio_5;

import java.util.Scanner;
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o maior numero?");
        System.out.println("Digite 10 numeros: ");
        float[] numeros = new float[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextFloat();
        }
        float maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior numero eh: " + maior);
        scanner.close();
    }
    }