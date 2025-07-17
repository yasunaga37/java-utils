package random_array1;

import java.util.Random;

/**
 * ランダムで重複のない配列を生成する
 * 生成される要素は start ～ end の範囲内とし、要素数は element 個とする
 */
public class ArrayWithUniqueValues {

	public static void main(String[] args) {
		int[] array = createRandomArray(1, 15, 5);
		//		int[] array = createRandomArray(16, 30, 5);
		//		int[] array = createRandomArray(31, 45, 5);
		//		int[] array = createRandomArray(46, 60, 5);
		//		int[] array = createRandomArray(61, 75, 5);
	}

	/**
	 * ランダムで重複のない配列を生成する
	 * @param start 最小値
	 * @param end 最大値
	 * @param element 要素数
	 * @return ランダムで重複のない配列
	 */
	static int[] createRandomArray(int start, int end, int element) {
		int[] array = new int[element];
		Random ran = new Random();

		boolean isUnique = true;
		int index = 0;
		while(index < array.length) {
			int randomNumber = start + ran.nextInt(end - start + 1);
			isUnique = duplicateCheck(isUnique, array, index, randomNumber);
			if (isUnique) {
				array[index] = randomNumber;
				System.out.println("randomNumber= " + randomNumber + " array[" + index + "]=" + array[index]);
				index++;
			}
			System.out.println("-----------------------------------");
		}
		showArray(array);
		return array;
	}

	/**
	 * 配列の要素内に重複した値があるか否かを判定する
	 * @param isUnique 重複した値の判定フラグ
	 * @param array 判定対象となる配列
	 * @param index 検査対象となる要素番号
	 * @param randomNumber 検査対象となる乱数
	 * @return 判定結果
	 */
	static boolean duplicateCheck(boolean isUnique, int[] array, int index, int randomNumber) {
		for (int i = 0; i < index; i++) {
			System.out.println("randomNumber= " + randomNumber + " array[" + index + "]=" + array[index]);
			if (randomNumber == array[i]) {
				isUnique = false;
				break;
			} else {
				isUnique = true;
			}
		}
		return isUnique;
	}

	/**
	 * 配列の要素を表示する
	 * @param array int型配列
	 */
	static void showArray(int[] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
