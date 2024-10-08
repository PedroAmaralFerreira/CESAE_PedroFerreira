package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex_03 {

    public static void copiarFicheiro(String pathOrigem, String pathDestino) throws IOException {

        Scanner scannerOrigem = new Scanner(new File(pathOrigem));

        FileWriter maquinaEscreverDestino = new FileWriter(new File(pathDestino));

        while (scannerOrigem.hasNextLine()){
            String linha = scannerOrigem.nextLine();
            maquinaEscreverDestino.append(linha);
        }

        maquinaEscreverDestino.close();

    }

    public static void main(String[] args) throws IOException{

        copiarFicheiro("exercicio_03.txt", "exercicio_03_Alternativa02.txt");

    }
}
