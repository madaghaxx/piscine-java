
import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        if (args == null || args.length == 0) return;
        
        byte[] buffer = new byte[8192];
        for (String path : args) {
            try (InputStream in = new BufferedInputStream(new FileInputStream(path))) {
                int n;
                while ((n = in.read(buffer)) != -1)
                    System.out.write(buffer, 0, n);
            }
        }
        System.out.flush();
    }
}
