package educ.leet_code.other.polindrom_number;


public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(11211));

    }


    public static boolean isPalindrome(int x) {

 String s = String.valueOf(x);

 int length = s.length();


 if(length%2 == 0){

     String s1 = s.substring(0, length/2);
     String s2 = new StringBuilder(s.substring(length/2, length)).reverse().toString();

     return s1.equals(s2);

 }else {

     String s1 = s.substring(0, length/2 + 1);
     String s2 = new StringBuilder(s.substring(length/2, length)).reverse().toString();

     return s1.equals(s2);
 }



    }
}
