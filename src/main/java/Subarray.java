import java.util.ArrayList;

public class Subarray {
    public static void main(String[] args) {
        Subarray subarray= new Subarray();
        int [] arr= {1, 2, 3, 7, 5};
        int [] arr1= {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> l2=Subarray.subarraySum(arr,arr.length,12);
        for(int x: l2){
            System.out.println(""+x);
        }
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {
            ArrayList list= new ArrayList<Integer>();
            int i=0, sum=0;
            for(int j=i; j<arr.length; j++){
                System.out.println("J: "+j + " i:"+i);
                if(sum<=s && i<=j){
                    sum=sum + arr[j];
                    if(sum ==s){
                        list.add(i+1);
                        list.add(j+1);
                        System.out.println("Match");
                        return list;
                    }
                }
                else {
                    list.removeAll(list);
                    sum=0;
                    i++;
                    i=j;
                    System.out.println("Emptied");
                }
                System.out.println("sum:"+sum+ " i:"+ " j:");
            }
            System.out.println("Here");
            if(list.isEmpty()){
                list.add(-1);
            }
            return list;
        }

}

