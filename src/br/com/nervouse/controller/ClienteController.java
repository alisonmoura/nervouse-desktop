package br.com.nervouse.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.nervouse.model.Cliente;
import br.com.nervouse.service.ClienteService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/*
	A interface Initializable permite que utilizemos o método initialize.
	O método initialize sempre é executado assim que a tela é carregada.
*/
public class ClienteController implements Initializable {

	ClienteService service = new ClienteService();
	Cliente cliente;

	@FXML
	TextField txtFieldNome;
	@FXML
	TextField txtFieldCpf;
	@FXML
	TextField txtFieldEmail;
	@FXML
	TextField txtFieldTelefone;
	@FXML
	TextField txtFieldEndereco;
	@FXML
	TableView<Cliente> tableView;
	@FXML
	TableColumn<Cliente, String> columNome;
	@FXML
	TableColumn<Cliente, String> columCpf;
	@FXML
	TableColumn<Cliente, String> columEmail;
	@FXML
	TableColumn<Cliente, String> columTelefone;

	/*
		Esse método é sempre chamado quando a tela é carregadaß.
	*/
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		atualizarTabela();
	}

	/*
		Método executado ao clicar no botão salvar
	*/
	public void salvar() {
		cliente = new Cliente();
		cliente.setNome(txtFieldNome.getText());
		cliente.setCpf(txtFieldCpf.getText());
		cliente.setEmail(txtFieldEmail.getText());
		cliente.setTelefone(txtFieldTelefone.getText());

		service.cadastrar(cliente);
		service.imprimir();

		limpar();
		atualizarTabela();
	}

	/*
		Método executado ao clicar no botão cancelar
	*/
	public void cancelar() {
		limpar();
	}

	/*
	 	Método privado para atualizar a tabela.
		Esse método percorre a lista de clientes cadastrados no ClienteService e para cada objeto cliente presente na lista ele cria uma linha na tabela
	*/
	private void atualizarTabela() {
		columNome.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome")); // Vincula a coluna nome da tabela com o atributo nome do cliente.
		columCpf.setCellValueFactory(new PropertyValueFactory<Cliente, String>("cpf")); // Vincula a coluna cpf da tabela com o atributo cpf do cliente.
		columEmail.setCellValueFactory(new PropertyValueFactory<Cliente, String>("email")); // Vincula a coluna email da tabela com o atributo email do cliente.
		columTelefone.setCellValueFactory(new PropertyValueFactory<Cliente, String>("telefone")); // Vincula a coluna telefone da tabela com o atributo telefone do cliente.

		tableView.getItems().setAll(service.buscarTodos()); // Sincroniza a tabela com todos os cliente cadastrados.
	}

	/*
		Método privado para limpar o formulário de cadastro.
	*/
	private void limpar() {
		txtFieldNome.setText("");
		txtFieldCpf.setText("");
		txtFieldEmail.setText("");
		txtFieldTelefone.setText("");
		txtFieldEndereco.setText("");
	}

}
