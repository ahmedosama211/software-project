/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author ahmed
 */
public class FXMLDocumentController implements Initializable {
    //Search pane

    @FXML
    private Tab search_tab;
   @FXML
   private AnchorPane Search_pane;
    
     @FXML
    private TextField Title_text;
    
    @FXML
    private TextField Author_text;
    
    @FXML
    private TextField ISBN_text;
    
     @FXML
    private Button Search_button ;
    @FXML
    private Label Result1_label;
    @FXML
    private Label Result2_label;
    
     
   // login tab
    @FXML
    private Tab Login_tab;
    @FXML
    private AnchorPane Login_pane;
    @FXML
    private Label Username_label;
       @FXML
    private Label Password_label;  
     
    @FXML
    private Button Login_button;
    @FXML 
    private TextField User_text;

    @FXML 
    private PasswordField Pass_field;
//librarian tab
    @FXML
    private Tab Librarian_tab;
    @FXML
    private AnchorPane Librarian_pane;
    
       @FXML
    private Button Registertab_button;
       @FXML
    private Button AddBooktab_button;
      @FXML
    private Button UpdateMembertab_button;
    @FXML
    private Button Checkouttab_button;
       @FXML
    private Button UpdateBooktab_button;
    //ADD tab 
    @FXML
    private Tab ADD_tab;
    @FXML
    private AnchorPane ADD_pane;
    @FXML
    private Button ADD_button;
    @FXML
    private TextField Title1_text;
    
    @FXML
    private TextField Author1_text;
    
    @FXML
    private TextField ISBN1_text;
     @FXML
    private TextField Location_text;
    
    @FXML
    private TextField State_text;
//Update tab                    
      @FXML
    private Tab Update_tab;
    @FXML
    private AnchorPane Update_pane;        
    @FXML
    private TextField ID_text;       
      @FXML
    private Button Update_button;   
   //issue tab        
       @FXML
    private Tab Issue_tab;
    @FXML
    private AnchorPane Issue_pane;        
    @FXML
    private TextField ISBN2_text;   
     @FXML
    private TextField State1_text; 
        @FXML
    private Button Issue_button; 
      //checkout tab      
    @FXML
    private Tab Checkout_tab;
    @FXML
    private AnchorPane Checkout_pane;        
    @FXML
    private TextField ISBN3_text;   
    @FXML
    private TextField ID2_text; 
    @FXML
    private Button Retrieve_button;  
     @FXML
    private Button Checkout_button;   
     //Register tab 
     @FXML
    private Tab Register_tab;
    @FXML
    private AnchorPane Register_pane;        
    @FXML
    private TextField FirstName_text;   
    @FXML
    private TextField LastName_text; 
     @FXML
    private TextField Address_text; 
     @FXML
    private TextField Date_text; 
    @FXML
    private Button Register_button;        
      //tabs are done add code 
    
           /*  Librarian_tab.setDisable(true); 
        search_tab.setDisable(false);
        Update_tab.setDisable(true);
        Register_tab.setDisable(true);
        ADD_tab.setDisable(true);
        Checkout_tab.setDisable(true);
        Issue_tab.setDisable(true);
        Login_tab.setDisable(false);*/
           
    @FXML
    private void loginButtonAction(ActionEvent event) {
       Librarian_tab.setDisable(false); 
        search_tab.setDisable(false);
        Update_tab.setDisable(true);
        Register_tab.setDisable(true);
        ADD_tab.setDisable(true);
        Checkout_tab.setDisable(true);
        Issue_tab.setDisable(true);
        Login_tab.setDisable(true);
     
    }
     @FXML
    private void searchButtonAction(ActionEvent event) {
        Librarian_tab.setDisable(true); 
        search_tab.setDisable(false);
        Update_tab.setDisable(true);
        Register_tab.setDisable(true);
        ADD_tab.setDisable(true);
        Checkout_tab.setDisable(true);
        Issue_tab.setDisable(true);
        Login_tab.setDisable(false);
       
    }
      @FXML
    private void registertabButtonAction(ActionEvent event) {





       
    }
      @FXML
    private void addbookButtonAction(ActionEvent event) {
       
       
    }
      @FXML
    private void updatebookButtonAction(ActionEvent event) {
       
       
    }
      @FXML
    private void updatememberButtonAction(ActionEvent event) {
       
       
    }
      @FXML
    private void chechkouttabButtonAction(ActionEvent event) {
       
       
    }
      
    @FXML
    private void addButtonAction(ActionEvent event) {
       
       
    }
      
    @FXML
    private void updateButtonAction(ActionEvent event) {
       
       
    }  
    @FXML
    private void issueButtonAction(ActionEvent event) {
       
       
    }  
    @FXML
    private void retrieveButtonAction(ActionEvent event) {
       
       
    } 
    @FXML
    private void chechkoutButtonAction(ActionEvent event) {
       
       
    } 
    @FXML
    private void registerButtonAction(ActionEvent event) {
       
       
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
