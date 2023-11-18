package activities.Alarm;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddTaskScreen {

    public TextBox titleTxtBox = new TextBox(By.id("com.google.android.deskclock:id/open_search_view_edit_text"));

    public TextBox noteTxtBox = new TextBox(By.id("com.splendapps.adler:id/etNoteNote"));

    public Button saveButton = new Button(By.id("com.splendapps.adler:id/ivSaveAndExit"));
}
