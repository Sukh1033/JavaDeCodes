
public class Palindrome {

    public static void main(String[] args) {

        int x = -121;
        //	int lengthX= String.valueOf(x).length();
        String s = String.valueOf(x);
        System.out.println(s);
        String s2 = "";

        for (int j = s.length() - 1; j >= 0; j--) {
            s2 = s2 + s.charAt(j);
        }

        if (s.equals(s2)) {
            System.out.println("Palindrome");
        } else {

            System.out.println(" Not a Palindrome");
        }

    }
}