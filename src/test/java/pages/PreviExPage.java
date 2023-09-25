package pages;

import org.openqa.selenium.WebDriver;

public class PreviExPage extends BasePage{

    public PreviExPage() {
        super(navegador);
    }
    String linkPreviEx = "https://previexappdev.azurewebsites.net/";
    String botonInicioSesion = "//span[contains(text(),'Iniciar Sesión')]";
    String cajaUsuario = "//input[@id='i0116']";
    String usuario = "usrglohits@central.jbgye.org.ec";
    String botonSiguiente = "//input[@id='idSIButton9']";
    String cajaContrasena = "//input[@id='i0118']";
    String contrasena = "s0D4hd@4d8KG";
    String botonInicio = "//input[@id='idSIButton9']";
    String botonNO = "//input[@id='idBtn_Back']";
    String menu = "/html[1]/body[1]/app-root[1]/app-content-layout[1]/div[1]/app-header[1]/header[1]/div[1]/i[1]";
    public void abrirNavegador() {
        maximizar();
        ingresarSitio(linkPreviEx);

    }

    public void iniciarSesion() throws InterruptedException {
        System.out.println("empiezo");
        //String parentHandle = navegador.getWindowHandle();
        pagina1();
        System.out.println("Pagina Principal - " + pagina1());
        //base.click(BotonSesion);
        clickEnElemento(botonInicioSesion);
        //Set<String> handles = navegador.getWindowHandles();
        paginas();
        //recorrer lista
        //for (String handle : handles) {
        for (String pagina2 : paginas()) {
            //System.out.println(handle);
            System.out.println("Varias paginas - " + pagina2);
            //if(!handle.equals(parentHandle)) {
            if (!pagina2.equals(pagina1())) {
                //trasladarse a la segunda ventana - inicio de sesión
                //navegador.switchTo().window(handle);
                cambioPagina(pagina2);
                //base.type(usuario, BoxUsuario);
                agregarTexto(cajaUsuario, usuario);
                //base.click(BotonSiguiente);
                clickEnElemento(botonSiguiente);
                //base.type(contrasena, BoxContrasena);
                agregarTexto(cajaContrasena, contrasena);
                //Thread.sleep(1000);
                System.out.println("estoy dentro");
                //base.click(BotonSiguiente);
                clickEnElemento(botonInicio);
                //base.click(BotonNo);
                clickEnElemento(botonNO);
            }
        }
        //regresear a la primera ventana
        //navegador.switchTo().window(parentHandle);
        Thread.sleep(3000);
        cambioPagina(pagina1());
        System.out.println("sali");
    }

//

}
