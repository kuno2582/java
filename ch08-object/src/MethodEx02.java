
public class MethodEx02 {

	int money;
	
	public void setMoney(int a){
		money = a;
	}
	
	public int getMoney(){
		return money;
	}
	
	public static void main(String[] args) {
		
		MethodEx02 mm = new MethodEx02();
		mm.setMoney(5566);
		System.out.println(mm.getMoney());

	}

}
