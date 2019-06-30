package utilities;

public class StringUtility {

        public static void verifyEquals(String expected, String actual) {
            if(expected.equals(actual)){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
                System.out.println("expected: "+expected);
                System.out.println("actual: "+actual);
            }
        }

    }


