module org.volaille.volaille_front {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens org.volaille.volaille_front to javafx.fxml;
    opens org.volaille.volaille_back to javafx.base;
    exports org.volaille.volaille_front;
}