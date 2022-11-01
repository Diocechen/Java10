package java10;
//包含19,20題
class CRectengle{
	protected int length;
	protected int width;
	CRectengle(int l,int w){
		length = l;
		width = w;
	}
	public String toString(){
		return "";
	}
	public String toString(int a,int b){
		if(a >= b) {
			super.toString();
		}else if(a < b){
			return "Argument Error";
		}
		return "";
	}
}
public class Class19 {

	public static void main(String[] args) {
		CRectengle rect = new CRectengle(2,6);
		System.out.println("length="+rect.length+" width="+rect.width+" area="+rect.length*rect.width);
		System.out.println(rect.toString());
		System.out.println(rect.toString(10,9));
		System.out.println(rect.toString(6,9));
	}

}
//使用oop的overloading技術