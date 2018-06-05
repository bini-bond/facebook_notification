
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Automate1 {

    public  static String EMAIL;
    public  static String PASSWORD;


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ur email: ");
        EMAIL = input.nextLine();
        System.out.println("Enter ur password: ");
        PASSWORD = input.nextLine();
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver my_driver = new ChromeDriver();
        my_driver.get("http://google.com");
        my_driver.get("http://facebook.com");
        WebElement username;
        username = my_driver.findElement(By.id("email"));
        WebElement password;
        password = my_driver.findElement(By.id("pass"));
        username.sendKeys(EMAIL);
        password.sendKeys(PASSWORD);
        WebElement form = my_driver.findElement(By.id("login_form"));
        form.submit();
        WebElement notify = my_driver.findElement(By.id("notificationsCountValue"));
        String count = notify.getText();




        my_driver.close();
        my_driver.quit();
        System.out.println("You have "+count+" Notifications");

    }
}
