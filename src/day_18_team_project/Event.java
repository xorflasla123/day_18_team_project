package day_18_team_project;

import java.util.HashMap;
import java.util.Scanner;

public class Event implements Manage {
	Scanner input = new Scanner(System.in);
	private int num;
	private HashMap<String, String> event = new HashMap<String, String>();
	private boolean roop;
	private String day, name;

	public void display() {
		System.out.println();
		System.out.println("이벤트 관리입니다.");
		roop = true;
		while (roop) {
			System.out.println("1. 이벤트등록 2. 이벤트검색 3. 돌아가기");
			System.out.print(">>> ");
			num = input.nextInt();
			switch (num) {
			case 1: // 등록
				this.register();
				System.out.println();
				break;
			case 2: // 검색
				this.search();
				System.out.println();
				break;
			case 3: // 돌아가기
				this.back();
				break;
			}
		}
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.print("등록할 이벤트의 날짜[ex) 3/25] : ");
		day = input.next();
		System.out.print("등록할 이벤트의 이름 : ");
		name = input.next();
		
		if(event.containsKey(day)) {
			System.out.println("이미 이벤트가 등록된 날짜입니다!");
		} else {
			System.out.println("등록 성공!");
			event.put(day, name);
		}
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.print("검색할 날짜 : ");
		day = input.next();
		if(event.containsKey(day)) {
			System.out.println(day+"일에 등록된 이벤트 : "+event.get(day));
		} else {
			System.out.println("그 날짜에 등록된 이벤트는 없습니다!");
		}
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		roop = false;
	}

}
