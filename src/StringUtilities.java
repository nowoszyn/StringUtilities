import java.util.Arrays;

public class StringUtilities {

    private String globalStringVar; // null

    public static void main(String[] args) {
//        String s = "animals";
//        String sUP = "ANIMALS";
//        System.out.println(Arrays.toString(new int[]{0, 1, 2, 3, 4, 5, 6}));
//        System.out.println(Arrays.toString(s.toCharArray()));
//
//        System.out.println(s.length());
//        System.out.println(s.charAt(3));
//        System.out.println(s.charAt(0));
////        System.out.println(s.charAt(7)); //blad
//        System.out.println(s.indexOf(0x61, 5));
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.substring(0,3)); // <start, end )
//
//        System.out.println(s.contains("n"));
//        System.out.println(sUP.contains("n"));
//
//        System.out.println(sUP.replace('A','a'));

        StringBuilder sb = new StringBuilder();
        sb.append("sb-1");
        StringBuilder sb2 = sb.append("sb-2");
        sb2.append("sb-2");
        sb.append("sb-1-1");

        System.out.println(sb == sb2);
        System.out.println(sb);
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder();
        sb3.append("n")
                .append("i")
                .append("m")
                .append("a")
                .append("l")
                .append("s")
                .insert(0, "a");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder();
        sb4
                .append("i")
                .append("m")
                .append("a")
                .append("l")
                .insert(4, "s")
                .insert(0, "an")
                .deleteCharAt(6)
                .reverse();

        System.out.println(sb4);

    }
}
