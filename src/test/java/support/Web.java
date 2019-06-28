package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {

    private final static String url = "https://www.google.com.br/";
    private static WebDriver navegador;

    public static WebDriver  createBrowser(){

        String driverPath = "C:\\webdriver\\";

        System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        navegador.get(url);

        return navegador;
    }

    public static WebDriver refreshBrowser(){

        navegador.get(url);
        return navegador;
    }

}
