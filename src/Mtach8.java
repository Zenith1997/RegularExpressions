import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mtach8 {
    //intersection
    private static final String REGEX ="[rcb]at[1-5&&[^^34]]";//negation intersection.

    private static final String INPUT = "rat2";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m  =p.matcher(INPUT);
        int count = 0;

        while(m.find()){
            count++;
            System.out.println("Mtach number"+count);
            System.out.println("Start()"+m.start());
            System.out.println("End()"+m.end());
            System.out.println("Match " +   m.group());
        }
    }
}
