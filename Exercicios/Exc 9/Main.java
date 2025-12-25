import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Title title = new Title("O Auto da Compadecida", 2000, 104);

        Gson gson = new Gson();

        String json = gson.toJson(title);

        System.out.println(json);
    }
}
