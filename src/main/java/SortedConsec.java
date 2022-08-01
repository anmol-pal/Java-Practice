import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
public class SortedConsec {
    public static void main(String[] args) {
    int[] nums= {-4,-1,0,3,10};
    SortedConsec sortedConsec= new SortedConsec();
    nums= sortedConsec.sortedSquares(nums);
    for(int x:nums){
        System.out.println(" "+x);
    }
    }
    public int[] sortedSquares(int[] nums) {
        int l=nums.length;
        int[] f = new int[l];
        int s=0, e=l-1, i=l-1 ,a,b;
        while(s<e){
            a=nums[s]*nums[s]; b=nums[e]*nums[e];
            if(a>b){
                f[i]=a;
                s++;
            }else{
                f[i]=b;
                e--;
            }
            i--;
        }
    return f;
    }

}
