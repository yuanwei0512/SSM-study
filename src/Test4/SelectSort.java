package Test4;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/22 13:02
 * @Description:
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};

        for (int i = 0; i < n.length; i++){
            int min = i;

            for (int j = i + 1; j < n.length; j++){
                if (n[j] < n[min]){
                    min = j;
                }
            }
            int temp = n[min];
            n[min] = n[i];
            n[i] = temp;
        }

        for (int i : n) {
            System.out.print(i + "  ");
        }

    }
}
