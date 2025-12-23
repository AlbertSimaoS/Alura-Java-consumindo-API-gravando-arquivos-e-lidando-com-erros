import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a Senha: ");
        String senha = scanner.next();

        try {
            validarSenha(senha);
            System.out.println("Senha validada!");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarSenha(String senha){
        if(senha.length() > 8)
            throw new SenhaInvalidaException("A senha não pode ter mais de 8 caracteres.");
    }
}
