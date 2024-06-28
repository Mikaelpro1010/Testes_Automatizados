package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreLogin extends BasePage {
    public PreLogin(WebDriver navegador){
        super(navegador);
    }

    // Preencher o campo Username
    public PreLogin username(String username){
        navegador.findElement(By.id("username")).sendKeys(username);
        return this;
    }

    // Preencher o campo Password
    public PreLogin password(String password){
        navegador.findElement(By.id("password")).sendKeys(password);
        return this;
    }

    // Clicar no botão Login
    public PreLogin botaoLogin(){
        navegador.findElement(By.cssSelector("button[type='submit']")).click();
        return this;
    }

    // Verificar se a mensagem de sucesso é exibida
    public PreLogin alert(){
        navegador.findElement(By.cssSelector(".flash.success")).getText();
        return this;
    }
}
