import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro parâmetro: ");
        n1 = teclado.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        n2 = teclado.nextInt();

        try {
            contar(n1, n2);
        } catch (IllegalArgumentException e) {
            // Imprime a mensagem da exceção
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) {
        // Verificar se o primeiro parâmetro é maior que o segundo
        if (parametro1 > parametro2) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int cc = parametro2 - parametro1;
        // Imprimir os números incrementados
        for (int c = 1; c <= cc; c++) {
            System.out.println("Imprimindo o número " + c);
        }
    }
}
