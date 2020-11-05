package day1;

public class PalindromeTask3 {
    public static void main(String[] args) {
        String pali = "Palindrome";
        String pali1 = "not Palindrome";
            if (pali.equals("Palindrome")){
                System.out.println(pali);
            }else{
                System.out.println(pali1);
            }
            //real approach
        String str = "abcdcba";
            boolean check = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("Palindrome");
            }else{
            System.out.println("Not Palindrome");

        }

    }
}
