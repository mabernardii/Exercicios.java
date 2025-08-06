import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota;
        while ((nota = ler.nextDouble())!=  -1) {
            notas.add(nota);
        }

        double soma = 0;
        for (double n : notas) soma += n;
        double media = soma / notas.size();

        int acimaDaMedia = 0;
        for (double n : notas)
            if (n > media) acimaDaMedia++;

        System.out.println("Média: " + media);
        System.out.println("Notas acima da média: " + acimaDaMedia);
    }
}