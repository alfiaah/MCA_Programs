import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMergeLine {
    public static void main(String[] args) {
        mergeFilesAlternately("asw.txt", "haii.txt", "output.txt");
    }

    public static void mergeFilesAlternately(String inputFile1, String inputFile2, String outputFile) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(new File(inputFile1)));
             BufferedReader reader2 = new BufferedReader(new FileReader(new File(inputFile2)));
             BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outputFile)))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    writer.write(line1);
                    writer.newLine();
                    line1 = reader1.readLine();
                }
                if (line2 != null) {
                    writer.write(line2);
                    writer.newLine();
                    line2 = reader2.readLine();
                }
            }
            System.out.println("Files merged successfully!");
        } catch (IOException e) {
            System.err.println("Error occurred while merging files: " + e.getMessage());
        }
    }
}
