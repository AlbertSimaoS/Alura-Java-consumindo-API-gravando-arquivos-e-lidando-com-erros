import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Title title = new Title("O Auto da Compadecida", 2000, 104);

        Gson gson = new Gson();

        String json = gson.toJson(title);

        System.out.println(json);
    }
}
