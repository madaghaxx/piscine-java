
import java.io.IOException;

public class FileManager {

    public static void createFile(String fileName, String content) throws java.io.IOException {
        java.nio.file.Files.writeString(
                java.nio.file.Paths.get(fileName),
                content,
                java.nio.charset.StandardCharsets.UTF_8,
                java.nio.file.StandardOpenOption.CREATE);
    }

    public static String getContentFile(String fileName) throws java.io.IOException {
        java.nio.file.Path path = java.nio.file.Paths.get(fileName);
        byte[] data = java.nio.file.Files.readAllBytes(path);
        return new String(data, java.nio.charset.StandardCharsets.UTF_8);
    }

    public static void deleteFile(String fileName) throws IOException {
        java.nio.file.Files.deleteIfExists(java.nio.file.Paths.get(fileName));
    }
}
