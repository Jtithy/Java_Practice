
public class StringMethods {

    public static void main(String[] args) {
        String name = "Tithy";
        //Length of the string
        int value = name.length();
        System.err.println(value);
        //toLowerCase
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //toUpperCase
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        //trim
        String nonTrimmedString = "      Tithy    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        //substring(int start)
        System.out.println(name.substring(2));
        //substring(int start, int end)
        System.out.println(name.subSequence(2, 4));
        //replace(char oldChar, char newChar)
        System.out.println(name.replace('y', 'i'));
        //replace(CharSequence target, CharSequence replacement)
        System.out.println(name.replace("t", "ri"));
        //startsWith
        System.err.println(name.startsWith("Ti"));
        System.err.println(name.startsWith("Ri"));
        //endsWith
        System.err.println(name.endsWith("hy"));
        System.err.println(name.endsWith("hi"));
        //charAt
        System.err.println(name.charAt(3));
        //indexOf
        System.out.println(name.indexOf("hy"));
        //lastIndexOf
        System.out.println(name.lastIndexOf("hy", 1));
        //equals
        System.out.println(name.equals("Tithy"));
        System.out.println(name.equals("tithy"));
        //equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("tithy"));
        //escape sequences
        System.out.println("I am \"Tithy\"");
    }
}
