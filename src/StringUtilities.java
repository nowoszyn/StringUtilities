import java.util.Arrays;

public class StringUtilities {

    private String globalStringVar; // null

    public static void main(String[] args) {
        String s = "animals";
        String sUP = "ANIMALS";
        System.out.println(Arrays.toString(new int[]{0, 1, 2, 3, 4, 5, 6}));
        System.out.println(Arrays.toString(s.toCharArray()));

        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(7)); //blad
        System.out.println(s.indexOf(0x61, 5));
        System.out.println(s.indexOf('a'));
        System.out.println(s.substring(0,3)); // <start, end )

        System.out.println(s.contains("n"));
        System.out.println(sUP.contains("n"));

        System.out.println(sUP.replace('A','a'));
    }
}
