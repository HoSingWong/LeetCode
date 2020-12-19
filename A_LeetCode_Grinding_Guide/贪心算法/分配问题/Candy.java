import java.util.Arrays;
class Candy {
    public static int candy(int[] ratings) {
        int size=ratings.length;
        if(size<2){
            return size;
        }
        int[] num=new int[size];//初始化数组长度
        int sum=0;
        Arrays.fill(num,1);//将初始化的数组全部置1
        for(int i=1;i<size;i++){
            if (ratings[i]>ratings[i-1]){
                num[i]=num[i-1]+1;
            }
        }
        for (int i=size-1;i>0;i--){
            if (ratings[i]<ratings[i-1]){
                num[i-1]=Math.max(num[i-1],num[i]+1);
            }
        }
        for (int n :num){//遍历数组中的每个元素
            sum+=n;
        }
        return sum;
    }
    public static void main(String[] args){
        int [] ratings=new int[]{1,0,2};
        System.out.println(candy(ratings));
    }
}
