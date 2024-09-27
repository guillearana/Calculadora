package es.guillearana.democonfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Extiende la clase {@link javafx.application.Application} para inicializar y mostrar la interfaz gráfica de la aplicación.
 */
public class HelloApplication extends Application {

    /**
     * Este es el método principal de la aplicación JavaFX, encargado de iniciar la interfaz gráfica.
     * Se sobrescribe de la clase {@link javafx.application.Application}.
     *
     * @param stage El escenario principal en el que se cargará la escena (la ventana de la aplicación).
     * @throws IOException Si ocurre un error al cargar el archivo FXML (archivo de diseño de la interfaz gráfica).
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Se carga el archivo FXML que contiene la estructura de la interfaz gráfica (diseño de la UI)
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Se crea una nueva escena con el contenido del archivo FXML, especificando su tamaño inicial
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Configuración de las dimensiones máximas y mínimas de la ventana (stage)
        stage.setMaxWidth(600);  // Máxima anchura de la ventana
        stage.setMinWidth(600);  // Mínima anchura de la ventana
        stage.setMaxHeight(440); // Máxima altura de la ventana
        stage.setMinHeight(440); // Mínima altura de la ventana

        // Se define el título de la ventana de la aplicación
        stage.setTitle("Hello!");

        // Se asigna la escena creada al escenario principal (ventana)
        stage.setScene(scene);

        // Se muestra la ventana
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación JavaFX.
     * Este método ejecuta la aplicación llamando al método  que inicia el ciclo de vida de JavaFX.
     *
     * @param args Argumentos de la línea de comandos (si los hubiera).
     */
    public static void main(String[] args) {
        // Lanza la aplicación JavaFX
        launch();
    }
}
