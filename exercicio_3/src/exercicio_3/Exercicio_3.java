package exercicio_3;
import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        System.out.println("Quanto numeros sao negativos?");
        System.out.print("Digite 15 números inteiros ");
        for(int i = 0; i < 15; i++){
            numeros[i] = scanner.nextInt();
    }
    int positivos = 0;
    int negativos = 0;
    int zero = 0;
        for(int i = 0; i < 15; i++){
            if(numeros[i] > 0){
                positivos++;
            }else if(numeros[i] < 0){
                negativos++;
            }else{
                zero++;
            }
        }
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
        System.out.println("Numeros iguais a zero: " + zero);
    }
    }
