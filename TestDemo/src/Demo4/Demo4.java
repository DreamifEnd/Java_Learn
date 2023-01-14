package Demo4;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-14
 * @Time: 22:40
 */
public class Demo4 {
    //List<List<Integer>>
    public static void generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        ret.add(row);
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = ret.get(i-1);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);

            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j-1)+prevRow.get(j));
            }

            curRow.add(1);
            ret.add(curRow);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        generate(5);
    }
}
