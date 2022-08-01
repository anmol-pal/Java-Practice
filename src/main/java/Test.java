public class Test {
    public static void main(String[] args) {
        int[] arr1={1,1,2};
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        Test test= new Test();
        int x=test.removedup(arr);
        for(int k=0; k<=x; k++){
            System.out.print(arr[k]);
        }
    }
    int removedup(int[]arr){
        if(arr.length==0 || arr==null){
            return 0;
        }
        int j=0, index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
                System.out.println(j);
            }
        }
        return j;
    }
}