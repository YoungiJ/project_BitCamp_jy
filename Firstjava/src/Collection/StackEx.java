package Collection;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
	
	Stack<Coin> coinBox=new Stack<>();
	//����Ÿ���� �ְ� ������
	coinBox.push(new Coin(100));
	coinBox.push(new Coin(200));
	coinBox.push(new Coin(300));
	coinBox.push(new Coin(400));
	
	while(!coinBox.isEmpty()) {
		Coin coin=coinBox.pop();
		System.out.println(coin.getValue()+"������ ����");
	}
	
	}
}
