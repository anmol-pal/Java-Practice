import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class DisappearedInArray {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        int [] nums={4,3,2,7,8,2,3,1};
        DisappearedInArray disappearedInArray=new DisappearedInArray();
        list=disappearedInArray.findDisappearedNumbers(nums);
        System.out.println(list);
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> list= new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        TreeSet <Integer>treeSet= new TreeSet();
        for(int i=0; i<nums.length; i++){
            treeSet.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        max = Math.max(max,nums.length);
        for(int i=1; i<=max; i++){
            if(!treeSet.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }
    }


