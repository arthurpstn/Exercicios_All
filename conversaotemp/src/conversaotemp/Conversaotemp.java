package conversaotemp;

import java.util.Scanner;

public class Conversaotemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    while (true) {
        System.out.println("Conversao de temperaturas");
        double f, c, k;
        System.out.println("Digite a opcao de conversao:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Fahrenheit para Kelvin");
        System.out.println("6 - Kelvin para Fahrenheit");
        System.out.println("7 - Sair do programa");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Digite a temperatura em Celsius:");
                c = scanner.nextDouble();
                f = (c * 9/5) + 32;
                System.out.println("A temperatura em Fahrenheit eh: " + f);
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit:");
                f = scanner.nextDouble();
                c = (f - 32) * 5/9;
                System.out.println("A temperatura em Celsius eh: " + c);
                break;
            case 3:
                System.out.println("Digite a temperatura em Celsius:");
                c = scanner.nextDouble();
                k = c + 273;
                System.out.println("A temperatura em Kelvin eh: " + k);
                break;
            case 4:
                System.out.println("Digite a temperatura em Kelvin:");
                k = scanner.nextDouble();
                c = k - 273;
                System.out.println("A temperatura em Celsius eh: " + c);
                break;
            case 5:
                System.out.println("Digite a temperatura em fahrenheit:");
                f = scanner.nextDouble();
                k = (f - 32) * 5/9 + 273;
                System.out.println("A temperatura em Kelvin eh: " + k);
                break;
            case 6:
                System.out.println("Digite a temperatura em kelvin:");
                k = scanner.nextDouble();
                f = (k - 273) *9/5 + 32;
                System.out.println("A temperatua em fahrenheit eh: " + f);
                break;
            case 7:
            System.out.println("Saindo do programa...");
            System.out.println("Obrigado por usar o programa!");
            System.exit(0);
            break;
            default:
                System.out.println("Opcao invalida!");
                break;  
        }
        System.out.println("Deseja continuar? (S/N)");
        String continuar = scanner.next();
        if(continuar.equalsIgnoreCase("S")){
            System.out.println("Continuando...");
        }else{
            System.out.println("Saindo do programa...");
            System.out.println("Obrigado por usar o programa!");
            System.exit(0);
        }
} 
} 
} 

