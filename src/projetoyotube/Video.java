
package projetoyotube;


class Video implements AcoesVideo {
    
    private String titulo;
    private int avaliacao;
    private int curtidas;
    private int views;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    
    
    @Override
    public int views() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int curtidas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reproduzir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + 
                ", curtidas=" + curtidas + ", views=" + views + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
