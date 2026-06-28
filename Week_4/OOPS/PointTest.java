package Week_4.OOPS;

class PointTest {

    private int x;
    private int y;

    public PointTest() {
        x = 0;
        y = 0;
    }

    public PointTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point =(" + x + "," + y + ")");
    }
}

public class PointTest {

    public static void main(String[] args) {
        PointTest p1 = new PointTest();
        p1.display();

        PointTest p2 = new PointTest(10, 20);
        p2.display();

        p1.setX(5);
        p1.setY(8);
        p1.display();

        p2.setXY(15, 25);
        p2.display();
    }

}
