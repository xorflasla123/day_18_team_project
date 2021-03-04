package day_18_team_project;

import java.util.Scanner;
/*
1. ȸ������	- ���δ�(Member Ŭ����)
-��� [ȸ����ȣ (�̸� ��ȭ��ȣ)] Hashmap<Integer, Member(class)>
-�˻�
-���ư���

2. ��ǰ����	- ������(Product Ŭ����)
-��� [��ǰ��ȣ (�̸� ����)] Hashmap<Integer, Product(class)>
-�˻�
-���ư���

3. �̺�Ʈ����	- �ø���(Event Ŭ����)
-��� [����(��/��) �̸�] Hashmap<String, String>
-�˻�
-���ư���

4. ����
*/
interface Manage {
	public void register();	// ���
	public void search();	// �˻�
	public void back();		// ���ư���
}

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, su;
		
		Member m = new Member(); 
		
		while(true) {
			System.out.println("1. ȸ������ 2. ��ǰ���� 3. �̺�Ʈ���� 4. ����");
			System.out.print(">>> ");
			num = input.nextInt();
			switch(num) {
				case 1:		// ȸ������
					System.out.println("ȸ�� �����Դϴ�.");
					System.out.println("1. ȸ����� 2. ȸ���˻� 3. ���ư���");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
						case 1:		// ���
							m.register();
							break;
						case 2:		// �˻�
							m.search();
							break;
						case 3:		// ���ư���
							
							break;
					}
					break;
				case 2:		// ��ǰ����
					System.out.println("��ǰ �����Դϴ�.");
					System.out.println("1. ��ǰ��� 2. ��ǰ�˻� 3. ���ư���");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
					case 1:		// ���
						
						break;
					case 2:		// �˻�
						
						break;
					case 3:		// ���ư���
						
						break;
					}
					break;
				case 3:		// �̺�Ʈ����
					System.out.println("�̺�Ʈ �����Դϴ�.");
					System.out.println("1. �̺�Ʈ��� 2. �̺�Ʈ�˻� 3. ���ư���");
					System.out.print(">>> ");
					su = input.nextInt();
					switch(su) {
					case 1:		// ���
						
						break;
					case 2:		// �˻�
						
						break;
					case 3:		// ���ư���
						
						break;
					}
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}
