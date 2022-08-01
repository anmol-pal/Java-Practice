import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HeightChecker {
    public static void main(String[] args) {
        int heights1[]={1,1,4,2,1,3};
        int heights[]={5,1,2,3,4};
        int heights2[]={1,2,3,4,5};
        HeightChecker heightChecker= new HeightChecker();
        System.out.println("Height: "+heightChecker.heightChecker(heights));
    }
    public int heightChecker(int[] heights) {
    int output=0;
    ArrayList arrayList= new ArrayList<Integer>();
    for(int x: heights){
        arrayList.add(x);
    }
    Collections.sort(arrayList);
    for(int i=0; i< arrayList.size(); i++){
        System.out.println(arrayList.get(i));
            if(heights[i] != (int)arrayList.get(i)){
            output++;
        }
    }
    return output;
    }

}
