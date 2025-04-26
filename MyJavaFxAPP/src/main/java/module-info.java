module com.example.myjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires fontawesomefx;
    requires java.sql;
    requires java.desktop;
    requires org.postgresql.jdbc;
    requires org.controlsfx.controls;
    requires com.almasb.fxgl.scene;
    requires jasperreports;
    requires com.almasb.fxgl.all;

    opens com.example.myjavafxapp to javafx.fxml;
    exports com.example.myjavafxapp;
}