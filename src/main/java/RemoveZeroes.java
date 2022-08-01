public class RemoveZeroes {
    public static void main(String[] args) {
        RemoveZeroes rm = new RemoveZeroes();
        int arr2[]={0,1,0,3,12};
        int arr1[]={1,2,0,3,4,5};
        int arr[]={0,0,1};
        rm.movezeroes(arr);
    }
    public void movezeroes(int arr[]){
        int nonzero=0,countzero=0;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]!=0){
                nonzero++;
            }
            else{
                countzero++;
                int j=i+1;
                while(j<arr.length){
                    arr[j-1]=arr[j];
                    j++;
                }
            }
            }
            for(int i=arr.length-1; i>= arr.length-countzero; i--){
            arr[i]=0;}
        for(int x:arr){
            System.out.print(x);
        }
    }
}
