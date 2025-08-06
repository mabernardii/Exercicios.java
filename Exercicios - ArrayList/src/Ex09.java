import java.util.ArrayList;
import java.util.Scanner;
public class Ex09 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            String palavra = ler.nextLine();
            palavras.add(palavra);
        }
        palavras.removeIf(palavra -> palavra.length() < 4);

        System.out.println("palavras com 4 ou mais letras:");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}