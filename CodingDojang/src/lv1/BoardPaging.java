package lv1;

import java.util.*;

//A���� �Խ��� ���α׷��� �ۼ��ϰ� �ִ�.
//
//A���� �Խù��� �� �Ǽ��� �� �������� ������ �Խù����� �Է����� �־��� �� �� ���������� �����ϴ� ���α׷��� �ʿ��ϴٰ� �Ѵ�.
//
//�Է� : �ѰǼ�(m), ���������� ������ �Խù���(n) (�� n�� 1���� ũ�ų� ����. n >= 1)
//��� : ����������



//m	   n	���
//0	   1	0					�Խñ� 0������ ���������� �����ټ��ִ� �Խù� 1�� ���������� 0��
//1	   1	1
//2	   1	2  					�Խñ� 2������ ���������� �����ټ��ִ� �Խù� 1�� ���������� 2��
//1	   10	1
//10   10	1					�Խñ� 10������ ���������� �����ټ��ִ� �Խù� 10�� ���������� 1��
//11   10	2					�Խñ� 11������ ���������� �����ټ��ִ� �Խù� 10�� ���������� 2��

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
				System.out.print("�Խñ۰���: (����:exit)");
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
					System.out.println("exit �Ǵ� ���ڸ� �Է��ϼ���.");
					continue;
				}
			}
			
			
			String text2 = "";
			while(!checkExit) {
				System.out.print("���������� ��� �Խñ��� ���? :  (����:exit)");
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
					
					System.out.println("exit �Ǵ� ���ڸ� �Է��ϼ���.");
					continue;
				}
				
			}
			
			if(checkExit == false) {
				int m = Integer.parseInt(text1);
				int n = Integer.parseInt(text2);
				
				if( m > n) {				//10�� 1ĭ 10������ 10�� 2ĭ 5������ 10�� 3ĭ 4������ 10�� 4ĭ 3������
					
					if(m%n == 0) {
						result = m/n;
					}
					else {
						result = m/n+1;
					}
					
			
					
				}
				else {  //30�� 30ĭ 1������ 30�� 31ĭ 1������ 10�� 11ĭ 1������
					result = 1;
				}
				
				System.out.println("�Խñ� : "+m +", ���������� �Խù���� ���� : "+n+", �������� = "+result);
			}
			System.out.println("\n");      //�ѻ���Ŭ ������ �ٹٲ�
						
		}
		System.out.println("�����մϴ�.");
	
		
	}	

	
}
