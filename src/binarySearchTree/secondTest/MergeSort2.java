package binarySearchTree.secondTest;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/5 09:34
 * @Description:
 */
public class MergeSort2 {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        mergSort(n,0,n.length-1);

        for (int i : n) {
            System.out.print(i + "  ");
        }
    }

    private static void mergSort(int[] n, int left, int right) {

        if (left >= right){
            return;
        }

        int mid = (right - left)/2 + left;
        mergSort(n, left, mid);
        mergSort(n, mid + 1, right);
        merge(n,left, mid, right);
    }

    private static void merge(int[] n, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k =0;
        while (i <= mid && j <=right){
            if (n[i] < n[j]){
                temp[k++] = n[i++];
            }else{
                temp[k++] = n[j++];
            }
        }

        while (i <= mid){
            temp[k++] = n[i++];
        }
        while (j <= right){
            temp[k++] = n[j++];
        }
        for(i=0;i<temp.length;i++) {
            n[i+left]=temp[i];
        }

    }

}
