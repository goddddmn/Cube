import java.awt.*;

public class Cube {
    private Facet[] facets;
    public Cube(){
        facets = new Facet[6];
        facets[0] = new Facet(new R3Vector(0,0,0),
                new R3Vector(1, 0,0),
                new R3Vector(1,1,0),
                new R3Vector(0, 1, 0));

        facets[1] = new Facet(new R3Vector(1,0,0),
                new R3Vector(1, 1,0),
                new R3Vector(1,1,1),
                new R3Vector(1, 0, 1));

        facets[2] = new Facet(new R3Vector(1,1,1),
                new R3Vector(1, 0,1),
                new R3Vector(0,0,1),
                new R3Vector(0, 1, 1));

        facets[3] = new Facet(new R3Vector(0, 0, 0),
                new R3Vector(0,1,0),
                new R3Vector(0,1,1),
                new R3Vector(0,0,1));

        facets[4]= new Facet(new R3Vector(0,1,0),
                new R3Vector(0,1,1),
                new R3Vector(1,1,1),
                new R3Vector(1,1,0));

        facets[5]=new Facet(new R3Vector(0,0,0),
                new R3Vector (0,0,1),
                new R3Vector(1,0,1),
                new R3Vector(1,0,0));
    }
    public void rotate (double dx,double dy,double dz){
        for(int i =1;i<6;i++){
            facets[i].rotate(dx,dy,dz);
        }
    }
    public void translate (double dx,double dy,double dz){
        for(int i =1;i<6;i++){
            facets[i].rotate(dx,dy,dz);
        }
    }
    public void mulNum (double d){
        for(int i =1;i<6;i++){
            facets[i].mulNum(d);
        }}
    public void draw(Graphics g){
        for(int i =1;i<6;i++){
            facets[i].draw(g);}


        facets[1].draw(g);
        facets[2].draw(g);
        facets[3].draw(g);
        facets[4].draw(g);
        facets[5].draw(g);

        }

    }

