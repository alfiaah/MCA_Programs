import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerger {
    public static void main(String[] args) {
        String file1Path = "asw.txt";
        String file2Path = "haii.txt";
        String mergedFilePath = "merged_file.txt";

        try {
            mergeFiles(file1Path, file2Path, mergedFilePath);
            System.out.println("Files merged successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void mergeFiles(String file1Path, String file2Path, String mergedFilePath) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
             BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFilePath))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            while ((line = reader2.readLine()) != null) {

                writer.write(line);
                writer.newLine();
            }
        }
    }
}
