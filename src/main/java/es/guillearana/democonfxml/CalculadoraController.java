package es.guillearana.democonfxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 * Controlador para una calculadora simple que maneja las operaciones de suma, resta,
 * multiplicación y división, utilizando JavaFX y un archivo FXML.
 */
public class CalculadoraController {

    // Atributos relacionados con la interfaz gráfica definidos en el archivo FXML

    /** Botón para iniciar el cálculo. */
    @FXML
    private Button BtCalcular;

    /** Etiqueta para el primer número. */
    @FXML
    private Label LbPrimerNum;

    /** Etiqueta para mostrar el resultado del cálculo. */
    @FXML
    private Label LbResultado;

    /** Etiqueta para el segundo número. */
    @FXML
    private Label LbSegunNum;

    /** Etiqueta del título principal de la calculadora. */
    @FXML
    private Label LbTitulo;

    /** RadioButton para seleccionar la operación de división. */
    @FXML
    private RadioButton RbtDividir;

    /** RadioButton para seleccionar la operación de multiplicación. */
    @FXML
    private RadioButton RbtMulti;

    /** RadioButton para seleccionar la operación de resta. */
    @FXML
    private RadioButton RbtRestar;

    /** RadioButton para seleccionar la operación de suma. */
    @FXML
    private RadioButton RbtSumar;

    /** Área de texto donde el usuario introduce el primer número. */
    @FXML
    private TextArea TexAPrimerNum;

    /** Área de texto donde se muestra el resultado del cálculo. */
    @FXML
    private TextArea TexAResultado;

    /** Área de texto donde el usuario introduce el segundo número. */
    @FXML
    private TextArea TexASegunNumero;

    /** Grupo que agrupa los RadioButtons para garantizar que solo se seleccione una operación. */
    @FXML
    private ToggleGroup grupo;

    /**
     * Método que se ejecuta cuando el usuario hace clic en el botón "Calcular".
     * Se encarga de realizar la operación seleccionada por el usuario.
     *
     * @param event El evento de clic generado cuando se pulsa el botón.
     */
    @FXML
    void calcular(ActionEvent event) {
        try {
            // Obtención de los números introducidos por el usuario desde los campos de texto
            double num1 = Double.parseDouble(TexAPrimerNum.getText());
            double num2 = Double.parseDouble(TexASegunNumero.getText());
            double resultado = 0; // Variable que almacenará el resultado de la operación

            // Se verifica qué RadioButton está seleccionado y se realiza la operación correspondiente
            if (RbtSumar.isSelected()) {
                // Si se seleccionó la opción de sumar, se realiza la suma
                resultado = num1 + num2;
            } else if (RbtRestar.isSelected()) {
                // Si se seleccionó la opción de restar, se realiza la resta
                resultado = num1 - num2;
            } else if (RbtMulti.isSelected()) {
                // Si se seleccionó la opción de multiplicar, se realiza la multiplicación
                resultado = num1 * num2;
            } else if (RbtDividir.isSelected()) {
                // Si se seleccionó la opción de dividir, se verifica que el divisor no sea cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    // Si el divisor es cero, se muestra un mensaje de error en lugar del resultado
                    TexAResultado.setText("Error: División entre cero.");
                    return; // Se sale del método para evitar que continúe el cálculo
                }
            }

            // Se muestra el resultado de la operación en el área de texto destinada para el resultado
            TexAResultado.setText(String.valueOf(resultado));

        } catch (NumberFormatException e) {
            // Si los números introducidos no son válidos (ej. caracteres no numéricos), se muestra un mensaje de error
            TexAResultado.setText("Error: Ingresa números válidos.");
        }
    }

}
