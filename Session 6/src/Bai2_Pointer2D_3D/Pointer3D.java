package Bai2_Pointer2D_3D;

public class Pointer3D extends Pointer2D {
    private float z;
    public Pointer3D() {

    }
    public Pointer3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Pointer3D{" +
                "z=" + z +
                " inherit: " + super.toString() +
                '}';
    }
}
