package factorymethodstreaming;

import java.util.Arrays;
import java.util.List;


public class FactoryMethodStreaming {

    public static void main(String[] args) {
       
        Artista artista = new Artista();
        artista.setNome("BK");
        Musica musica = artista.criaConteudo();
        musica.setTitulo("Bloco 7");
        musica.setDuracao(3.46);
        musica.setAno(2020);
        musica.setAlbum("O Líder em Movimento");
        
        Podcaster podcaster = new Podcaster();
        podcaster.setNome("GrupaCast");
        List<String> integrantes = Arrays.asList("Sabrina Ferreira", "Carol Toleto");
        podcaster.setIntegrantes(integrantes);
        Podcast podcast = podcaster.criaConteudo();
        podcast.setTitulo("Análise Rodada 32 do Brasileirão");
        podcast.setDuracao(33.0);
        podcast.setTema("Futebol");
        
        System.out.println("Artista: "+artista.getNome()+".\nTitulo: "+musica.getTitulo()+".\nAlbum: "+musica.getAlbum()+".\n"
                + "Duração: "+musica.getDuracao()+".\nAno: "+musica.getAno()+".\n");
       
        System.out.println("Titulo: "+podcast.getTitulo()+".\nNome: "+podcaster.getNome()+".\nIntegrantes: "+podcaster.getIntegrantes()+
                ".\nDuração: "+podcast.getDuracao()+".\nTema: "+podcast.getTema()+".\n");
    }
    
}
