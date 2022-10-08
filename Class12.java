package java10;
//包含11小題

class CShape{
	public double area() {
		return 0.0;
	}
	
}
class CCircle extends CShape{
	float area = 0;
	float radius;
	CCircle(float r){
		area = (float) (Math.PI * r * r);
	}
	@Override //檢查有沒有打錯
	public double area() {
		return area;
	}
}
class CSquare extends CShape{
	float area = 0;
	float length = 0;
	float height = 0;
	CSquare(float l,float h){
		area = l * h;
	}
	@Override
	public double area() {
		return area;
	}
}
class CTriangle2 extends CShape{ //因為同個package已經有CTriangle了
	float area = 0;
	float base = 0;
	float height = 0;
	CTriangle2(float b,float h){
		area = (b*h)/2;
	}
	@Override
	public double area() {
		return area;
	}
}
public class Class12 {

	public static void main(String[] args) {
		
		CShape shapes[] = new CShape[6];
		
		shapes[0] = new CCircle(5);
		shapes[1] = new CCircle(10);
		shapes[2] = new CSquare(5,6);
		shapes[3] = new CSquare(10,10);
		shapes[4] = new CTriangle2(7,10);
		shapes[5] = new CTriangle2(10,7);
		largest(shapes);
	}
	
	static void largest(CShape[] s) {
		float largestArea = 0;
		for(int i = 0;i < s.length;i++) {
			if(s[i].area() > largestArea) {
				largestArea = (float) s[i].area();
			}
		}
		System.out.println(largestArea);
	}
}
