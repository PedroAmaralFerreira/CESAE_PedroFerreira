package FichaPratica05;
import java.util.Scanner;
public class Ex_07 {
    public static void main(String[] args) {

        // Importar scanner
        Scanner scanner = new Scanner(System.in);

        // Declarar variaveis
        int[] num = new int[10];

        // Introduzir numeros
        for (int i = 0; i < num.length; i++) {
            System.out.print("Introduza o "+(i+1)+"º número: ");
            num[i] = scanner.nextInt();
        }

        int numMaior = num[0];

        // Verificar numero par maior
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 && num[i]>numMaior)
                numMaior = num[i];
        }

        // Apresentar numero pair maior
        System.out.println("O maior número par é "+numMaior);
    }
}
