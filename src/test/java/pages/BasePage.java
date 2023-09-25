package pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class BasePage {
    protected static WebDriver navegador;
    private static WebDriverWait espera;
    private static Actions action;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        navegador = new ChromeDriver(chromeOptions);
        espera = new WebDriverWait(navegador, Duration.ofSeconds(10));
    }

    public BasePage(WebDriver navegador) {
        BasePage.navegador = navegador;
        espera = new WebDriverWait(navegador, Duration.ofSeconds(10));
    }

    public static void ingresarSitio(String url) {
        navegador.get(url);
    }

    public void maximizar() {
        navegador.manage().window().maximize();
    }

    private WebElement find(String locator) {
        return espera.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        //return espera.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public void clickEnElemento(String locator) {
            find(locator).click();
    }

    public void agregarTexto(String locator, String texto) {
        find(locator).clear();
        find(locator).sendKeys(texto);
    }

    public void dobleClick(String locator) {
        action.doubleClick(find(locator));
    }

    public String pagina1() {
        return navegador.getWindowHandle();

    }

    public Set<String> paginas(){
        return navegador.getWindowHandles();
    }

    public void cambioPagina(String codigo) {
        navegador.switchTo().window(codigo);
    }

    public void cerrarNavegador() {
        navegador.quit();
    }






}
