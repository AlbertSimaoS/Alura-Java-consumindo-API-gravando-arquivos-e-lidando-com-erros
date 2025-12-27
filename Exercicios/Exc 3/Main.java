import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String json = """
                        {
                        "nome": "João",
                        "idade": 25,
                        "cidade": "São Paulo"
                        }
                    """;

        Gson gson = new GsonBuilder().
                setLenient().//deixa o parser mais tolerante a pequenos erros de formatação.
                create();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
