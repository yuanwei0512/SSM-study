package Test2;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/10 19:36
 * @Description:
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(n, 7));
    }

    private static int binarySearch(int[] n, int target) {
        int left = 0;
        int right = n.length - 1;

        while (left <= right){
            int mid = (right - left)/2 + left;
            if (n[mid] == target){
                return target;
            }
            if (target < n[mid]){
                right = mid - 1;
            }else{
                left = mid + 1;
            }


        }
        return -1;
    }
}
