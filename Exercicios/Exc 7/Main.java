import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o usuario que deseja buscar: ");
        String gitHubUser = scanner.next();

        String address = "https://api.github.com/users/" + gitHubUser;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(address))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            validateUser(response.statusCode());

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                    .create();

            String json = response.body();

            UserOmdb user = gson.fromJson(json, UserOmdb.class);
            System.out.println(user);

        } catch (UserDoesntExistException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao acessar.");
        }
    }

    public static void validateUser(int statusCode){
        if(statusCode == 404)
            throw new UserDoesntExistException("Usuario não encontrado.");
    }
}
