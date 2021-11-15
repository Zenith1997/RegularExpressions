import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match14 {
    private static final String REGEX ="(abc){1}";
    private static final String INPUT = "abcabc";

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
