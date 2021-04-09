import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point2D point1 = new Point3D();
        Point2D point2 = new Point3D(2.0f, 4.0f, 1.0f);

        System.out.println(point1);
        System.out.println(point2);

        System.out.println(Arrays.toString(((Point3D) point1).getXYZ(new float[]{2, 3, 4})));
    }
}
