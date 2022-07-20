import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Age {
    public  static int age(String age) throws  InvalidAge {
        try {
        LocalDate ld=LocalDate.parse(age, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
       // System.out.println(ld);

            int y = (int) ChronoUnit.YEARS.between(ld, LocalDate.now());
            if (y > 0) {
                y = y;
            } else if (ChronoUnit.DAYS.between(ld, LocalDate.now()) < 0) {
                y = -1;

            }
            return y;
        }
        catch (DateTimeParseException dtp){
            InvalidAge ig=new InvalidAge("Enter Proper format");
            throw ig;
        }
//       else{
//           InvalidAge ig=new InvalidAge("proper format");
//           throw ig;
//       }





    }

    public static void main(String[] args) {
      try{
          Scanner s1=new Scanner(System.in);
          String a=s1.next();
          if(age(a)==-1){
              System.out.println("Date should not be in Future");

          }
          else{
              System.out.println(age(a));
          }

      }catch (InvalidAge ig){
          System.out.println(ig.getMessage());
      }
    }

}
