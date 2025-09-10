package LW_01;

public class Circle {
    float r;
    float PI = (float) Math.PI;

    public void setRadius(float r) {
        this.r = r;
    }

    public float computeArea() {
        return (float) (PI * this.r * this.r);
    }

    public float computeCircumference() {
        return (float) (2 * PI * this.r);
    }
}
