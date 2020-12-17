import java.util.Arrays;
public class AssignCookies {
    public static int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);//从小到大排序
        Arrays.sort(s);//从小到大排序
        int child=0;//孩子i
        int cookies=0;//饼干j
        while (child<g.length && cookies< s.length){
            if (g[child]<=s[cookies]){//能够喂饱孩子
                child++;//吃饱的孩子i
            }
            cookies++;//投喂出去的饼干j
        }
        return child;
    }
    public static void main(String[] args){
        int [] g=new int[]{1,2,3};
        int [] s=new int[]{1,3};
        System.out.println(findContentChildren(g,s));

    }
}
