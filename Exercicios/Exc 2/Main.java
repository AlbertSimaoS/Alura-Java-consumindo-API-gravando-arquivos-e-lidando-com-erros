import com.google.gson.Gson; //Importa a classe Gson da biblioteca Google Gson para que você possa usá-la no código

public class Main { //Declara uma classe pública chamada Main(classe visivel para o todo o programa)
    public static void main(String[] args) {
        //Ponto de entrada do programa: o método main que a JVM chama ao executar a classe
        String json = """//Declara uma variável json do tipo String e a inicializa com um text block
                        {
                        "nome": "João",
                        "idade": 25,
                        "cidade": "São Paulo"
                        }
                    """;
        //Observação prática: as chaves do JSON ("nome", "idade", "cidade") devem corresponder aos nomes dos componentes do record Pessoa para que o mapeamento funcione automaticamente com Gson.

        Gson gson = new Gson(); //Cria uma instância de Gson usando a configuração padrão. Gson é a classe que faz a conversão entre JSON e objetos Java (serialização/deserialização)
        Pessoa pessoa = gson.fromJson(json, Pessoa.class); //Usa gson.fromJson para converter a String JSON em um objeto do tipo Pessoa.
                                                        //json é a fonte (texto JSON).
                                                        //Pessoa.class é o class literal que indica o tipo alvo da conversão
        System.out.println(pessoa); //Imprime no console a representação em String do objeto pessoa
    }
}
