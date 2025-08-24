import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        String json = """
                        {
                        "nome": "João",
                        "idade": 25,
                        "cidade": "São Paulo"
                        }
                    """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);
    }
}
