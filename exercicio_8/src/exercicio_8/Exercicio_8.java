package exercicio_8;
import java.util.Scanner;
public class Exercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a soma dos pares? Qual a soma dos impares? ");
        int[] numeros = new int[10];
        int somaPares = 0, somaImpares = 0;
        System.out.println("Digite os numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            } else {
                somaImpares += numeros[i];
            }
        }
        System.out.println("A soma dos pares é: " + somaPares);
        System.out.println("A soma dos impares é: " + somaImpares);
        scanner.close();
    }
    
}
