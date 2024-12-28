package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tasks.LoginTask;
import tasks.RecruitmentTask;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
        WebDriver driver;

    @Given("que el usuario está en la página de login")
    public void abrirPaginaDeLogin() {
        WebDriverManager.chromedriver().setup(); // Configura automáticamente el driver
        driver = new ChromeDriver(); // Inicializa el navegador
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("ingresa las credenciales {string} y {string}")
    public void ingresarCredenciales(String usuario, String contraseña) {
        LoginTask.login(driver, usuario, contraseña); // Reutilizamos la tarea de Login
    }

    @And("navega a la funcionalidad {string}")
    public void navegarARecruitment(String funcionalidad) {
        RecruitmentTask.navegarARecruitment(driver);
    }

    @And("agrega una nueva persona con los datos {string}")
    public void agregarNuevaPersona(String nombre) {
        RecruitmentTask.agregarPersona(driver, nombre);
    }

    @Then("debería ver el mensaje de confirmación de éxito")
    public void verificarMensajeDeExito() {
        System.out.println("Proceso completado exitosamente.");
        driver.quit();
    }
}
