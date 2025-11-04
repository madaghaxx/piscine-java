import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args == null || args.length < 2) return;

        try (Reader reader = new BufferedReader(new FileReader(args[0]));
             Writer writer = new BufferedWriter(new FileWriter(args[1]))) {

            boolean newWord = true;
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;

                if (Character.isLetter(c)) {
                    if (newWord) {
                        c = Character.toUpperCase(c);
                    } else {
                        c = Character.toLowerCase(c);
                    }
                    newWord = false;
                } else if (Character.isDigit(c)) {
                    newWord = false;
                } else {
                    newWord = true;
                }

                writer.write(c);
            }
            writer.flush();
        }
    }
}