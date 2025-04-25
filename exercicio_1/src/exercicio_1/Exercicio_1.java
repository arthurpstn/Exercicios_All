
package exercicio_1;

import java.util.Scanner;
public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[10];
            System.out.println("Qual a soma dos numeros?");
            System.out.println("Digite 10 numeros:");
            for(int i = 0; i < 10; i++){
                numeros[i] =scanner.nextInt();
            }
            float soma = 0;
             for (int i = 0; i < 10; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma dos números é igual a: " + soma);
            scanner.close();
    }
    }
    

