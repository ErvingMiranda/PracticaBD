module org.ezone.pae.proyectoconexionbdg3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.ezone.pae.proyectoconexionbdg3 to javafx.fxml;
    opens org.ezone.pae.proyectoconexionbdg3.Controllers to javafx.fxml;

    exports org.ezone.pae.proyectoconexionbdg3;
}