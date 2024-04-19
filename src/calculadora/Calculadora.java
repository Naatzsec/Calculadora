
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Naatz
 */
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double x, y, rslt;
        String sinal;
        
        System.out.println("Calculadora simples");
        String linha = "---".repeat(15);
        System.out.println(linha);
        
        System.out.println("1. + (soma)\n2. - (subtração)\n3. / (divisão)\n4. * (multiplicação)\nDigite qual operação será feita: ");
        sinal = scan.nextLine();
        
        System.out.println("Digite o primeiro valor: ");
        x = scan.nextDouble();
        
        System.out.println("Digite o segundo valor: ");        
        y = scan.nextDouble();
        
        switch (sinal) {
            case "+":
                rslt = x + y;
                break;
            case "-":
                rslt = x - y;
                break;
            case "/":
                rslt = x / y;
                break;
            case "*":
                rslt = x * y;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }
        System.out.println("Resultado:" + rslt);
        
    }
    
}
