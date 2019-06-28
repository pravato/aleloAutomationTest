package pages;

import model.Film;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage extends MarioMovies {
    private WebDriver navegador;
    private Film film;
    public GooglePage (WebDriver navegador){
        this.navegador = navegador;
    }

    public GooglePage informarDados(Film film){
        this.film = film;
        navegador.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(film.toString(), Keys.ENTER);
        //Após a pesquisa foi necessário adicionar um click ao botão de pesquisa novamente,
        //por que em alguns casos, após a conclusão da pesquisa ele não apresenta as informações de resultados aproximados.
        navegador.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > button")).click();
        return this;
    }

    public String pegarResultado(){
        String TxtBoxContent = navegador.findElement(By.id("resultStats")).getText();
        System.out.println();
        return "Foram encontrados "+TxtBoxContent+ "no Google para o filme "+film.getName()+" do Diretor "+film.getDirector().getName();
    }

}
