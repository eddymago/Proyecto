package TestSuite;

import activities.Contact.AddTaskScreen;
import activities.contact.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class ContactTest {
    MainScreen mainScreen = new MainScreen();
    AddTaskScreen addTaskScreen = new AddTaskScreen();

    @Test
    public void createNewTaskTest(){
        String title="eddyson"+new Date().getTime();
        mainScreen.addButton.click();
        addTaskScreen.firstnameTxBox.setText(title);
        addTaskScreen.lastnameTxtBox.setText("machuca");
        addTaskScreen.phoneTxtBox.setText("67323560");
        addTaskScreen.emailTxtBox.setText("machuca@gmail.com");
        addTaskScreen.saveButton.click();
        //Assertions.assertTrue(mainScreen.getTaskName(title).isControlDisplayed(),
              //  "ERROR la tarea no fue creada");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }


}