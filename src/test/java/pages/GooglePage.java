package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends MarioMovies {
    private WebDriver navegador;
    public GooglePage (WebDriver navegador){
        this.navegador = navegador;
    }

    public GooglePage informarDados(String info){
        navegador.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(info);

        return this;
    }

    public GooglePage buscarDados(){
        navegador.findElement(By.name("btnK")).click();

        return this;
    }

    public GooglePage pegarResultado(){
        String TxtBoxContent = navegador.findElement(By.id("resultStats")).getText();
        System.out.println("Foram encontrados "+TxtBoxContent+ "no Google");

        return this;
    }

}
