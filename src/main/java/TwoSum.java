import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
    TwoSum twoSum= new TwoSum();
    int arr1[]={2,7,11,15};
    int target=6;
    int arr[]={3,2,3};
    int[] output=twoSum.twoSum(arr,target);
    for(int x:output){
        System.out.print(x);
    }
    }

    public int[] twoSum(int[] nums, int target) {
        int [] output= new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            else
                map.put(nums[i],i);
        }
        return output;
    }
    // 75ms
/*    public int[] twoSum(int[] nums, int target) {
        int [] output;
        output=new int[2];
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                    return  output;
                }
            }
        }
        return output;
    } */

}
