import com.google.gson.JsonObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try{
            if (senha.length() < 8) {
                throw new TamanhoDaSenhaException();
            } else {
                System.out.println("Senha: " + senha);
                System.out.println("Validada!");
            }
        } catch (TamanhoDaSenhaException e) {
            System.out.println(e.getMessage());
        }


    }
}
