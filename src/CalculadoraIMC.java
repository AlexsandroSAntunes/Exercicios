import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Coleta de dados

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite seu altura (m): ");
        double altura = scanner.nextDouble();

        //Calculo do IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado
        System.out.printf("Seu IMC é %.2f.", imc);

        // Estrutura de controle if-else para determinar o imc
        if (imc <  18.5) {
            System.out.println("Você está a baixo do peso");
        } else if (imc < 25) {
            System.out.println("Você está com o peso normal");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso");
        } else if (imc < 35) {
            System.out.println("Você está com obesidade grau I");
        } else if (imc < 40) {
            System.out.println("Você está com obesidade grau II");
        } else  {
            System.out.println("Você está com obesidade grau III(mórbida)");
        }
        scanner.close();
    }
}
