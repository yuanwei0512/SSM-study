package Test4;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/22 13:24
 * @Description:
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        mergSort(n,0,n.length-1);
    }

    private static void mergSort(int[] n, int left, int right) {
        if (left >= right){
            return;
        }
        int mid = (left + right) / 2;

        mergSort(n , left, mid);
        mergSort(n, mid + 1, right);
        merge(n,left, mid, right);

    }

    private static void merge(int[] n, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right){
            if (n[i] < n[j]){
                n[k++] = n[i++];
            }else{
                n[k++] = n[j++];
            }
        }

        if (i <= mid){
            n[k++] = n[i++];
        }
        if (j <= right){
            n[k++] = n[j++];
        }

        for (i = 0; i < temp.length; i++){
            n[i + left] = temp[i];
        }

    }

}
