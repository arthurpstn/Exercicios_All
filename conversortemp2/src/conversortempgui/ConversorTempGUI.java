package conversortempgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTempGUI {
    public static void main (String[] args){
        JFrame janela = new JFrame("Conversor de Temperaturas");
        janela.setSize(600, 600);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
                
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 3)); 
        
        JTextField campoTemp = new JTextField();
        painel.add(new JLabel("Digite a temperatura: "));
        painel.add(campoTemp);
        
        JLabel campoText = new JLabel();
        painel.add(campoText);
        
        
        String[] opcoes = {
            "Celsius para Fahrenheit",
            "Fahrenheit para Celsius",
            "Celsius para Kelvin",
            "Kelvin para Celsius",
            "Fahrenheit para Kelvin",
            "Kelvin para Fahrenheit",
        };
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        painel.add(comboBox);

        JButton convertButton = new JButton("Converter");
        painel.add(convertButton);

        JLabel result = new JLabel("Resultado:");
        result.setHorizontalAlignment(SwingConstants.CENTER);
        painel.add(result);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    double temp = Double.parseDouble(campoTemp.getText());
                    String opcao = (String) comboBox.getSelectedItem();
                    double resultado = 0;
                    switch (opcao){
                        case "Celsius para Fahrenheit":
                        resultado = (temp * 9/5) + 32;
                        result.setText("Resultado: " + resultado + "F");
                        break;
                        case "Fahrenheit para Celsius":
                        resultado = (temp - 32) * 5/9;
                        result.setText("Resultado: " + resultado + "C");
                        break;
                        case "Celsius para Kelvin":
                        resultado = temp + 273;
                        result.setText("Resultado: " + resultado + "K");
                        break;
                        case "Kelvin para Celsius":
                        resultado = temp - 273;
                        result.setText("Resultado: " + resultado + "C");
                        break;
                        case "Fahrenheit para Kelvin":
                        resultado = (temp - 32) * 5/9 + 273;
                        result.setText("Resultado: " + resultado + "K");
                        break;
                        case "Kelvin para Fahrenheit":
                        resultado = (temp - 273) * 9/5 + 32;
                        result.setText("Resultado: " + resultado + "F");
                        break;
                        default:
                        result.setText("opcao invalida! ");
                        break;  
                    }}
                catch (NumberFormatException ex) {
                    result.setText("Digite numero valido!");
                }
            }
        });
        janela.add(painel);
        janela.setVisible(true);
                }
                }
