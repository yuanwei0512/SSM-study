package binarySearchTree.secondTest;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/5 09:21
 * @Description:
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        for (int i = 0; i < n.length; i ++){
            int index = i;
            for (int j = i + 1; j < n.length; j++){
                if (n[j] < n[index]){
                    index = j;
                }
            }
            int temp = n[index];
            n[index] = n[i];
            n[i] = temp;
        }

        for (int i : n) {
            System.out.print(i + "  ");
        }

    }
}
