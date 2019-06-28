package tests;

import model.Film;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.MarioMovies;
import support.Web;

public class BuscarDiretorFilmeTest extends MarioMovies{

    private WebDriver navegador;
    private GooglePage googlePage;

    @Before
    public void setUp() {

        navegador = Web.createBrowser();
        googlePage = new GooglePage(navegador);
    }

    @Test
    public void testBuscarDiretorFilmeGoogle(){
        for (Film film : MarioMovies.films){
            String searchResult = googlePage
                    .informarDados(film)
                    .pegarResultado();
            System.out.println(searchResult);
            Web.refreshBrowser();
        }
    }

    @After
    public void tearDown(){

    navegador.quit();

    }


}
