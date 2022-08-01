public class SortByParity {
    public static void main(String[] args) {
        int nums[]={3,1,2,4};
        int nums2[]={0};
        SortByParity sortByParity=new SortByParity();
        nums2=sortByParity.sortArrayByParity(nums);
        for(int x: nums2){
            System.out.print(x);
        }
    }
    public int[] sortArrayByParity(int[] nums) {
        int j=0,temp=0;
    if(nums.length>1){
        for(int i=0; i< nums.length; i++){
            if(nums[i]%2==0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
    }
    return nums;
    }
}
