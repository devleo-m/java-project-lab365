import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int laco = 0;
        String loop = " ";

        if (loop != "SAIR") {
            do {
                System.out.println("Digite o primeiro numero: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = scanner.nextDouble();
                System.out.println("""
                        Digite a operacao que voce deseja calcular
                        adicao: "1"
                        subtracao: "2"
                        multiplicacao: "3"
                        Divisao: "4"
                        """);
                String operacao = scanner.next();
                switch (operacao) {
                    case "1":
                        System.out.println(calc.adicao(num1, num2));
                        laco = 1;
                        break;
                    case "2":
                        System.out.println(calc.subtracao(num1, num2));
                        laco = 1;
                        break;
                    case "3":
                        System.out.println(calc.multiplicacao(num1, num2));
                        laco = 1;
                        break;
                    case "4":
                        System.out.println(calc.divisao(num1, num2));
                        laco = 1;
                        break;
                    default:
                        System.out.println("Operacao invalida, tente novamente :)");
                        laco = 2;
                        break;
                }
            } while (laco == 2);
            System.out.println("Deseja sair do programa? Digite: 'SAIR'");
            System.out.println("Se quiser continuar calculando digite qualquer coisa :)");
            loop = scanner.next();
        } else {
            System.out.println("OBRIGADO!!");
        }

        scanner.close();
    }
}
