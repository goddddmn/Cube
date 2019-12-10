public class Main {
    public static void main(String[] args) {
        R3Vector v1 = new R3Vector(0,0,0);
        R3Vector v2 = new R3Vector(1,0,0);
        R3Vector v3 = new R3Vector(1,1,0);
        R3Vector v4 = new R3Vector(0,1,0);
        Facet a = new Facet(v1, v2, v3, v4);
        a.show();
        a.rotateOX(90);
        a.show();
    }
}