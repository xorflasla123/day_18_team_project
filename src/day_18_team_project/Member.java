package day_18_team_project;

import java.util.HashMap;
import java.util.Scanner;

public class Member implements Manage {
	
	Scanner input = new Scanner(System.in);
	
	HashMap<String, Mem> map = new HashMap<String,Mem>();
	
	String name = null, addr = null, sex = null, birth = null;
	@Override
	public void register() {
		
		
		System.out.print("��� �̸� : ");
		name = input.next();
		System.out.print("��� �ּ� : ");
		addr = input.next();
		System.out.print("��� ���� : ");
		sex = input.next();
		System.out.print("��� ������� : ");
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
		System.out.println("�˻� �̸� : ");
		name = input.next();
		Mem search = map.get(name);
		
		if(search != null) {
			System.out.println("�̸� : "+search.getName());
			System.out.println("�ּ� : "+search.getAddr());
			System.out.println("���� : "+search.getSex());
			System.out.println("������� : "+search.getBirth());
		}
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

}
