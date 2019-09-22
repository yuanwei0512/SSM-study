package binarySearchTree;

import java.util.*;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/1 21:42
 * @Description:
 */
public class Test {

    public static void main(String[] args) {


        System.out.println(6 ^ 3);
    }
    int test(){
        try{
            return func1();
        }
        finally{
            return func2();
        }
    }
    int func1(){
        System.out.println("func1");
        return 1;
    }
    int func2(){
        System.out.println("func2");
        return 2;
    }

   
}
