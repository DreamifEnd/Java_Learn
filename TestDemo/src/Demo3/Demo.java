package Demo3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-12
 * Time: 18:02
 */
class Alg<E extends Comparable<E>> {
    public E findMax(E[] arrays) {
        E max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if(max.compareTo(arrays[i]) < 0) {
                max = arrays[i];
            }
        }
        return max;
    }
}
public class Demo {
    public static void main(String[] args) {
        Alg<Integer> alg = new Alg<>();
        Integer[] array = new Integer[]{1,2,3};
        Integer i = alg.findMax(array);
        System.out.println(i);
    }
}
