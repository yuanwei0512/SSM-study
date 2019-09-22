package Test4;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/22 13:12
 * @Description:
 */
public class insertSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};

        for (int i = 1; i < n.length; i++){
            int j;
            int elment = n[i];
            for (j = i; j > 0; j--){
                if (n[j - 1] > elment){
                    n[j] = n[j - 1];
                }else{
                    break;
                }
            }
            n[j] = elment;
        }
        for (int i : n) {
            System.out.print(i + "  ");
        }
    }
}
