package Stream;

import Lambda.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/14 14:20
 * @Description:
 */
public class TestStream {

    @Test
    public void test7(){
        Integer[] nums = new Integer[]{1,2,3,4,5};
        List<Integer> collect = Arrays.stream(nums)
                .map((x) -> x * 2)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    @Test
    public void test6(){
        Optional<Integer> reduce = emps.stream()
                .map(Employee::getAge)
                .reduce(Integer::sum);
        System.out.println(reduce.get());
    }



    @Test
    public void test5(){
        long count = emps.stream()
                .count();
        System.out.println(count);

        Optional<Employee> max = emps.stream()
                .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println(max.get());
        Optional<Integer> min = emps.stream()
                .map(Employee::getAge)
                .min(Integer::compare);
        System.out.println(min);
    }

    @Test
    public void test4(){
        Optional<Employee> any = emps.parallelStream()
                .filter((e) -> e.getAge() > 20)
                .findAny();
        System.out.println(any.get());
    }

    @Test
    public void test3(){
        emps.stream()
                .sorted((o1,o2) ->{
                    return o1.getAge().compareTo(o2.getAge());
                })
                .forEach(System.out::println);
    }

    @Test
    public void test2(){
      emps.stream().limit(2).forEach(System.out::println);
    }


    @Test
    public void test1(){
        List<Employee> collect = emps.stream().filter((e) -> e.getAge() > 30).collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee.getName());
        }
    }


    List<Employee> emps = Arrays.asList(
            new Employee(1, "zzz",23),
            new Employee(1, "xxx",45),
            new Employee(2, "ccc",34),
            new Employee(1, "vvv",86)
    );


}
