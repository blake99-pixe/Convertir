/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * FXML Controller class
 *
 * @author FOSTER
 */
public class VRController12 implements Initializable {

    

    @FXML
    private Button btnConvertir;
    @FXML
    private TextField txtC;
    @FXML
    private Label lCadena1;
   
    @FXML
    private TableView<Conversion> tablaC;
    @FXML
    private TableColumn Centigrados;
    @FXML
    private TableColumn Kelvin;
    @FXML
    private TableColumn Reamur;
    ObservableList<Conversion> t;

    /* En el metodo initialize se inicializa la tabla y se realiza todo
    lo necesario para que funcione el GUI.
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.Centigrados.setCellValueFactory(new PropertyValueFactory("centigrados"));
        this.Kelvin.setCellValueFactory(new PropertyValueFactory("kelvin"));
        this.Reamur.setCellValueFactory(new PropertyValueFactory("reamur"));
        
        btnConvertir.setOnAction(e -> {
           

            this.tablaC.setItems(getDatos());
            
        });
    }
      

    public ObservableList<Conversion> getDatos(){
        t = FXCollections.observableArrayList();

        double c = Double.parseDouble(this.txtC.getText());
        double k;
        double r;
        
            Operaciones op = new Operaciones();
            k = op.a_Kelvin(c);
            r = op.a_reamur(c);
            /*
            n1[i] = vc.generarBit(vc.a_Binario(c.charAt(i)), true, false);

            n2[i] = c.substring(i, i + 1);

            n3[i] = vc.a_Binario(c.charAt(i));
            rebuild += n3[i];

            n4[i] = String.valueOf(n1[i].charAt(0));
            bit.append(n4[i]);
            */
            t.add(new Conversion(c,k,r));

        

        return t;
    }




}
