package FichaPratica02;
import java.util.Scanner;
public class Ex_05 {
    public static void main(String[] args) {

        // Importar Scanner
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Ler os dois números introduzidos
        System.out.print("Introduzar um número: ");
        num1 = input.nextInt();
        System.out.print("Introduzar um número: ");
        num2 = input.nextInt();

        if (num1 < num2)
            System.out.println(num1 + "   " + num2);
        else
            System.out.println(num2 + "   " + num1);
    }
}
