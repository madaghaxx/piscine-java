
import java.io.*;

public class Cat {

    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) {
            return;
        }
        for (String path : args) {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(path));
            System.out.write(data);
        }
        System.out.flush();
    }
}
