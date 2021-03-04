package day_18_team_project;

import java.util.HashMap;
import java.util.Scanner;

public class Member implements Manage {
	
	Scanner input = new Scanner(System.in);
	
	HashMap<String, Mem> map = new HashMap<String,Mem>();
	
	String name = null, addr = null, sex = null, birth = null;
	@Override
	public void register() {
		
		
		System.out.print("등록 이름 : ");
		name = input.next();
		System.out.print("등록 주소 : ");
		addr = input.next();
		System.out.print("등록 성별 : ");
		sex = input.next();
		System.out.print("등록 생년월일 : ");
		birth = input.next();
		Mem m = new Mem();
		m.setName(name);
		m.setAddr(addr);
		m.setSex(sex);
		m.setBirth(birth);
		map.put(name, m);		
	}

	@Override
	public void search() {
		System.out.println("검색 이름 : ");
		name = input.next();
		Mem search = map.get(name);
		
		if(search != null) {
			System.out.println("이름 : "+search.getName());
			System.out.println("주소 : "+search.getAddr());
			System.out.println("성별 : "+search.getSex());
			System.out.println("생년월일 : "+search.getBirth());
		}
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

}
