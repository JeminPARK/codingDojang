package lv1;

import java.util.stream.IntStream;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		
			//10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
			//1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
		
		System.out.println("10 �̸� �ڿ��� 3�� 5�� ��� : ");
		
		int num = 1;
		int three = 0;
		int five = 0;
		while(true) {
			
			if( num % 3 == 0) {
				System.out.print(num+" ");
				three += num;
			}
			else if( num % 5 == 0) {
				System.out.print(num+" ");
				five += num;
			}
			num++;
			
			if( num == 10) {
				break;
			}
			
		}
		System.out.println(" 3�� 5�� ��� ���� : "+(three+ five));
		System.out.println();
		
		System.out.println("1000�̸��� �ڿ��� 3�� 5�� ��� : ");
		
		num = 1;
		three = 0;
		five = 0;
		while(true) {
			
			if( num %3 == 0) {
				System.out.print(num + " ");
				three += num;
			}
			else if(num%5 == 0 ) {
				System.out.print(num + " ");
				five += num;
			}
			
			num ++;
			
			if(num == 1000) {
				break;
			}
		}
		System.out.println();
		System.out.println("3�� 5�� ������� : "+(three+five));
		
		//System.out.println(String.format("����: %d", foo(1000)));


	}
//	 private static int foo(int end) {
//	        return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
//	    }
}
