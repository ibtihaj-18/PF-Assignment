// import java.lang.reflect.Array;
// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Set;
public class repInt {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 3, 2, 1, 4, 5, 2, 1};
        HashMap<Integer, Integer> fr = new HashMap<>();
        for(Integer num : numbers){
            Integer count = fr.get(num);
            if(count == null){
                fr.put(num,1);
            }
            else{
                fr.put(num, count+1);
                            System.out.println("Number is: " + num + "Frequency is: " + count);
            }

        }

    }
}
