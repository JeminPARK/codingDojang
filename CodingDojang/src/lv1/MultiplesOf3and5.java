package lv1;

import java.util.stream.IntStream;

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		
			//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
			//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		
		System.out.println("10 미만 자연수 3과 5의 배수 : ");
		
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
		System.out.println(" 3과 5의 배수 총합 : "+(three+ five));
		System.out.println();
		
		System.out.println("1000미만의 자연수 3과 5의 배수 : ");
		
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
		System.out.println("3과 5의 배수총합 : "+(three+five));
		
		//System.out.println(String.format("정답: %d", foo(1000)));


	}
//	 private static int foo(int end) {
//	        return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
//	    }
}
