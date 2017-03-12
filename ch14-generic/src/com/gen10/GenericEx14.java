package com.gen10;
/*
제네릭 변수 선언의 ?

<? extends Info>
Info를 상속하는 모든 클래스

*/
class Fruit {
	public void showYou(){
		System.out.println("나는 과일입니다.");
	}
}

class Apple extends Fruit {
	
	@Override
	public void showYou(){
		System.out.println("나는 빨간 사과입니다.");
	}
}

class FruitBox<T>{
	T item;
	
	public void store(T item){
		this.item = item;
	}
	
	public T pullOut(){
		return item;
	}
}

public class GenericEx14 {

	public static void openAndShowFruitBox(FruitBox<? extends Fruit> box){
		Fruit fruit = box.pullOut();
		fruit.showYou();
	}
	
	public static void main(String[] args) {
		
		//Fruit클래스를 상속하는 클래스의 인스턴스라면 무엇이든지 참조 가능한 참조변수 box선언
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		box1.store(new Fruit());
		
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box2.store(new Apple());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);

	}

}
