package Demo5;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-01-15
 * @Time: 2:31
 */
public class Demo {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p >= 0) {

            if (p1 < 0) {
                nums1[p] = nums2[p2];
                p--;
                p2--;
            } else {
                if (nums1[p1] <= nums2[p2]) {
                    nums1[p] = nums2[p2];
                    p2--;
                    p--;
                } else {
                    nums1[p] = nums1[p1];
                    p1--;
                    p--;
                }
            }
            if (p2 < 0) {
                break;
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        merge(a,0,b,1);
    }
}

