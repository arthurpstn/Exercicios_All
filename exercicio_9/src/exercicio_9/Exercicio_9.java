
package exercicio_9;

import java.util.Scanner;

public class Exercicio_9 {


    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Todos os numeros sao positivos? ");
        System.out.println("Digite os numeros: ");
        double[] numeros = new double[7];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextDouble();
            if (numeros[i] < 0) {
                System.out.println("Nao, o numero " + numeros[i] + " eh negativo");
            }
            else{
                System.out.println("Sim,o numero "+ numeros[i] +" e positivo");
            }
        }
        scanner.close();
    }
    
}
