import java.rmi.server.RemoteObject;

public class RemoveOc {
    public static void main(String[] args) {
        int nums2[]={3,2,2,3};
        int nums1[]={0,1,2,2,3,0,4,2};
        int nums[]={2};
        RemoveOc removeOc= new RemoveOc();
        int index=removeOc.removeElement(nums,3)    ;
        for(int i=0; i<index; i++){
            System.out.print(nums[i]);
        }
    }
    public int removeElement(int[] nums, int val) {
        int j=0;
//        if(nums.length>1){
            for(int i=0; i<nums.length; i++){
                if(nums[i]!=val){
                    nums[j]=nums[i];
                    j++;
                }
//            }
        }
        return j;
    }

}
