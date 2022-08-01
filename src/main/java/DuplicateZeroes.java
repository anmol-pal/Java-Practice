public class DuplicateZeroes {
    public static void main(String[] args) {
    DuplicateZeroes dz = new DuplicateZeroes();
    int [] arr1= {1,0,2,3,0,4,5,0};
    int [] arr3= {1,2,3};
    int [] arr2= {0,4,1,0,0,8,0,0,3};
//    int [] arr2= {8,4,5,0,0,0,0,7};
    int [] arr={1,5,2,0,6,8,0,6,0};
    dz.duplicateZeros(arr2);
    for(int x: arr2){
        System.out.print(x);
    }
    }
    public void duplicateZeros(int[] arr) {
// Calculate Number of Possible duplicate Zeroes
        int j = 0, k = 0, toduplicate = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                toduplicate++;
            }
        }
        k = arr.length - 1 - toduplicate;
        for (int i = arr.length - 1; i > 0; i--, k--) {

        }

    }}
