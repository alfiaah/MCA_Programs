public class Time {
    private int hours;
    private int minutes;

    // Constructor to initialize time with default values
    public Time() {
        hours = 0;
        minutes = 0;
    }

    // Constructor to initialize time with specified values
    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to sum two time objects and return the result as a new Time object
    public Time sum(Time otherTime) {
        Time result = new Time();
        result.hours = this.hours + otherTime.hours;
        result.minutes = this.minutes + otherTime.minutes;

        // Adjust hours and minutes if minutes exceed 60
        if (result.minutes >= 60) {
            result.hours += result.minutes / 60;
            result.minutes %= 60;
        }

        return result;
    }

    // Method to display the time
    public void displayTime() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }

    public static void main(String[] args) {
        // Create three time objects
        Time time1 = new Time(2, 45);
        Time time2 = new Time(3, 30);
        Time time3;

        // Display the initial values of time objects
        System.out.println("Time 1:");
        time1.displayTime();
        System.out.println("Time 2:");
        time2.displayTime();

        // Calculate sum of time1 and time2
        time3 = time1.sum(time2);

        // Display the sum of time1 and time2
        System.out.println("\nSum of Time 1 and Time 2:");
        time3.displayTime();
    }
}
