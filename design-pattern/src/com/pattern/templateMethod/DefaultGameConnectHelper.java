package com.pattern.templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("��ȭ�� �˰������� �̿��� ���ڵ�");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("���̵�/��ȣ Ȯ�ΰ���");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		//�������� �����̸� ������ ���̸� �� �� �ְ�, ������ �Ѱ��ְ� üũ
		
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���� �ܰ�!");
		return info;
	}

}