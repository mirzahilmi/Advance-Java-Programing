package tid.geometry.generalshapes;

// Miza Hilmi Shodiq
// 225150707111067

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {}

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getCircumference() {
        return (2 * this.length) + (2 * this.width);
    }
}
