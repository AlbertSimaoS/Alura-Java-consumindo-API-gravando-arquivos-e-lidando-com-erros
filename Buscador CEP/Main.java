import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsultationCEP consultationCEP = new ConsultationCEP();

        try {
            System.out.println("\tBuscador de CEP");
            System.out.println("Informe o CEP: ");
            String cep = scanner.next();

            Address address = consultationCEP.searchAddress(cep);

            String jsonFormatted = Formatting.format(address);

            System.out.println(jsonFormatted);

            FileGenerator.generate(cep + ".json", jsonFormatted);

            System.out.println("Arquivo gerado com sucesso.");

        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
