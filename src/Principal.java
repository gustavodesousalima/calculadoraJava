import java.util.Scanner;

public class Principal extends Operacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado;
        char operacao;

        try {
            System.out.println("Bem-vindo à Calculadora Básica.");

            System.out.print("Dígite o primeiro número:");
            numero1 = scanner.nextDouble();

            System.out.print("Dígite a operação que você deseja Ex(+, -, *, /):");
            operacao = scanner.next().charAt(0);

            System.out.print("Dígite o segundo número:");
            numero2 = scanner.nextDouble();

            if (operacao == '+') {
                resultado = Operacoes.somar(numero1, numero2);
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '-') {
                resultado = Operacoes.subtrair(numero1, numero2);
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '*') {
                resultado = Operacoes.multiplicar(numero1, numero2);
                System.out.println("Resultado: " + resultado);
            } else if (operacao == '/') {
                resultado = Operacoes.dividir(numero1, numero2);
                System.out.println("resultado: " + resultado);
            } else {
                System.out.println("Operação inválida!");
            }
        } finally {
            scanner.close();
        }
    }

}