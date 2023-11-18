package activities.whenDo;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Label getTaskName(String name){
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+name+"']")));
        return nameTask;
    }
}

