package day_18_team_project;

import java.util.Scanner;
/*
1. 회원관리	- 동민님(Member 클래스)
-등록 [회원번호 (이름 전화번호)] Hashmap<Integer, Member(class)>
-검색
-돌아가기

2. 물품관리	- 도현님(Product 클래스)
-등록 [물품번호 (이름 수량)] Hashmap<Integer, Product(class)>
-검색
-돌아가기

3. 이벤트관리	- 택림님(Event 클래스)
-등록 [날자(월/일) 이름] Hashmap<String, String>
-검색
-돌아가기

4. 종료
*/
interface Manage {
	public void register();	// 등록
	public void search();	// 검색
	public void back();		// 돌아가기
}

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, su;
		Member m = new Member();
		Product p = new Product();
		Event eve = new Event();
		
		while(true) {
			System.out.println("1. 회원관리 2. 물품관리 3. 이벤트관리 4. 종료");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
				case 1:		// 회원관리
					System.out.println("회원 관리입니다.");
					System.out.println("1. 회원등록 2. 회원검색 3. 돌아가기");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
						case 1:		// 등록
							m.register();
							break;
						case 2:		// 검색
							m.search();
							break;
						case 3:		// 돌아가기
							
							break;
					}
					break;
				case 2:		// 물품관리
					System.out.println("물품 관리입니다.");
					System.out.println("1. 물품등록 2. 물품검색 3. 돌아가기");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
					case 1:		// 등록
						p.register();
						break;
					case 2:		// 검색
						p.search();
						break;
					case 3:		// 돌아가기
						
						break;
					}
					break;
				case 3:		// 이벤트관리
					eve.display();
					break;
				case 4:
					System.exit(0);
			}
			System.out.println();
		}
	}
}
