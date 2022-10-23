package lv1;

import java.util.*;

//A씨는 게시판 프로그램을 작성하고 있다.
//
//A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
//
//입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//출력 : 총페이지수



//m	   n	출력
//0	   1	0					게시글 0개존재 한페이지에 보여줄수있는 게시물 1개 총페이지수 0개
//1	   1	1
//2	   1	2  					게시글 2개존재 한페이지에 보여줄수있는 게시물 1개 총페이지수 2개
//1	   10	1
//10   10	1					게시글 10개존재 한페이지에 보여줄수있는 게시물 10개 총페이지수 1개
//11   10	2					게시글 11개존재 한페이지에 보여줄수있는 게시물 10개 총페이지수 2개

public class BoardPaging {
	
	
	
	public int checkNumber(String text) {
		
		if(text.equals("exit")) {
			return -1;
		}		
		else if(text.matches("[+-]?\\d*(\\.\\d+)?")) {
			
			return 1;
		}	
		return 0;
	}

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		BoardPaging boardPaging = new BoardPaging();
		
		boolean checkExit = false;
		int result = 0;	
		
		while(!checkExit) {
			
			String text1 = "";
			
			while(!checkExit) {
				System.out.print("게시글갯수: (종료:exit)");
				text1 = scan.next();
				System.out.println();
				
				if(boardPaging.checkNumber(text1) == 1) {
					break;
				}
				else if(boardPaging.checkNumber(text1) == -1) {
					
					checkExit = true;
					break;
				}
				else if (boardPaging.checkNumber(text1) == 0) {
					System.out.println("exit 또는 숫자만 입력하세요.");
					continue;
				}
			}
			
			
			String text2 = "";
			while(!checkExit) {
				System.out.print("한페이지에 몇개의 게시글을 출력? :  (종료:exit)");
				text2 = scan.next();		
				System.out.println();
				
				if(boardPaging.checkNumber(text2) == 1) {
					break;
				}
				else if(boardPaging.checkNumber(text2) == -1) {
					checkExit = true;
					break;
				}
				else if(boardPaging.checkNumber(text2) == 0) {
					
					System.out.println("exit 또는 숫자만 입력하세요.");
					continue;
				}
				
			}
			
			if(checkExit == false) {
				int m = Integer.parseInt(text1);
				int n = Integer.parseInt(text2);
				
				if( m > n) {				//10개 1칸 10페이지 10개 2칸 5페이지 10개 3칸 4페이지 10개 4칸 3페이지
					
					if(m%n == 0) {
						result = m/n;
					}
					else {
						result = m/n+1;
					}
					
			
					
				}
				else {  //30개 30칸 1페이지 30개 31칸 1페이지 10개 11칸 1페이지
					result = 1;
				}
				
				System.out.println("게시글 : "+m +", 한페이지에 게시물출력 갯수 : "+n+", 페이지수 = "+result);
			}
			System.out.println("\n");      //한사이클 끝나고 줄바꿈
						
		}
		System.out.println("종료합니다.");
	
		
	}	

	
}
