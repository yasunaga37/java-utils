package fisher_yates_shuffle;

import java.util.Random;

/**
 * Fisher–Yates シャッフル（別名：Knuth シャッフル）を用いた、
 * シンプルな配列のシャッフル実装例
 */
public class FisherYatesShuffle2 {

	public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        System.out.print("i= " + " j= " + ": ");
        repeat(data);
        shuffle(data);
//        repeat(data);
	}
	
    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // 0 から i の間のランダムな数
            // 要素の交換
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            System.out.print("i=" + i + " j=" + j + ": ");
            repeat(array);
        }
    }
    
    private static void repeat(int[] data) {
      for (int num : data) {
	      System.out.print(num + " ");
	  }
      System.out.println();
    }

}
