import java.util.Scanner;
public class Ex02 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        int n1,n2,n3;

        System.out.print("Informe o primeiro número: ");
        n1 = ler.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = ler.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = ler.nextInt();

        if ( n1 > n2 && n1 >n3 ){
            System.out.println("O número 1 é maior");
        }
        else if ( n2 > n3 && n2 >n1 ){
            System.out.println("O número 2 é maior");
        }
        else {
            System.out.println("O número 3 é maior");
        }


    }
}