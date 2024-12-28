package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecruitmentTask {
    public static void navegarARecruitment(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Recruitment']")));
        driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
    }

    public static void agregarPersona(WebDriver driver, String nombre) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(., ' Add ')]")));
        driver.findElement(By.xpath("//button[contains(., ' Add ')]")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
        driver.findElement(By.name("firstName")).sendKeys(nombre.split(" ")[0]);
        driver.findElement(By.name("middleName")).sendKeys(nombre.split(" ")[1]);
        driver.findElement(By.name("lastName")).sendKeys(nombre.split(" ")[2]);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
}