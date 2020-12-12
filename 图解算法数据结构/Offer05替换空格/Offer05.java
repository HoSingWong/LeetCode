public class Offer05{
    public static String replaceSpace(String s){
        StringBuilder res = new StringBuilder();//初始化StringBuilder
        for(int i =0;i<s.length();i++){//遍历s中的每个字符
            if(s.charAt(i)==' '){
                res.append("%20");//当字符为空时，往res中添加%20
            }
            else{
                res.append(s.charAt(i));//当字符为空时，往res中添加字符
            }
        }
        return res.toString();//将res转换成字符串
    }
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
}
