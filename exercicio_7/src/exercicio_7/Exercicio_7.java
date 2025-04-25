
package exercicio_7;

import java.util.Scanner;
public class Exercicio_7 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeros[] = new int[5];
    
    System.out.println("Digite os numeros:");
    for (int i = 0; i < numeros.length; i++){
        System.out.printf("Digite o "+(i + 1)+"* numero: ");
        numeros[i] = scanner.nextInt();
    }
    System.out.println("Os numeros em ordem inversa:");
    for (int i = numeros.length - 1; i >= 0; i--){
        System.out.print(numeros[i] + " ");
    }
    scanner.close();
    }
    
}
