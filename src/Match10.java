import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match10 {

        private static final String REGEX ="a*";
        private static final String INPUT = "a";

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
