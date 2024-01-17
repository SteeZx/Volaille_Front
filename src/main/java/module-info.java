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

    //requires java.io.File;
    //requires java.util;
    requires sib.api.v3.sdk;
    requires okhttp3;

    opens org.volaille.volaille_front to javafx.fxml;
    exports org.volaille.volaille_front;
}