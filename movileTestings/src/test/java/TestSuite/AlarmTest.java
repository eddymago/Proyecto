package testSuite;

import activities.Alarm.AddTaskScreen;
import activities.note.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.util.Date;

public class AlarmTest {
    MainScreen mainScreen = new MainScreen();
    AddTaskScreen addTaskScreen = new AddTaskScreen();

    @Test
    public void createNewTaskTest(){
        String title="Santa Cruz";
        mainScreen.addButton.click();
        addTaskScreen.titleTxtBox.setText(title);
        addTaskScreen.noteTxtBox.setText("esto es una prueba");
        addTaskScreen.saveButton.click();
        Assertions.assertTrue(mainScreen.getTaskName(title).isControlDisplayed(),
                "ERROR la tarea no fue creada");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }


}