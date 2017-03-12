import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListEx08 {

	public static void main(String[] args) {
		
		List<Integer> lotto = new ArrayList<Integer>();
		Random random = new Random();
		Integer it = null;
		
		while(lotto.size() < 6){
			
			it = (Integer)(random.nextInt(45)+1);
			
			//�ߺ�üũ
			if(!lotto.contains(it)){
				lotto.add(it);
			}
			
		}
		
		//�����ϱ�
		Collections.sort(lotto);
		
		for(int i : lotto){
			System.out.println(i);
		}

	}

}
