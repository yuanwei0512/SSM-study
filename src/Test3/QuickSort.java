package Test3;

import java.util.Random;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/17 14:25
 * @Description:
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        quickSort(n, 0, n.length-1);
        for (int i : n) {
            System.out.print(i + "  ");
        }
    }

    private static void quickSort(int[] n, int left, int right) {

        if (left >= right){
            return;
        }
        int p = partition2(n, left, right);
        quickSort(n, left, p - 1);
        quickSort(n, p + 1, right);

    }

    private static int partition2(int[] n, int left, int right) {
        Random random = new Random();
        int rIndex = random.nextInt(right - left + 1) + left;
        int temp = n[rIndex];
        n[rIndex] = n[left];
        n[left] = temp;
        int v = n[left];

        int i = left + 1;
        int j = right;
        while (true){
            while ( i <= right && n[i] <v){
                i ++;
            }
            while ( j >= left + 1 && n[j] > v){
                j --;
            }
            if (i > j ){
                break;
            }
            temp = n[j];
            n[j] = n[i];
            n[i] = temp;
            i++;
            j--;
        }


        temp = n[left];
        n[left] = n[j];
        n[j] = temp;
        return j;

    }


    private static int partition(int[] n, int left, int right) {

        Random random = new Random();
        int rIndex = random.nextInt(right - left + 1) + left;
        int temp = n[rIndex];
        n[rIndex] = n[left];
        n[left] = temp;
        int v = n[left];
        int j = left;
        for (int i = left + 1; i < n.length; i++){
           if (n[i] < v){
               temp = n[i];
               n[i] = n[j+1];
               n[j + 1] = temp;
               j++;
           }
        }

        temp = n[left];
        n[left] = n[j];
        n[j] = temp;
        return j;

    }
}
