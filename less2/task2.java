package less2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task2 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("less2", "file.txt");
        if (!Files.exists(file)) {
            Files.createFile(file);
        }
        
        String text = "TEXT ";
        text = text.repeat(100);
        byte[] bytes = text.getBytes();
        Files.write(file, bytes);
    }
}