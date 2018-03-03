import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import algorithm.Algorithm;

public class MyTimeTestAlgorithm {

	public static void main(String[] args) {
		int size = 100000000;
//		int size = 100000;
		int A[] = new int[size];
		
		int B[] = {3, 13, 56, 49, 55, 87, 5, 6, 15, 25, 44, 0, 7, 1, 55};
		
		Random rnd = new Random(System.currentTimeMillis());
		
		int min = 0;
		for(int i = 0; i < A.length; i++)
			A[i] =  min + rnd.nextInt( size - min - 1);
		
		System.out.println("1. Быстрая сортировка");
		System.out.println("2. Пузырьковая");
		System.out.println("3. Библиотечная");
		
		Scanner scan = new Scanner(System.in);
		int chosenValue = scan.nextInt();
		long startTime = System.nanoTime();    

		switch(chosenValue)
		{
		case 1:
			Algorithm.qsort(0, A.length - 1, A);
			break;
		case 2:
			Algorithm.sort(A);
			break;
		case 3: 
			Arrays.sort(A);
			break;
		default:
			System.out.println("Неверное значение");
			return;
		}
		
		long estimatedTime = System.nanoTime() - startTime;
		
	//	Algorithm.qsort(0, B.length - 1, B);
		System.out.println("Время " + estimatedTime * 1E-9);
		int index = 0;
		for(int a : A)
		{
			System.out.printf(a + "  ");
			index++;
			if (index > 20 )
			{
				System.out.print(" .....");
				break;
			}
		}
		
		
		System.out.println();
		System.out.println("Выберенте число:");
		chosenValue = scan.nextInt();
		int position = Algorithm.BinarySearch(A, 0, A.length - 1, chosenValue);
		
		System.out.println("Индекс: " + position);
		scan.close();
	}

}
