module co.edu.uniquindio.tienda.tienda {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires static lombok;

    opens co.edu.uniquindio.tienda.tienda to javafx.fxml;
    exports co.edu.uniquindio.tienda.tienda;
    exports co.edu.uniquindio.tienda.tienda.controller;
    exports co.edu.uniquindio.tienda.tienda.viewController;
    opens co.edu.uniquindio.tienda.tienda.viewController to javafx.fxml;
}