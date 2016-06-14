package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXColorPicker;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;


public class MainWindowController implements Initializable {
	
	private int decimalClick = 0;
	
	private String generalOperator;
	
	private Double firstDouble;
	
	
	
	
	
	@FXML
	private TextField textDisplay;
	
	
	@FXML
	private Button one;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button four;
	@FXML
	private Button five;
	@FXML
	private Button six;
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	@FXML
	private Button nine;
	@FXML
	private Button o;
	@FXML
	private Button point;
	
	@FXML
	private Button clean;
	@FXML
	private Button operator1;
	@FXML
	private Button operator2;
	@FXML
	private Button division;
	@FXML
	private Button multipy;
	@FXML
	private Button substraction;
	@FXML
	private Button plus;
	@FXML
	private Button equal;
	
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

	@FXML
	private void handlerGeneralAction(ActionEvent e){
		generalOperator = ((Button)e.getSource()).getText();
		switch(generalOperator){
			case "C":
				decimalClick = 0;
				textDisplay.setText("");
				break;
			case "+/-":
				if( textDisplay.getText() != null ){
					Double result = Double.parseDouble(textDisplay.getText());
					result = result*(-1);
					textDisplay.setText(String.valueOf(result));
					break;
				}
				
			case "+":
				firstDouble = Double.parseDouble(String.valueOf(textDisplay.getText()));
				textDisplay.setText(textDisplay.getText() + "+");
				decimalClick = 0;
				break;
			case "-":
				firstDouble = Double.parseDouble(String.valueOf(textDisplay.getText()));
				textDisplay.setText(textDisplay.getText() + "-");
				decimalClick = 0;
				break;
			case "x":
				firstDouble = Double.parseDouble(String.valueOf(textDisplay.getText()));
				textDisplay.setText(textDisplay.getText() + "x");
				decimalClick = 0;
				break;
			case "/":
				firstDouble = Double.parseDouble(String.valueOf(textDisplay.getText()));
				textDisplay.setText(textDisplay.getText() + "/");
				decimalClick = 0;
				break;
			case "%":
				Double doubleDigit = Double.parseDouble(String.valueOf(textDisplay.getText()));
				doubleDigit = doubleDigit / 100;
				textDisplay.setText(String.valueOf(doubleDigit));
				decimalClick = 0;
				break;
			default:
			
			
		}
		
	}
	
	@FXML
	private void handlerDigitAction(ActionEvent e){
		String digit = ((Button)e.getSource()).getText();
		String oldDisplay = textDisplay.getText();
		textDisplay.setText(oldDisplay + digit);
		
	}
	
	@FXML
	private void handlerDecimalAction(ActionEvent e){
		if(decimalClick == 0){
			String decimal = ((Button)e.getSource()).getText();
			String oldDisplay = textDisplay.getText();
			textDisplay.setText(oldDisplay + decimal);
			decimalClick =1;
		}
	}
	
	@FXML
	private void handlerEqualAction(ActionEvent e){
		String original = textDisplay.getText();
		String second = null;
		
		Double secondDouble = 0.0;
		Double result = 0.0;
		textDisplay.setText("");
		
		switch(generalOperator){
			case "+":
				
				second = original.substring(original.indexOf("+")+1);
				secondDouble = Double.parseDouble(second);
				result = firstDouble + secondDouble;
				break;
			case "-":
				second = original.substring(original.indexOf("-")+1);
				System.out.println(second);
				secondDouble = Double.parseDouble(second);
				result = firstDouble - secondDouble;
				break;
			case "x":
				second = original.substring(original.indexOf("x")+1);
				secondDouble = Double.parseDouble(second);
				result = firstDouble * secondDouble;
				break;
			case "/":
				second = original.substring(original.indexOf("/")+1);
				secondDouble = Double.parseDouble(second);
				result = firstDouble / secondDouble;
				break;
			default:
		}
		
		String format = String.format("%.1f", result);
		textDisplay.setText(format);
	}

	@FXML
	private void changeDigitColor(ActionEvent e){
		JFXColorPicker p = (JFXColorPicker)e.getSource();
		one.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		two.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		three.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		four.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		five.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		six.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		seven.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		eight.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		nine.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		o.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		point.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
	}
	
	@FXML
	private void changeTopButtonColor(ActionEvent e){
		JFXColorPicker p = (JFXColorPicker)e.getSource();
		clean.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		operator1.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		operator2.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
	}
	
	@FXML
	private void changeOperatorColor(ActionEvent e){
		JFXColorPicker p = (JFXColorPicker)e.getSource();
		division.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		multipy.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		substraction.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		plus.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
		equal.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
	}
	
	@FXML
	private void changeDisplayColor(ActionEvent e){
		JFXColorPicker p = (JFXColorPicker)e.getSource();
		textDisplay.setStyle("-fx-background-color:#"+String.valueOf(p.getValue()).substring(2, 8)+";");
	}
	
	
}
