import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite números inteiros (0 para encerrar):");
        int num;
        while ((num = ler.nextInt()) != 0) {
            lista.add(num);
        }

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        System.out.println("Números multiplicados por 2:");
        for (int n : lista) {
            System.out.println(n * 2);
        }
    }
}
