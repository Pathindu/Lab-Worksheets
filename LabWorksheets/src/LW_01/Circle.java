package LW_01;

public class Circle {
    float r;
    float PI = (float) Math.PI;

    public void setRadius(float r) {
        this.r = r;
    }

    public float computeArea() {
        return (PI * this.r * this.r);
    }

    public float computeCircumference() {
        return (2 * PI * this.r);
    }
}
