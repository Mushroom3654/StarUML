package coffee;
import java.util.*;
public class CoffeeStore {
	public static void main(String[] args) {
		int i = 0, beverage = 0, deco = 0;
		Scanner sc = new Scanner(System.in);
		Beverage[] beverages = {new Espresso(), new HouseBlend(), new Decaf(), new DarkRoast()};
		
		System.out.println("-----------------------------------------------");
		System.out.println("주문할 음료를 선택하시오");
		System.out.println("-----------------------------------------------");
		System.out.println("1.에스프레소 | 2.하우스블렌드 |  3.디카페  |  4.다크로스트 ");
		System.out.print(">>");
		beverage = sc.nextInt();
		System.out.println("-----------------------------------------------");
		System.out.println("무엇을 추가해 드릴까요");
		System.out.println("-----------------------------------------------");
		System.out.println("1.우유 2.두유 3.모카 4.휘핑크림");
		System.out.print(">>");
		deco = sc.nextInt();
		CondimentDecorator[] decos = {new Milk(beverages[beverage]), new Soy(beverages[beverage]), new Mocha(beverages[beverage]), new Whip(beverages[beverage])};
		sc.close();
		
		System.out.println("가격은 : " + decos[deco].cost() + "원 입니다");
		
		
	}
}
