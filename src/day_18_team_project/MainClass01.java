package day018_quiz;

/*2. 물품관리
-등록 [물품번호 (이름 수량)] Hashmap<Integer, Product(class)>
-검색
-돌아가기
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Product> arr = new ArrayList<Product>();
		HashMap<Integer,Product> map = new HashMap<Integer,Product>();
		Integer itemCount = null ; Integer itemNo = null; String name = null;;
		while(true) {
			System.out.println("1.등록 2.검색 3.돌아가기");
			int num = input.nextInt();
			switch(num) {
			case 1: 
				System.out.println("물품 번호 : ");
				itemNo = input.nextInt();
				System.out.println("이름 : ");
				name = input.next();
				System.out.println("수량 : ");
				itemCount = input.nextInt();
				Product p = new Product();
				p.setItemNo(itemNo); p.setName(name); p.setItemCount(itemCount);
				arr.add(p);
				map.put(itemNo, p);
				break;
			case 2: 
				System.out.println("검색할 물품 번호 : ");
				itemNo = input.nextInt();
				Product search = map.get(itemNo);
				if(search != null) {
					System.out.println("물품 이름 : "+search.getName());
					System.out.println("물품 수량 : "+search.getItemCount());
				}
				break;
			case 3: 
				continue;
			}
		}

	}

}
