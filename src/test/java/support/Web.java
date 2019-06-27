package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createBrowser(){
        String driverPath = "C:\\webdriver\\"; //Pasta onde está localizado o ChromeDrive

        //Chrome
        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe"); //Chamando o Chrome
        WebDriver navegador = new ChromeDriver(); //Instanciando o Chrome

        navegador.manage().window().maximize(); //Maximizando o browser
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Criando um timeout de 5 segundos a cada ação, para evitar quebras

        //Definindo a página  que será aberta pelo WebDriver: Google
        String url = "https://www.google.com";

        //Navegador acessa a página do Google (definida acima)
        navegador.get(url);

        return navegador;
    }

}
