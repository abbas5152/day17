import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {

    public static double Bonus(String d) throws InvalidAge{
        double b=0.0;
        LocalDate n= LocalDate.now();
        LocalDate ld=LocalDate.parse(d, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
       // Period diff= Period.between(ld,n);

//         else if(diff.getYears()<0){
//            InvalidAge ig=new InvalidAge("Age should not be in the future ");
//            throw  ig;
//        }
       // System.out.println(diff.getYears());
        if(ChronoUnit.MONTHS.between(ld,n)<12 && ChronoUnit.MONTHS.between(ld,n)>0){
             b= 5000.0;
        }
        else if(ChronoUnit.YEARS.between(ld,n)<2 && ChronoUnit.YEARS.between(ld,n)>=1){
            b=8000.0;
        }
        else if(ChronoUnit.YEARS.between(ld,n)>=2){
            b= 10000.0;
        }
                 else if(ChronoUnit.DAYS.between(ld,n)<0){
            InvalidAge ig=new InvalidAge("Age should not be in the future ");
            throw  ig;
        }


        return b;
    }





}
