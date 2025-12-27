import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public static void generate(String fileName, String content) {
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao gerar arquivo", e);
        }
    }
}
