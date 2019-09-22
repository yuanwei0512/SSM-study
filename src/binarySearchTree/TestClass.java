package binarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/8/31 22:01
 * @Description:
 */
public class TestClass {

    public static void main(String[] args) {
        int[] a = {8, 6, 3, 10};
        int index = IntStream.range(0, a.length).reduce((i, j) -> a[i] > a[j] ? j : i).getAsInt();
        System.out.println("min index = " + index);
        int[][] test =new int[2][2];
        /*Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int minute = scanner.nextInt();
            int continueTime = scanner.nextInt();
            int[]score = new int[minute];
            int[]status = new int[minute];



            for (int i = 0; i <minute; i++){
                score[i] = scanner.nextInt();
            }

            int haveGet = 0;
            for (int i = 0; i <minute; i++){
                status[i] = scanner.nextInt();
                if (status[i] == 1){
                    haveGet += score[i];
                }
            }
            int maxScore =0;
            for (int i=0; i < minute; i++){
                if (status[i] == 0){
                    int temp = haveGet;
                    for (int j = i; j < i+continueTime;i++ ){
                        if (i == minute){
                            break;
                        }
                        if (status[j] == 0){
                            temp= temp + score[j];
                        }
                    }
                    if (temp > maxScore){
                        maxScore = temp;
                    }
                }
            }
            System.out.println(maxScore);

        }*/
    }
}
