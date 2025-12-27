import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String phrase = "Conteúdo a ser gravado no arquivo.";
        FileWriter text = new FileWriter("Arquivo.txt");
        text.write(phrase);
        text.close();
    }
}
