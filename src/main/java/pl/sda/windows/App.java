package pl.sda.windows;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.sda.windows.controller.RootController;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader =new FXMLLoader();
        //Parent root = FXMLLoader.load(getClass().getResource("/rootview.fxml")); //opckjpnalnie skrotowo
        fxmlLoader.setLocation(getClass().getResource("/rootview.fxml"));
        fxmlLoader.load();

        RootController controller = fxmlLoader.getController();
        System.out.println(controller);
        controller.test();


        Parent parent = fxmlLoader.getRoot();
        primaryStage.setScene(new Scene(parent));
        primaryStage.show();
    }
}
