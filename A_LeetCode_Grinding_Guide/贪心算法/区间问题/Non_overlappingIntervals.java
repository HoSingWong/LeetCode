import java.util.Arrays;
import java.util.Comparator;
public class Non_overlappingIntervals {
    public static int intervalSchedule(int[][] intervals) {
        if (intervals.length == 0) return 0;
        int n=intervals.length;
        // 按 b 升序排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        int total=0;
        int prev=intervals[0][1];
        for (int i=1;i<n;i++){
            if(intervals[i][0]<prev){
                total+=1;
            }
            else{
                prev=intervals[i][1];
            }
        }
        return total;
    }
    public static void main(String[] args){
        int [][] intvs=new int[][]{{1, 2}};
        System.out.println(intervalSchedule(intvs));
    }
}
