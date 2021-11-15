import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match4 {
    private static final String REGEX ="[^abdf]ox";
    //any character of a or b or d or f following ox will recognised as an INVALID match
    private static final String INPUT = "The quick brown aox";
    //private static final String INPUT = "The quick brown box";
    //private static final String INPUT = "The quick brown dox";
    //private static final String INPUT = "The quick brown gox";

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
