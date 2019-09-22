package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/3 08:55
 * @Description:
 */
public class TestMian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size =scanner.nextInt();
        String intpuNext = "";
        String result ="";
        String[] lastResult = new String[size];
        for (int i = 0;i < size; i++){
            intpuNext =scanner.next();
            int index =intpuNext.indexOf("C");
            String row = intpuNext.substring(1,index);
            String col = intpuNext.substring(index+1,intpuNext.length());
            String cols = changeInput(Integer.parseInt(col));

            lastResult[i] = cols + row;
        }
        for (int i = 0; i < size; i++){
            System.out.println(lastResult[i]);
        }

    }

    private static String changeInput(int col) {


        String resutl ="";
        int pow=0;
        while(col > 0){
            int yu = col%26;
            if (yu == 0) yu =26;
            resutl = String.valueOf((char)(yu + 64)) + resutl;
            col = (col -yu)/26;
        }
        return resutl;
    }
}
