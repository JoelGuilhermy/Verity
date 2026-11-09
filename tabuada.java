import java.util.Scanner;

public class tabuada {
	
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 5;
        int[] a = new int[TAM];
        int[] b = new int[TAM];
        int[] c = new int[TAM];
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor de A:");
            a[i] = ler.nextInt();
        }
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor de B:");
            b[i] = ler.nextInt();
        }
        
        System.out.print("\nC = [ ");
        for (int i = 0; i < TAM; i++) {
            c[i] = a[i] * b[i];
            System.out.print(c[i] + " ");
        }
        System.out.print("]");
        
        ler.close();
    }
}