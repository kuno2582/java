package com.pattern.templateMethod1;

import com.pattern.templateMethod.AbstGameConnectHelper;
import com.pattern.templateMethod.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
	}
}
