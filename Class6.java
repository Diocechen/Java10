package java10;

class CTriangle{
	protected int base;
	protected int height;
			
	CTriangle(int b,int h){
		base = b;
		height = h;
	}
	protected void show() {
		System.out.println("base = "+base+",height = "+height);
	}
}

class CData extends CTriangle{
	CData(int b,int h){
		super(b,h);
	}
	protected void area() {
		System.out.println("base = "+base+",height = "+height);
		System.out.println("area = "+((float)base*height/2));
	}
}

public class Class6 {
	public static void main(String[] args) {
		CData obj = new CData(3,8);
		obj.area();
	}
}
