package java10;

class Caa{
	private int num;
	
	public Caa(int n) {
		num = n;
	}
	public int get() {
		return num;
	}
	void display() {
		System.out.print("printed from Caa class");
	}
}

class Cbb extends Caa{
	public Cbb(int n) { //因為Caa有建構子
		super(n);
	}

	public void show() {
		System.out.println("num = "+get());
	}
	void display() {
		System.out.print("printed from Cbb class");
	}
}
public class Class9 {

	public static void main(String[] args) {
		Cbb bb = new Cbb(2);
		bb.show();
		bb.display();
	}//子類別的display被呼叫
}
