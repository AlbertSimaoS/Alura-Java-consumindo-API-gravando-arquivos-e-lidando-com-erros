import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ConsultaLivroGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um livro para busca: ");
        var busca = leitura.nextLine();

        String buscaFormatada = URLEncoder.encode(busca, StandardCharsets.UTF_8);
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaFormatada;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Mostra apenas os primeiros 500 caracteres do JSON
        String corpo = response.body();
        int limite = Math.min(corpo.length(), 500);

        System.out.println("\n🔎 Resultado da busca (parcial):\n");
        System.out.println(corpo.substring(0, limite) + "...");

        leitura.close();
    }
}
