package Test3;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/17 13:56
 * @Description:
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        int temp = 0;

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n.length - i-1; j++){
                if (n[j] > n[j+1]){
                    temp= n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                }
            }
        }

        for (int i : n) {
            System.out.print(i + "  ");
        }

    }
}
