import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {
    public static void main(String[] args) {
        try {
            // Configura WebDriverManager para manejar ChromeDriver automáticamente
            WebDriverManager.chromedriver().setup();

            // Inicializa el navegador Chrome
            WebDriver driver = new ChromeDriver();

            // Navega a la página de prueba
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            System.out.println("Página abierta correctamente: " + driver.getTitle());

            // Cierra el navegador después de la prueba
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
