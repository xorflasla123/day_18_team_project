package day_18_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Product implements Manage {
	Scanner input = new Scanner(System.in);
	ArrayList<pro> arr = new ArrayList<pro>();
	HashMap<Integer,pro> map = new HashMap<Integer,pro>();
	Integer itemCount = null ; Integer itemNo = null; String name = null;;

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("��ǰ ��ȣ : ");
		itemNo = input.nextInt();
		System.out.println("�̸� : ");
		name = input.next();
		System.out.println("���� : ");
		itemCount = input.nextInt();
		pro p = new pro();
		p.setItemNo(itemNo); p.setName(name); p.setItemCount(itemCount);
		arr.add(p);
		map.put(itemNo, p);
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("�˻��� ��ǰ ��ȣ : ");
		itemNo = input.nextInt();
		pro search = map.get(itemNo);
		if(search != null) {
			System.out.println("��ǰ �̸� : "+search.getName());
			System.out.println("��ǰ ���� : "+search.getItemCount());
		
		}
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

}