import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] a = new int[10];
        boolean palin = true;

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite o valor de A " + (i + 1) + ": ");
            a[i] = ler.nextInt();
        }

        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                palin = false;
                break;
            }
        }

        if (palin) {
            System.out.println("O vetor A é um palíndromo.");
        } else {
            System.out.println("O vetor A não é um palíndromo.");
        }

        ler.close();
    }
}
