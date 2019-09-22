package Stream;

import java.util.*;


/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/15 13:14
 * @Description:
 */
public class NKTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++){
            Integer first = list.get(i);
            list.remove(i);
            list.add(first);

            Collections.reverse(list);

        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
