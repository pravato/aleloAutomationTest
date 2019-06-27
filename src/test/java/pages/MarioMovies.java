package pages;
import java.util.ArrayList;
import java.util.Arrays;


public class MarioMovies {
    public static void main(String[] args){
        //Declaração da ArrayList contendo o Nome do Diretor
        ArrayList<String> nomediretor = new ArrayList<String>();

        //Adicionando os Diretores na ArrayList
        System.out.print( "Adicionando os Diretores: " );
        nomediretor.add("Peter Jackson");
        nomediretor.add("Steven Spielberg");
        nomediretor.add("Martin Scorsese");
        System.out.println( Arrays.toString( nomediretor.toArray() ) );

        //Declaração da ArrayList contendo o ano de nascimento do Diretor
        ArrayList<Integer> anodiretor = new ArrayList<Integer>();

        //Adicionando o ano de nascimento dos Diretores na ArrayList
        System.out.print( "Adicionando o ano de nascimento dos Diretores: " );
        anodiretor.add(1961);
        anodiretor.add(1946);
        anodiretor.add(1942);
        System.out.println( Arrays.toString( anodiretor.toArray() ) );

        //Declaração da ArrayList contendo o Nome do Filme
        ArrayList<String> nomefilme = new ArrayList<String>();

        //Adicionando os Diretores na ArrayList
        System.out.print( "Adicionando os filmes: " );
        nomefilme.add("O Senhor dos Anéis");
        nomefilme.add("O Resgate do Soldado Ryan");
        nomefilme.add("Ilha do Medo");
        System.out.println( Arrays.toString( nomefilme.toArray() ) );

        //Declaração da ArrayList contendo o ano de lançamento do Filme
        ArrayList<Integer> anofilme = new ArrayList<Integer>();

        //Adicionando o ano de nascimento dos Diretores na ArrayList
        System.out.print( "Adicionando o ano de lançamento dos filmes: " );
        anofilme.add(2001);
        anofilme.add(1998);
        anofilme.add(2010);
        System.out.println( Arrays.toString( anofilme.toArray() ) );

    }

}