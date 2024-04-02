import java.util.StringTokenizer;

public class IntegerSum {
    public static void main(String[] args) {
        // Sample line of integers
        String line = "10 20 30 40 50";

        // StringTokenizer to tokenize the input line
        StringTokenizer tokenizer = new StringTokenizer(line);

        int sum = 0;

        // Iterate through tokens and display each integer
        System.out.println("Integers in the line:");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int num = Integer.parseInt(token);
            System.out.println(num);
            sum += num;
        }

        // Display the sum of all integers
        System.out.println("Sum of all integers: " + sum);
    }
}
