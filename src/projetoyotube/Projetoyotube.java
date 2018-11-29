
package projetoyotube;

public class Projetoyotube {

    public static void main(String[] args) {
        Video  [ ] v = new Video[3];
        v[0]= new Video ("Curso de poo");
        v[1]= new Video ("Curso de Php");
        v[2]= new Video("Curso de Html5");
        
        Gafanhoto []g = new Gafanhoto[2];
        g[0]= new Gafanhoto ("Magno ",29,"M","juba");
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
