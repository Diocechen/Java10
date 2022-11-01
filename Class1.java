package java10;
//包含1,2,3,13,14題
class Caaa{
	public int num1;
	public int num2;
	Caaa(){
		num1 = 1;
		num2 = 1;
	}
	Caaa(int a,int b){
		num1 = a;
		num2 = b;
	}
}

class Cbbb extends Caaa{
	Cbbb(){
		super();
	}
	Cbbb(int a,int b){
		super(a,b);
	}
	void setNum(int a,int b){
		num1 = a;
		num2 = b;
	}
	void show() {
		System.out.println(num1+" "+num2);
	}
}
public class Class1 {

	public static void main(String[] args) {
		Caaa aa = new Caaa();
		System.out.println(aa.num1+" "+aa.num2);
		
		Cbbb bb1 = new Cbbb(65,56);
		bb1.show();
		
		Cbbb bb2 = new Cbbb(55,66);
		bb2.show();
		
		Cbbb bb3 = new Cbbb();
		bb3.show();
	}
}

//若將 num1 及 num2 改成 private 時不能從 setNum() show()存取。
//因為無法從類別以外的地方存取及修改
