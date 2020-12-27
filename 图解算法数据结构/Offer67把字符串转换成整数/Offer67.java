public class Offer67{
    public static int strToInt(String str) {
        int res=0,bndry=Integer.MAX_VALUE/10;
        int i=0,sign=1,length=str.length();
        int temp;
        if (length==0){
            return 0;
        }
        while(str.charAt(i)==' '){
            i++;
            if(i==length){
                return 0;
            }
        }
        if (str.charAt(i)=='-'){
            sign=-1;
        }
        if (str.charAt(i)=='-' ||str.charAt(i)=='+'){
            i++;
        }
        for(int j = i; j < length; j++) {
            if(str.charAt(j) < '0' || str.charAt(j) > '9') break;
            if(res > bndry || res == bndry && str.charAt(j) > '7'){
                if(sign == 1){
                    temp=Integer.MAX_VALUE;
                }
                else{
                    temp=Integer.MIN_VALUE;
                }
                return temp;
            }
            res = res * 10 + (str.charAt(j) - '0');
        }
        return sign*res;
    }
    public static void main(String[] args){
        String str="42";
        System.out.println(strToInt(str));
        String str2="-42";
        System.out.println(strToInt(str2));
    }
}
