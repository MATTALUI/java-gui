/*
 * This Java source file was generated by the Gradle 'init' task.
 */
 import javafx.application.Application;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.layout.*;
 import javafx.stage.Stage;
 import javafx.scene.text.Text;
 import javafx.geometry.*;
 import javafx.scene.control.*;
 import javafx.scene.paint.*;
 import javafx.scene.text.*;
 // import java.awt.*;

public class App extends Application {

  private Stage primary = new Stage();
  @Override
  public void start(Stage primaryStage){
    this.primary = primaryStage;
    Scene login = this.buildLogin();
    primaryStage.setTitle("Login");
    primaryStage.setScene(login);
    // primaryStage.setSize(new Dimension(100, 200));
    primaryStage.setResizable(false);
    primaryStage.show();
  }

  private Scene buildLogin(){
    GridPane grid = new GridPane();
    grid.setHgap(7);
    grid.setVgap(7);
    grid.setPadding(new Insets(25,25,25,25));


    Scene login = new Scene(grid, 300, 275);
    login.getStylesheets().add("styles.css");

    Text scenetitle = new Text("Please Login");
    scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
    Label userName = new Label("Username:");
    TextField usernameInput = new TextField();
    Label password = new Label("Password:");
    PasswordField passwordInput = new PasswordField();

    grid.add(scenetitle, 0,0,2,1);
    grid.add(userName, 0, 1);
    grid.add(usernameInput, 1,1);
    grid.add(password,0,2);
    grid.add(passwordInput,1,2);
    // grid.setGridLinesVisible(true);



    Button signInButton = new Button("Sign In");
    HBox hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
    hbBtn.getChildren().add(signInButton);
    grid.add(hbBtn, 1, 4);

    final Text actiontarget = new Text();
    grid.add(actiontarget,1,6);
    signInButton.setOnAction(event ->
    {
      String user = usernameInput.getText();
      String pass = passwordInput.getText();
      if(user.equals("matt") && pass.equals("pass"))
      {
        // this.primary.setHeight(600);
        actiontarget.setFill(Color.GREEN);
        actiontarget.setText("You did it!");
      }else{
        actiontarget.setFill(Color.FIREBRICK);
        actiontarget.setText("Credentials Incorrect.");
      }
    });
    return login;
  }
}
