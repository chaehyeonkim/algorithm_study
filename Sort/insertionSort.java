package insertionSort;

import java.util.Scanner;

public class insertionSort {

	private static void insertionSort(int[] x, int nx) {
		for(int i=1;i<nx;i++) {
			int j=i;
			int temp=x[j];
			while(j>0&&temp>x[j-1]) {
				x[j]=x[j-1];
				j--;
			}
			x[j]=temp;
		}

	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("단순 삽입 정렬");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		insertionSort(x, nx); // 배열 x를 단순 삽입 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);

	}

}
