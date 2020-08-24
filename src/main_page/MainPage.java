package main_page;

import Models.Individual;
import handlers.DbHandler;
import handlers.IndividualHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPage implements Initializable
{

    @FXML
    private TextField pa_field;

    @FXML
    private TableView<Individual> avn_table;

    @FXML
    private TableColumn<Individual, String> PMA;

    @FXML
    private TableColumn<Individual, Integer> PA_No;

    @FXML
    private TableColumn<Individual, String> rank;

    @FXML
    private TableColumn<Individual, String> name;

    @FXML
    private TableColumn<Individual, String> unit;

    @FXML
    private TableColumn<Individual, String> med_cat;

    @FXML
    private TableColumn<Individual, String> avn_basic_course;

    @FXML
    private TableColumn<Individual, String> dob;

    @FXML
    private TableColumn<Individual, String> doc;

    @FXML
    private TableColumn<Individual, String> do_J_Avn;

    private ObservableList<Individual> individuals;

    @FXML
    void search(ActionEvent event) {
        int pa_no = new Integer(pa_field.getText());
        Individual individual = IndividualHandler.getIndividual(pa_no);
        System.out.println(individual);
        individuals = FXCollections.observableArrayList();
        individuals.add(individual);
        avn_table.setItems(individuals);
        avn_table.setVisible(true);
    }
    @Override public void initialize(URL location, ResourceBundle resources)
    {
        DbHandler.createConnection();

        PMA.setCellValueFactory(new PropertyValueFactory<>("PMA"));
        PA_No.setCellValueFactory(new PropertyValueFactory<>("PA_No"));
        rank.setCellValueFactory(new PropertyValueFactory<>("Rank"));
        name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        unit.setCellValueFactory(new PropertyValueFactory<>("Unit"));
        med_cat.setCellValueFactory(new PropertyValueFactory<>("Med_cat"));
        avn_basic_course.setCellValueFactory(new PropertyValueFactory<>("Avn_basic_course"));
        dob.setCellValueFactory(new PropertyValueFactory<>("Dob"));
        doc.setCellValueFactory(new PropertyValueFactory<>("Doc"));
        do_J_Avn.setCellValueFactory(new PropertyValueFactory<>("Do_j_Avn"));
        avn_table.setVisible(false);
    }
}
