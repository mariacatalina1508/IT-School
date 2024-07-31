import java.util.Objects;

public class Rectangle {


    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Rectangle rectangle = (Rectangle) obj;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(30, 40);
        Rectangle rect2 = new Rectangle(30, 40);
        Rectangle rect3 = new Rectangle(15, 25);

        System.out.println("rect1 equals rect2: " + rect1.equals(rect2)); // Should return true
        System.out.println("rect1 equals rect3: " + rect1.equals(rect3)); // Should return false

        System.out.println("rect1 hashCode: " + rect1.hashCode());
        System.out.println("rect2 hashCode: " + rect2.hashCode());
        System.out.println("rect3 hashCode: " + rect3.hashCode());

        System.out.println("rect1 and rect2 have the same hashCode: " + (rect1.hashCode() == rect2.hashCode()));
    }
}