package constructor;

public class Area {

	private int length;
	private int breadth;

	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void calculatorArea() {
		int area = length * breadth;
		System.out.println("Area is:" + area);

	}

	public static void main(String[] args) {
		Area area = new Area(5, 4);
		area.calculatorArea();
	}
}
