import java.util.Scanner;
public class Main {
    public static Double calc(double num1, String operador, double num2){
        switch (operador){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.println("""
                    Operador invalido
                    Voce deve digitar o operador correto para calcular
  
                        "+" adicao
                        "-" subtracao
                        "*" multiplicacao
                        "/" divisao
                        
                    tente novamente :)
                    """);
        }
        return null;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("""
                        Digite o operador que voce quer usar para calcular
                        "+" adicao
                        "-" subtracao
                        "*" multiplicacao
                        "/" divisao
                """);
        String operador = scanner.next();
        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        System.out.println("Resultado: "+ calc(num1,operador,num2));
    }
}
