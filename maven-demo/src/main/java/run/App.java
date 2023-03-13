package run;

import io.vproxy.vfx.ui.stage.VStage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xuyan
 * @Date: 2023-03-01
 * @Time: 16:27
 */
public class App extends Application {

    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.getIcons().add(new Image("file:"+"D:\\daima_guanli\\Java_Learn\\maven-demo\\src\\main\\java\\img\\img.png"));
        stage.setHeight(400);
        stage.setWidth(600);
        stage.setScene(new Scene(new Group()));
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

}
