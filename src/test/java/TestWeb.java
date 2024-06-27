import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Aluno: Antonio Mikael Vasconcelos Aguiar
public class TestWeb {
    @Test
    public void TestFormulario(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login");

        // Preencher o campo Username
        WebElement campoUsername = navegador.findElement(By.id("username"));
        campoUsername.sendKeys("tomsmith");

        // Preencher o campo Password
        WebElement campoPassword = navegador.findElement(By.id("password"));
        campoPassword.sendKeys("SuperSecretPassword!");

        // Clicar no botão Login
        WebElement botaoLogin = navegador.findElement(By.cssSelector("button[type='submit']"));
        botaoLogin.click();

        // Verificar se a mensagem de sucesso é exibida
        WebElement mensagemSucesso = navegador.findElement(By.cssSelector(".flash.success"));
        String textoMensagem = mensagemSucesso.getText();
        Assert.assertTrue(textoMensagem.contains("You logged into a secure area!"),
                "Login não realizado com sucesso.");
    }
}
