import java.util.Scanner;

public class MainDivisaoCalculator {
    public static void main(String[] args) {

        try {
            Scanner sc =new Scanner (System.in);
            System.out.print("Digite o primeiro número: ");
            String n1 = sc.next();
            System.out.print("Digite o segundo número: ");
            String n2 = sc.next();
            if (n1.isEmpty() || n2.isEmpty()) {
                throw new StringVaziaException("Dados incorretos");

            }
            DivisaoCalculator calcular = new DivisaoCalculator();
            float resultado = calcular.Dividir(Integer.parseInt(n1), Integer.parseInt(n2));
    
            System.out.print("resultado: " + resultado);
    
        }
        catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("Dados incorretos");
        }
        catch (StringVaziaException stringVaziaException) {
            System.out.println(stringVaziaException.getMessage());
        }


    }
}
