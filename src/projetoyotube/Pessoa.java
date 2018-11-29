
package projetoyotube;


public abstract  class Pessoa {
    
    protected String nome ;
    protected int idade;
    protected String sexo ;
    protected float exeperiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.exeperiencia=0;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExeperiencia() {
        return exeperiencia;
    }

    public void setExeperiencia(float exeperiencia) {
        this.exeperiencia = exeperiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", exeperiencia=" + exeperiencia + '}';
    }
    
    
    
}
