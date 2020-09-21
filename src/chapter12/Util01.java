package chapter12;

public class Util01 {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
//		System.out.println(t1.getClass().getName());
		double v2 = t2.doubleValue();
//		System.out.println(t2.getClass().getName());
		return Double.compare(v1, v2);
		/*compare 두개를 비교해서 앞에것이 크면 +1 뒤에가 크면 -1 */
	}
}
