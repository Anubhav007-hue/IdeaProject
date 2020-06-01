import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Check {

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};

        int[] result=new int[stones.length];

        if (stones.length == 0) {
            System.out.println("0");
        }

        for (int i = 0; i < stones.length; i++) {
            result[i]=stones[i];
        }

        Arrays.sort(result);

        int weight = findWeight(result);

        System.out.println(weight);
    }


    private static int findWeight(int[] result) {
        if (result.length == 1) {
            return result[0];
        }

        int[] arr=new int[result.length-1];

        for (int j = 0; j < result.length - 1; j++) {
            arr[j]=result[j];
        }
        int diffrence = result[result.length-1]-result[result.length-2];
        arr[arr.length-1]=diffrence;
        Arrays.sort(arr);
        return findWeight(arr);
    }
}