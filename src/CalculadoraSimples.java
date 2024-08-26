import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();

        System.out.println("Soma " + (num1+num2));
        System.out.println("Divisão " + (num1-num2));
        System.out.println("Multiplicação " + (num1*num2));
        System.out.println("Divisão " + (num1/num2));
scanner.close();

    }
}
