import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String json = """
                        {
                       "titulo": "Java Essencial",
                       "autor": "José Silva",
                       "editora": {
                       "nome": "Editora Tech",
                       "cidade": "São Paulo"
                        }
                        }
                    """;

        Gson gson = new GsonBuilder().setLenient().create();

        Livro livro = gson.fromJson(json, Livro.class);
        System.out.println(livro);
    }
}
