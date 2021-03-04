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
		System.out.println("�̺�Ʈ �����Դϴ�.");
		roop = true;
		while (roop) {
			System.out.println("1. �̺�Ʈ��� 2. �̺�Ʈ�˻� 3. ���ư���");
			System.out.print(">>> ");
			num = input.nextInt();
			switch (num) {
			case 1: // ���
				this.register();
				System.out.println();
				break;
			case 2: // �˻�
				this.search();
				System.out.println();
				break;
			case 3: // ���ư���
				this.back();
				break;
			}
		}
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.print("����� �̺�Ʈ�� ��¥[ex) 3/25] : ");
		day = input.next();
		System.out.print("����� �̺�Ʈ�� �̸� : ");
		name = input.next();
		
		if(event.containsKey(day)) {
			System.out.println("�̹� �̺�Ʈ�� ��ϵ� ��¥�Դϴ�!");
		} else {
			System.out.println("��� ����!");
			event.put(day, name);
		}
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.print("�˻��� ��¥ : ");
		day = input.next();
		if(event.containsKey(day)) {
			System.out.println(day+"�Ͽ� ��ϵ� �̺�Ʈ : "+event.get(day));
		} else {
			System.out.println("�� ��¥�� ��ϵ� �̺�Ʈ�� �����ϴ�!");
		}
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		roop = false;
	}

}
