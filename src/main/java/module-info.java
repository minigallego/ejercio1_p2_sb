module com.example.ejercio1_p2_sb {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ejercio1_p2_sb to javafx.fxml;
    exports com.example.ejercio1_p2_sb;
}