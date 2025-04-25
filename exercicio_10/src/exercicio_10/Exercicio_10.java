
package exercicio_10;

import java.util.Scanner;
public class Exercicio_10 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] v1 = new double[5];
        double[] v2 = new double[5];
        System.out.println("Os vetores sao iguais?");
        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = scanner.nextDouble();
        }
        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = scanner.nextDouble();
        }
        boolean iguais = true;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != v2[i]) {
                iguais = false;
                break;
            }
        }
        if (iguais) {
            System.out.println("Os vetores sao iguais.");
        } else {
            System.out.println("Os vetores sao diferentes.");
        }
        scanner.close();
    }
    
}

