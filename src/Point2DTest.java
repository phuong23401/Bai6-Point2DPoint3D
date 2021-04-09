import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(1.0f, 2.0f);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(Arrays.toString(point1.getXY(new float[]{2, 3})));
    }
}
