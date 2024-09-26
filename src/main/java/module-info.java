module es.guillearana.democonfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.guillearana.democonfxml to javafx.fxml;
    exports es.guillearana.democonfxml;
}