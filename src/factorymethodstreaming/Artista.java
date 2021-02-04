package factorymethodstreaming;

public class Artista implements Factory{
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public Musica criaConteudo() {
        return new Musica();
    }
}
