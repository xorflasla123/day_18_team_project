package day_18_team_project;

import java.util.Scanner;
import java.util.ArrayList;


interface Manage {
	public void register();	// ���
	public void search();	// �˻�
	public void back();		// ���ư���
}

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		pro p = new pro();
		int num, su;

		
		while(true) {
			System.out.println("1. 회원관리 2. 물품관리 3. 이벤트관리 4. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
				
				case 2:		// ��ǰ����
					System.out.println("물품관리입니다");
					System.out.println("1.등록 2.검색 3.돌아가기");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
					case 1:		
						
						break;
					case 2:		
					
						break;
					case 3:
						break;
					}
					break;
				
			}
		
		}
	}
}
