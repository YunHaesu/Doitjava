package chapter04;

public class DiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = (int)(Math.random()*6)+ 1;
		
		System.out.println(dice);
		
		if(dice <= 3) {
			if(dice == 1) {
				System.out.println("주사위의 눈금은 1 입니다.");
			} else if (dice == 2) {
				System.out.println("주사위의 눈금은 2 입니다.");
			} else {
				System.out.println("주사위의 눈금은 3 입니다.");
			}
		} else {
			if (dice == 4) {
				System.out.println("주사위의 눈금은 4 입니다.");
			} else if (dice == 5) {
				System.out.println("주사위의 눈금은 5 입니다.");
			} else {
				System.out.println("주사위의 눈금은 6 입니다.");
			}
		}

	}

}
/*
 * Math.random()의 범위는 0보다 크거나 같고 1 보다 작은 수
 *  0 <= Math.random() < 1
 *  0 * 6 <= Math.random() * 6< 1 * 6
 * */

