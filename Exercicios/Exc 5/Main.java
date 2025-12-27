import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Digite o divisor");
        int divisor = scanner.nextInt();

        try{
            if (divisor == 0) {
                throw new DivisaoPorZeroException();
            } else {
                int resultado = dividendo / divisor;
                System.out.println("Resultado = " + resultado);
            }
        } catch (DivisaoPorZeroException e) {
            System.out.println(e.getMessage());
        }


    }
}
