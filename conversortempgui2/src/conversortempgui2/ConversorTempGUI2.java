package conversortempgui2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTempGUI2 extends JFrame {

    public ConversorTempGUI2() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Conversor de Temperaturas");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JTextField campoTemperatura = new JTextField();
        add(campoTemperatura);

        String[] opcoes = {
            "Celsius para Fahrenheit",
            "Fahrenheit para Celsius",
            "Celsius para Kelvin",
            "Kelvin para Celsius",
            "Fahrenheit para Kelvin",
            "Kelvin para Fahrenheit"
        };
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        add(comboBox);


        JButton botaoConverter = new JButton("Converter");
        add(botaoConverter);
        JLabel labelResultado = new JLabel("Resultado: ");
        add(labelResultado);


        botaoConverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double temp = Double.parseDouble(campoTemperatura.getText());
                    String escolha = (String) comboBox.getSelectedItem();
                    double resultado = 0;

                    switch (escolha) {
                        case "Celsius para Fahrenheit":
                            resultado = (temp * 9/5) + 32;
                            break;
                        case "Fahrenheit para Celsius":
                            resultado = (temp - 32) * 5/9;
                            break;
                        case "Celsius para Kelvin":
                            resultado = temp + 273.15;
                            break;
                        case "Kelvin para Celsius":
                            resultado = temp - 273.15;
                            break;
                        case "Fahrenheit para Kelvin":
                            resultado = (temp - 32) * 5/9 + 273.15;
                            break;
                        case "Kelvin para Fahrenheit":
                            resultado = (temp - 273.15) * 9/5 + 32;
                            break;
                    }

                    labelResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Digite um número válido.");
                }
            }
        });

        setVisible(true);
    }

    // Método para iniciar o programa
    public static void main(String[] args) {
        new ConversorTempGUI2();
    }
}
