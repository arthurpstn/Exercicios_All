package ordeminversa;

import java.util.Scanner;

public class Ordeminversa {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeros[] = new int[10];
    
    System.out.println("Digite 10 numeros:");
    for (int i = 0; i < 10; i++){
        System.out.printf("Digite o %dº numero: ", i + 1);
        numeros[i] = scanner.nextInt();
    }
    System.out.println("Os numeros em ordem inversa:");
    for (int i = 9; i >= 0; i--){
        System.out.print(numeros[i] + " ");
    }
    scanner.close();
    }
}

