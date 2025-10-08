import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DOB1 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(CYAN + "Enter Day of Birth (1-31): " + RESET);
        int day = sc.nextInt();
        System.out.print(CYAN + "Enter Month of Birth (1-12): " + RESET);
        int month = sc.nextInt();
        System.out.print(CYAN + "Enter Year of Birth (e.g., 2000): " + RESET);
        int year = sc.nextInt();
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        String dayOfWeek = dob.getDayOfWeek().toString();
        System.out.println(GREEN + "You were born on: " + YELLOW + dayOfWeek + RESET);
        // Total days lived
        long totalDays = ChronoUnit.DAYS.between(dob, today);
        // Total weeks lived
        long totalWeeks = totalDays / 7;
        // Total months lived
        Period period = Period.between(dob, today);
        int totalMonths = period.getYears() * 12 + period.getMonths();
        // Total years lived
        int totalYears = period.getYears();
        System.out.println(BLUE + "Total years lived: " + PURPLE + totalYears + RESET);
        System.out.println(BLUE + "Total months lived: " + PURPLE + totalMonths + RESET);
        System.out.println(BLUE + "Total weeks lived: " + PURPLE + totalWeeks + RESET);
        System.out.println(BLUE + "Total days lived: " + PURPLE + totalDays + RESET);
        // Current Date and Time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(RED + "Current Date and Time: " + YELLOW + now.format(dtf) + RESET);

        sc.close();
    }
}
