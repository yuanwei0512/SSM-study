package binarySearchTree.secondTest;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/5 09:18
 * @Description:
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n.length - i - 1; j ++){
                if (n[j] > n[j + 1]){
                    int temp = n[j+1];
                    n[j+1] = n[j];
                    n[j] = temp;
                }
            }
        }
        for (int i : n) {
            System.out.print(i + "  ");
        }

    }
}
