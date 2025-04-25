
package exercicio_2;
import java.util.Scanner;
public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            float[] numeros = new float[8];
            System.out.println("Qual a media?");
            System.out.println("Digite 8 numeros:");
            for(int i = 0; i < numeros.length; i++){
                numeros[i] =scanner.nextFloat();
            }
            float media = 0;
            for(int i = 0; i < numeros.length; i++){
                media += numeros[i];
            }
            media = media / numeros.length;
            System.out.println("A media é: " + media);
                scanner.close();
    }
    
}
    
