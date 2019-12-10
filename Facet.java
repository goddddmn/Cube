import java.util.Vector;

public class Facet {
    private R3Vector[] vertex;
    public Facet(R3Vector v1, R3Vector v2, R3Vector v3, R3Vector v4){
        vertex = new R3Vector[4];
        vertex[0] = v1;
        vertex[1] = v2;
        vertex[2] = v3;
        vertex[3] = v4;
    }
    public void out(){
        vertex[0].printVector();
        System.out.println(" - ");
        vertex[1].printVector();
        System.out.println("\n");

        vertex[1].printVector();
        System.out.println(" - ");
        vertex[2].printVector();
        System.out.println("\n");

        vertex[2].printVector();
        System.out.println(" - ");
        vertex[3].printVector();
        System.out.println("\n");

        vertex[3].printVector();
        System.out.println(" - ");
        vertex[0].printVector();
        System.out.println("\n");
    }

    public void rotate(double ux, double uy, double uz){
        vertex[0].rotate(ux, uy, uz);
        vertex[1].rotate(ux, uy, uz);
        vertex[2].rotate(ux, uy, uz);
        vertex[3].rotate(ux, uy, uz);
    }

    public void translate(double dx, double dy, double dz){
        vertex[0].translate(dx, dy, dz);
        vertex[1].translate(dx, dy, dz);
        vertex[2].translate(dx, dy, dz);
        vertex[3].translate(dx, dy, dz);
    }

    public void mulNum(double n){
        vertex[0].mulNum(n);
        vertex[1].mulNum(n);
        vertex[2].mulNum(n);
        vertex[3].mulNum(n);
    }
}