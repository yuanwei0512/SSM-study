import java.util.Random;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/8/29 22:11
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
        int p = partition(n, left, right);
        quickSort(n,0,p-1);
        quickSort(n,p+1,right);
    }

    private static int partition(int[] n, int left, int right) {

        Random random = new Random();
        int randInt = random.nextInt(right - left + 1) + left;

        int temp = n[randInt];
        n[randInt] = n[left];
        n[left] = temp;

        int v = n[left];
        int j = left;
        for (int i = left+1; i <= right; i++){
            if (n[i] < v){
                temp = n[i];
                n[i] = n[j +1];
                n[j + 1] = temp;
                j++;
            }
        }

        temp = n[j];
        n[j] = n[left];
        n[left] = temp;
        return j;
    }
}
