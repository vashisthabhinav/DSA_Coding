package DSA.Recursions;

public class B_14_Skip {
    public static void main(String[] args) {
        String s = "I live in india.";
        skipChar("", s);
        System.out.println(skipChar(s));
        System.out.println(skipString(s));
        System.out.println(skipNotRequiredString(s));
    }

    static void skipChar(String processed , String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch != 'a'){
            skipChar(processed + ch , unprocessed.substring(1));
        }else{
            skipChar(processed , unprocessed.substring(1));
        }
    }

    static String skipChar(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }
        char ch = unprocessed.charAt(0);
        if (ch != 'a'){
            return ch + skipChar( unprocessed.substring(1));
        }else{
            return skipChar( unprocessed.substring(1));
        }
    }
    static String skipString(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }
        String toBeRemoved = "india";
        if (unprocessed.startsWith(toBeRemoved)){
            return skipString( unprocessed.substring(toBeRemoved.length()));
        }else{
            return unprocessed.charAt(0) + skipString( unprocessed.substring(1));
        }
    }

    static String skipNotRequiredString(String unprocessed){
        if (unprocessed.isEmpty()){
            return "";
        }
        String notRequired = "in";
        String startingWith = "india";
        if (unprocessed.startsWith(notRequired) && !unprocessed.startsWith(startingWith)){
            return skipNotRequiredString( unprocessed.substring(notRequired.length()));
        }else{
            return unprocessed.charAt(0) + skipNotRequiredString( unprocessed.substring(1));
        }
    }
}