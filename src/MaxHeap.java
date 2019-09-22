import java.util.Arrays;
import java.util.Random;

/**
 * @Auther: Huangyuanwei
 * @Date: 2019/9/20 19:59
 * @Description:
 */
public class MaxHeap {

    private int[] data;
    private int count;
    private int catacity;

    public MaxHeap(int capacity) {
        this.catacity = catacity;
        data = new int[capacity];
        count = 0;
    }
    public int size(){
        return size();
    }

    public void insert(int num){
        if (count + 1 == catacity){
            this.data = Arrays.copyOf(this.data, this.catacity * 2);
        }
        data[count + 1] = num;
        count++;
        shiftUp(count);
    }

    public void soutHeap(){
        for (int i = 1; i < count; i++){
            System.out.print(this.data[i] + " ");
        }

    }
    public int extractMax(){
        if (this.count == 0 ){
            return -1;
        }
        int result = this.data[1];
        this.data[1] = this.data[count];
        shiftDown(1);
        return result;
    }

    private void shiftDown(int k) {

        while (k > 1 && data[k * 2] <this.count){
            int j = 2*k;
            if (j + 1 <= count && data[j+1] > data[j]){
                j++;
            }
            if (this.data[k] >= this.data[j]){
                break;
            }

            int temp = this.data[k] ;
            this.data[k]  = data[j];
            data[j] = temp;
            k = j;
        }
    }

    private void shiftUp(int k) {

        while (k > 1 && data[k] > data[k/2]){
            int temp = data[k];
            data[k] = data[k/2];
            data[k/2] = temp;
            k /= 2;
        }
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        Random random = new Random();

        for (int i = 0; i < 20; i ++){
            int randInt = random.nextInt(100);
            maxHeap.insert(randInt);
        }
        maxHeap.soutHeap();
    }


}
