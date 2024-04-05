import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberStatsFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String inputFileName = scanner.nextLine();

        try {
            ArrayList<Double> numbers = readNumbersFromFile(inputFileName);
            if (numbers != null && numbers.size() > 0) {
                double min = Collections.min(numbers);
                double max = Collections.max(numbers);
                double sum = 0;

                for (double num : numbers) {
                    sum += num;
                }

                double average = sum / numbers.size();
                double range = max - min;

                System.out.println("Minimum: " + min);
                System.out.println("Maximum: " + max);
                System.out.println("Average: " + average);
                System.out.println("Range: " + range);
            } else {
                System.out.println("No numbers found in the file.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static ArrayList<Double> readNumbersFromFile(String fileName) throws IOException {
        ArrayList<Double> numbers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        while ((line = reader.readLine()) != null) {
            try {
                double number = Double.parseDouble(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Warning: Ignoring non-numeric value: " + line);
            }
        }

        reader.close();
        return numbers;
    }
}
