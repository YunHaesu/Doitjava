package example;

public class ArrayEx01 {

	public static void main(String[] args) {
		char num[] = new char[26];
		num[0] = 'a';	//97
		num[0] = 'b';	//98
		num[0] = 'c';	//99
		
		for(int i = 0;i <num.length;i++) {
			num[i] = (char) ('a' +i);  
			
		}
		System.out.print(num);
	}

}
