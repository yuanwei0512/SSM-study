/**
 * @Auther: Huangyuanwei
 * @Date: 2019/8/28 22:25
 * @Description:
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] n = {1,5,7,9,6,4,8,0,3,2};

       /* for (int i = 1; i <n.length; i++){
            for (int j = i; j > 0; j--){
                if (n[j] < n[j-1]){
                    int temp = n[j-1];
                    n[j-1] = n[j];
                    n[j] = temp;

                }else{
                    break;
                }
            }
        }
        for (int i : n) {
            System.out.print(i + "  ");
        }*/



        for (int i = 1; i < n.length; i++){
            int element = n[i];
            int j;
            for (j = i; j > 0; j--){
                if (n[j - 1] > element){
                    n[j] = n[j -1 ];
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
