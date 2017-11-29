package br.com.nervouse.view;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
	Para criar a "tela inicial" (ou também chamado de tela de launch da aplicação) no JavaFX deve-se criar uma subclasse de javafx.application.Application.
*/
public class ClienteView extends Application{
	
	/*
		O método main deve chamar o método herdado launch().
		O método launch vai chamar o método start em seguida para criação do palco.
	*/
	public static void main(String[] args) {
		launch(); 
	}

	/*
		O método start vai criar o palco da aplicação (sistema) e vai definir o cenário a ser exibido.
	*/
	@Override
	public void start(Stage palco) throws Exception { // O palco é fornecido pela API do JavaFX
		URL arquivoFXML = getClass().getResource("cliente.fxml"); // Carrega o arquivo cliente.fxml
		Parent fxmlParent = FXMLLoader.load(arquivoFXML); // Converte o FXML para objeto Java
		palco.setScene(new Scene(fxmlParent, 800, 500)); // Monta o cenário inicial com largura de 800px e altura de 500px
		palco.setTitle("Nervouse - Cliente"); // Define o título da tela
		palco.show(); // Exibe a tela
	}

}
