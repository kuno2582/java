import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {

		int third = 0;
		int second = 0;
		int first = 0;
		int num_try = 0;

		while (num_try<50000000) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			ArrayList<Integer> al2 = new ArrayList<Integer>();
			Random ran = new Random();

			while (al.size() < 6) {
				int num;
				num = ran.nextInt(45) + 1;

				if (!al.contains(num)) {
					al.add(num);
				}
			}

			while (al2.size() < 6) {
				int num;
				num = ran.nextInt(45) + 1;

				if (!al2.contains(num)) {
					al2.add(num);
				}
			}
			int count = 0;
			for (int i = 0; i < al.size(); i++) {
				if (al2.contains(al.get(i))) {
					count++;
				}
			}
			if (count == 4) {
				third++;
				
			} else if (count == 5) {
				second++;
				
			} else if (count == 6) {
				first++;
				
			}

			num_try++;

		}
		System.out.println("½Ãµµ È½¼ö: " + num_try);
		
		BigDecimal b3 = new BigDecimal(third*100);
		BigDecimal b2 = new BigDecimal(second*100);
		BigDecimal b1 = new BigDecimal(first*100);
		BigDecimal a1 = new BigDecimal(num_try);
		
		System.out.println("3µî È½¼ö: " + third + "\t3µî È®·ü: " + b3.divide(a1) + "%");
		System.out.println("2µî È½¼ö: " + second + "\t2µî È®·ü: " + b2.divide(a1) + "%");
		System.out.println("1µî È½¼ö: " + first + "\t1µî È®·ü: " + b1.divide(a1) + "%");
	}

}
