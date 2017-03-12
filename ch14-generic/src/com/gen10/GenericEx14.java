package com.gen10;
/*
���׸� ���� ������ ?

<? extends Info>
Info�� ����ϴ� ��� Ŭ����

*/
class Fruit {
	public void showYou(){
		System.out.println("���� �����Դϴ�.");
	}
}

class Apple extends Fruit {
	
	@Override
	public void showYou(){
		System.out.println("���� ���� ����Դϴ�.");
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
		
		//FruitŬ������ ����ϴ� Ŭ������ �ν��Ͻ���� �����̵��� ���� ������ �������� box����
		FruitBox<Fruit> box1 = new FruitBox<Fruit>();
		box1.store(new Fruit());
		
		FruitBox<Apple> box2 = new FruitBox<Apple>();
		box2.store(new Apple());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);

	}

}
