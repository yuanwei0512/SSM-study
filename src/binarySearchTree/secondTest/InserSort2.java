package binarySearchTree.secondTest;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/5 09:27
 * @Description:
 */
public class InserSort2 {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};

        for (int i = 1; i < n.length; i++){
            int element = n[i];
            int j;
            for (j = i; j > 0; j --){
                if (element < n[j - 1]){
                    n[j] = n[j - 1];
                }else{
                    break;
                }
            }

            n[j] = element;
        }

        for (int i : n) {
            System.out.print(i + "  ");
        }

    }



}
