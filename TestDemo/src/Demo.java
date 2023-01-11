import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuyan
 * Date: 2023-01-11
 * Time: 12:33
 */
public class Demo {
    public static void rotate(int[] nums, int k) {
        int left = 0;

        int temp = 0;
        int max = 0;
        for(int i:nums){
            max++;
        }
        if(k >= max) {
            k %= max;
        }
        int right = max-k-1;
        while(left <= right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = max-k;
        right = max-1;
        while(left <= right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        left = 0;
        right = max-1;
        while(left <= right) {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] array = new int[]{-1,-100,3,99};
        rotate(array,2);
    }
}
