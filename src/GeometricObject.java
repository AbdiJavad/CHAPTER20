
public abstract class GeometricObject {
    private java.lang.String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = java.lang.String.valueOf(color);
        this.filled = filled;
    }

    public GeometricObject(int i, int i1) {
    }

    public GeometricObject(int i) {
    }

    public java.lang.String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = java.lang.String.valueOf(color);
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public java.lang.String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}