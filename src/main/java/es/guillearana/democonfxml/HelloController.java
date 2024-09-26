package es.guillearana.democonfxml; /**
 * Sample Skeleton for 'hello-view.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML // fx:id="BtCalcular"
    private Button BtCalcular; // Value injected by FXMLLoader

    @FXML // fx:id="LbPrimerNum"
    private Label LbPrimerNum; // Value injected by FXMLLoader

    @FXML // fx:id="LbResultado"
    private Label LbResultado; // Value injected by FXMLLoader

    @FXML // fx:id="LbSegunNum"
    private Label LbSegunNum; // Value injected by FXMLLoader

    @FXML // fx:id="LbTitulo"
    private Label LbTitulo; // Value injected by FXMLLoader

    @FXML // fx:id="RbtDividir"
    private RadioButton RbtDividir; // Value injected by FXMLLoader

    @FXML // fx:id="RbtMulti"
    private RadioButton RbtMulti; // Value injected by FXMLLoader

    @FXML // fx:id="RbtRestar"
    private RadioButton RbtRestar; // Value injected by FXMLLoader

    @FXML // fx:id="RbtSumar"
    private RadioButton RbtSumar; // Value injected by FXMLLoader

    @FXML // fx:id="TexAPrimerNum"
    private TextArea TexAPrimerNum; // Value injected by FXMLLoader

    @FXML // fx:id="TexAResultado"
    private TextArea TexAResultado; // Value injected by FXMLLoader

    @FXML // fx:id="TexASegunNumero"
    private TextArea TexASegunNumero; // Value injected by FXMLLoader

    @FXML // fx:id="grupo"
    private ToggleGroup grupo; // Value injected by FXMLLoader

    @FXML
    void calcular(ActionEvent event) {

    }

    @FXML
    void dividir(ActionEvent event) {

    }

    @FXML
    void multiplicar(ActionEvent event) {

    }

    @FXML
    void sumar(ActionEvent event) {

    }

}
