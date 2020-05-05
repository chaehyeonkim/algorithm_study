package binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("배열 요소 개수: ");
		int num = s.nextInt();
		int x[] = new int[num];

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]>>");
			x[i] = s.nextInt();
		}
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		System.out.print("검색할 값>>");// key값 입력
		int key = s.nextInt();

		int index = binSearch(x, num, key);// key값 검색

		if (index == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + index + "]에 있습니다.");

	}

	private static int binSearch(int[] x, int num, int key) {
		// x배열에서 key 검색
		int pl = 0;// 검색 범위의 첫인덱스
		int pr = num - 1;// 검색 범위의 끝 인덱스
		int pc = (pl + pr) / 2;// 중앙 요소 인텍스

		while (true) {
			if (key < x[pc]) {
				pr = pc - 1;
				pc = (pl + pr) / 2;
			} else if (key == x[pc]) {
				key = pc;
				break;
			} else {
				pl = pc + 1;
				pc = (pl + pr) / 2;
			}
		}
		return key;
	}

}
