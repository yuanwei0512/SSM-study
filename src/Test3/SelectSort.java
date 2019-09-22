package Test3;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/17 13:59
 * @Description:
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};
        int index = 0;
        for (int i = 0; i < n.length; i ++){
            index = i;
            for (int j = i + 1; j < n.length; j++){
                if (n[j] < n[index]){
                    index = j;
                }
            }
            int temp = n[i];
            n[i] = n[index];
            n[index] = temp;
        }

        for (int i : n) {
            System.out.print(i + "  ");
        }
    }

}
