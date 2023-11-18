package activities.Contact;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {

    public TextBox firstnameTxBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"First name\"]"));

    public TextBox lastnameTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Last name\"]"));
    public TextBox phoneTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));
    public TextBox emailTxtBox = new TextBox(By.xpath("//android.widget.EditText[@text=\"Email\"]"));
    public Button saveButton = new Button(By.id("com.android.contacts:id/editor_menu_save_button"));
}
