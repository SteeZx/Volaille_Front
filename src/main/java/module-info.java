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

    requires sendinblue.*;
    requires sendinblue.auth.*;
    requires sibModel.*;
    requires sibApi.AccountApi;

    requires java.io.File;
    requires java.util.*;

    opens org.volaille.volaille_front to javafx.fxml;
    exports org.volaille.volaille_front;
}