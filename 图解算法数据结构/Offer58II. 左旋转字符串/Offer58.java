public class Offer58{
    public static String reverseLeftWords(String s, int n) {
        String temp = s.substring(n,s.length())+s.substring(0,n);
        return temp;
    }
    public static void main(String[] args) {
        String s ="abcdefg";
        int n = 2;
        System.out.println(reverseLeftWords(s,n));       
    }
}
