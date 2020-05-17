package shellsort;

import java.util.Scanner;

public class ShellSort {
	
	private static void shellSort(int[] x, int nx) {
		
		for(int h=nx/2;h>0;h=h/2) {
			if(h%2==0)
				h++;
			for(int i=0;i<h;i++) {
				insertionSort(x,nx,i,h);
			}
		}
		
		
	}

	private static void insertionSort(int[] x, int nx, int i, int h) {

		  for(int j=h+i;j<nx;j=j+h) { 
			  int temp=x[j];
			  int k;
			  for(k=j-h;k>=0&&x[k]>temp;k=k-h) { 
				  x[k+h]=x[k]; 
				  } 
			  x[k+h]=temp; 
			  }
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("셸 정렬");
		System.out.print("요솟수：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		shellSort(x, nx);			// 배열 x를 셸 정렬

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);

	}

	

}
