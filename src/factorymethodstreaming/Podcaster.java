package factorymethodstreaming;

import java.util.List;

public class Podcaster implements Factory{
    
    private String nome;
    private List<String> integrantes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<String> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public Podcast criaConteudo() {
        return new Podcast();
    }
    
}
