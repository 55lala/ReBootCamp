package day1;

public class AnagramTask6 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        if (a.length() != b.length()){
            System.out.println("Not Anagram");
            System.exit(0);

        }
        a = a.toLowerCase().replace("","");
        b = b.toLowerCase().replace("","");

        for (int i = 0; i <a.length() ; i++) {
           b =  b.replaceFirst("" + a.charAt(i),"");

        }
        if (b.isEmpty()){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
