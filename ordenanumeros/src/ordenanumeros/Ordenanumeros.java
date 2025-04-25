package ordenanumeros;

import java.util.Scanner;

public class Ordenanumeros {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeros[] = new int[5];
    
    System.out.println("Digite 5 numeros:");
    for (int i = 0; i < 5; i++){
        System.out.printf("Digite o %dº numero: ", i + 1);
        numeros[i] = scanner.nextInt();
    }
    System.out.println("Numeros fora de ordem:");
    for (int i = 0; i < 5; i++){
        System.out.print(numeros[i] + " ");
    }
    for (int i = 0; i <5 - 1; i++){
        for (int n = 0; n < 5 - 1 - i; n++){
            if(numeros[n] > numeros[n + 1]){
                int temp = numeros[n];
                numeros[n] = numeros[n + 1];
                numeros[n + 1] = temp;
            }
        }
    }
    System.out.println("Os numeros em ordem crescente:");
    for (int i = 0; i < 5; i++){
        System.out.print(numeros[i] + " ");
    }
    scanner.close();
    }
}

