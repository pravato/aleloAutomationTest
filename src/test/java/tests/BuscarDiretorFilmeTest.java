package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import pages.MarioMovies;
import support.Web;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class BuscarDiretorFilmeTest extends MarioMovies{
    private WebDriver navegador;

    @Before
    public void setUp() {
        navegador = Web.createBrowser();
    }

    @Test
    public void testBuscarDiretorFilmeGoogle(){
        new GooglePage(navegador)
            .informarDados("Peter Jackson O Senhor dos Anéis")
            .buscarDados()
            .pegarResultado();

    }
    @After
    public void tearDown(){
        //Fechar o navegador
       // navegador.quit();

    }


}
