import java.util.*;

public class ThirdMax {
    public static void main(String[] args) {
        int nums4[]={2,2,2,3,3,1};
        int nums[]={3,2,1};
        int nums2[]={1,2};
        int nums1[]={3,2,1};
        ThirdMax thirdMax= new ThirdMax();
        System.out.println("Output "+thirdMax.thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        Integer max = null, mid = null, min = null;
        for (int num : nums) {
            if (max == null || num > max) {
                min = mid;
                mid = max;
                max = num;
            } else if (mid == null || num > mid && num != max) {
                min = mid;
                mid = num;

            } else if (min == null || num > min && num != max && num != mid) {
                min = num;

            }
        }
            return min == null ? max : min;
    }
}


