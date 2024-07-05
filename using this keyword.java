import java.util.*;
class H {
    int ad,mat,phy,che;
    String name;
    void get(int ad,int mat,int phy,int che,String name)
    {
        this.ad=ad;
        this.mat=mat;
        this.phy=phy;
        this.che=che;
        this.name=name;
    }
    void show()
    {
        System.out.println(this.ad+" "+this.mat+" "+this.phy+" "+this.che+" "+this.name);
        
    }
    public static void main(String[] args) {
        H h=new H();
        h.get(11,7,7,67,"ghj");
        h.show();
    }
}


11 7 7 67 ghj
