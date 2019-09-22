package Test4;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/22 14:02
 * @Description:
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(n, 17));
    }

    private static int  binarySearch(int[] n, int target) {
        int left = 0;
        int right = n.length - 1;

        while (left <= right){
            int mid = (right - left)/2 + left;
            if (n[mid] == target){
                return target;
            }
            if (n[mid] > target){
                right = mid - 1;
            }
            if (n[mid] < target){
                left = mid + 1;
            }
        }
        return -1;

    }
}
