package org.ezone.pae.proyectoconexionbdg3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class
                .getResource("principal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Prueba de conexión a BD");
        stage.setScene(scene);
        stage.show();
    }
}
