package text;

public class Rectangle {
	private int width;
	private int height;
	public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return  width*height;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(10, 30);
		System.out.print(r.getArea());
	}

}
