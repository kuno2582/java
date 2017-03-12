package com.inner4;

class InnerParent2 {
	public void display(){
		System.out.println("�θ�Ŭ������ display");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		
		//������
		//���Ǻθ� ���� �������� �ʰ� �����θ� �����ϱ� ������ �����ξ��� ���Ǻ��� ������
		//�����ϰ� �־�� �Ѵ�. �͸�Ŭ�����̱� ������
		//�̸��� ���� ���� Ŭ���� ������ ���� �θ��̸��� ���ų� �������̽����� ����մϴ�.
		//�ݵ�� ��ü������ �ٷ� ���־�� �Ѵ�. -������ Ư¡
		//class Inner �ؼ� Ŭ���� �̸��� �����ߴ� ���� �̸����� ����մϴ�.
		//��ӹ��� Ŭ�� InnerParent2�� ���� ��ü ������ �ݴϴ�.
		
		InnerParent2 i = new InnerParent2(){
			@Override
			public void display(){
				System.out.println("�ڽ�Ŭ������ display");
			}
		};
		i.display();
		
	}

	public static void main(String[] args) {
		
		AnonymousEx02 ame = new AnonymousEx02();
		ame.innerTest();

	}

}
