
package exercicio_6;
import java.util.Scanner;
public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o produto dos 6 numeros?");
        int produto = 1;
        for (int i = 1; i <= 6; i++){
            System.out.println("Digite o " + i + "'o numero:");
            int numero = scanner.nextInt();
            produto = produto * numero;
        }
        System.out.println("O produto dos 6 numeros é: " + produto);
        scanner.close();
    }
    
}
