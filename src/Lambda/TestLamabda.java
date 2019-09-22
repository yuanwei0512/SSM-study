package Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/14 09:36
 * @Description:
 */
public class TestLamabda {

    @Test
    public void test1(){
        Consumer<String> con = (x) -> System.out.println(x);
    }

    @Test
    public void test2(){
        System.out.println(operation(100, (x) -> x*x));
    }
    public Integer operation(Integer num, MyFcun mf){
        return mf.getValue(num);
    }


    @Test
    public void test3(){
        List<Employee> emps = Arrays.asList(
                new Employee(1, "qwe"),
                new Employee(2, "zxc")
        );

        Collections.sort(emps, (e1,e2) -> {
            if (e1.getId() == e2.getId()){
                return e1.getName().compareTo(e2.getName());
            }
            return -1;
        });
    }

    @Test
    public void test4(){
        op(100L, 200L, (x,y) -> x+y);
    }

    public void op(Long l1, Long l2, MyFunction2<Long, Long> mf){
        System.out.println(mf.getValue(l1 , l2));
    }

    @Test
    public void test5(){
        happy(1000, (m) -> System.out.println(m));
    }

    public void happy(double money, Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void test6(){
        List<Integer> numList = getNumList(10, () -> {
            return (int) (Math.random() * 1000);
        });

        for (Integer integer : numList) {
            System.out.println(integer);
        }

    }

    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i ++){
            list.add(sup.get());
        }
        return list;
    }

    @Test
    public void test7(){
        String newStr = strHandler("\t\t\t\t 我黄源伟", (str) -> str.trim());
        System.out.println(newStr);

    }

    private String strHandler(String str, Function<String, String> fun){
        return fun.apply(str);
    }


    @Test
    public void test8(){
        List<String> list = Arrays.asList("hell", "asdf","qw", "ttwe", "fgfsa");
        List<String> newList = filterStr(list, (str) -> str.length() > 3);
        for (String s : newList) {
            System.out.println(s);
        }


    }

    private List<String> filterStr(List<String> list, Predicate<String> pre){
        List<String> strList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)){
                strList.add(str);
            }
        }
        return strList;
    }

    @Test
    public void test9(){

        new Thread(() ->{
            System.out.println("你好");
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
