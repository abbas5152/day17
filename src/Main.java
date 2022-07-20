import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Date in dd-MM-yyyy");
        String s=s1.next();
        try{
            System.out.println(EmployeeBonus.Bonus(s));

        }
        catch (InvalidAge ig){
            System.out.println(ig.getMessage());
        }
        catch(DateTimeParseException dtp){
            InvalidAge ii=new InvalidAge("Please pass the date in the correct format");
            System.out.println(ii.getMessage());
        }
    }
}
