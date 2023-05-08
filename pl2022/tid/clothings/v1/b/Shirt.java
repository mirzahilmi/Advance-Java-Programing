package pl2022.tid.clothings.v1.b;

public class Shirt extends Clothing {
    // Mirza Hilmi Shodiq
    // 225150707111067

    private int shoulderSize;

    public Shirt() {}

    public Shirt(String id, int size, int shoulderSize) {
        super.id = id;
        super.size = size;

        this.shoulderSize = shoulderSize;
    }

    public int getShoulderSize() {
        return shoulderSize;
    }

    public void setShoulderSize(int shoulderSize) {
        this.shoulderSize = shoulderSize;
    }

    @Override
    public String getDescription() {
        return String.format("%s\nLebar bahu: %d", super.getDescription(), this.shoulderSize);
    }
}
