import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Wages {
    public static void main(String[] args) {
        try {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Starting Date");
            String d1 = s1.next();
            System.out.println("Enter Ending date");
            String d2 = s1.next();

            LocalDate ld1 = LocalDate.parse(d1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate ld2 = LocalDate.parse(d2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            if (ChronoUnit.DAYS.between(ld1, ld2) <= 0) {
                System.out.println("Start date should be smaller than End date");
            } else {
                System.out.println(ChronoUnit.DAYS.between(ld1, ld2) * 1200);
            }
        }
        catch(DateTimeParseException dtp){
            System.out.println(dtp.getMessage());
        }


    }
}
