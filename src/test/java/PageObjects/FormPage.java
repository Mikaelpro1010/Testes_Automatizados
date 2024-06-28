package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PreLogin;

import suporte.Web;

//Aluno: Antonio Mikael Vasconcelos Aguiar
public class FormPage {

    private WebDriver navegador;

    @BeforeTest
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void TestFormulario(){
        new PreLogin(navegador)
                .username("tomsmith")
                .password("SuperSecretPassword!")
                .botaoLogin()
                .alert();
    }

}
