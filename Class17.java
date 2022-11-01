package java10;
class car{
	protected String owner;
	protected String id;
	car(String own,String s){
		owner = own;
		id = s;
	}
	final void show() {
		System.out.println("車主姓名"+owner);
		System.out.println("車牌號碼"+id);
	}
}
class CColor extends car{
	String color;
	CColor(String own, String s,String c) {
		super(own, s);
		color = c;
	}
	/*void show() {
		System.out.println("車主姓名"+owner);
		System.out.println("車牌號碼"+id);
		System.out.println("車身顏色"+color);
	}*/
	//因為fianl終止了繼承，故不能夠改寫
	//可以新增其他名字的函數
	void showC() {
		System.out.println("車主姓名"+owner);
		System.out.println("車牌號碼"+id);
		System.out.println("車身顏色"+color);
	}
}
public class Class17 {

	public static void main(String[] args) {
		CColor mycar = new CColor("Riann","A1-2345","Black");
		mycar.showC();
	}

}
