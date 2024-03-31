import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileStats {
    public static void main(String[] args) {
        String filename = "sample.txt"; // Change this to your file's path

        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                wordCount += new StringTokenizer(line).countTokens();
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Number of characters: " + characterCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
    }
}
