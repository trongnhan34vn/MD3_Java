package Bai2_Pointer2D_3D;

public class Pointer2D {
    private float x, y;

    public Pointer2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Pointer2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public float[] getXY() {
        return new float[] {this.x,this.y};
    }

    @Override
    public String toString() {
        return "Pointer2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
