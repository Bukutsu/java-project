import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends JFrame implements ActionListener{
	private JPanel outputPanel;
    private JPanel calculatorPanel;
    private JLabel displayLabel;
    private JTextField resultField;

    private boolean operatorPressed = false;
    private boolean num2Entered = false;

    private String num1 = "";
    private String num2 = "";

    private String currentOperator = "";

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        String input = resultField.getText();

        if("1234567890".contains(command)){
            if(operatorPressed && num2Entered){
                updateResultDisplay(input + command);
                num2 += command;
            }
            else if(operatorPressed){
                updateResultDisplay(command);
                updateExpressionDisplay(num1 + currentOperator);
                num2 = command;
                num2Entered = true;
            }
            else if(input.equals("0")){
                updateResultDisplay(command);   
                updateExpressionDisplay("");
                num1 += command;
            }
            else{
                updateResultDisplay(input + command);
                num1 += command;
            }
        }
        else if(".".contains(command)){
            if(!num2Entered && !input.contains(".")){
                updateResultDisplay(input + command);
                num1 += command;
            }else if(operatorPressed && !input.contains(".")){
                updateResultDisplay(input + command);
                num2 += command;
            }
        }
        else if("<".contains(command)){
            
            if(num2Entered){
                if(input.length() == 1){
                    num2 = "";
                    updateResultDisplay("0");
                }
                else{
                    num2 = num2.substring(0,num2.length() - 1);
                    updateResultDisplay(num2);
                }  
            }else{
                if(input.length() == 1){
                    num1 = "";
                    updateResultDisplay("0");
                }
                else{
                    num1 = num1.substring(0,num1.length() - 1);
                    updateResultDisplay(num2);
                }  
            }           
        }
        else if("C".contains(command)){
            updateResultDisplay("0");
            updateExpressionDisplay("");
            currentOperator = "";
            operatorPressed = false;
            resetNum();
            num2Entered = false;
        }
        else if("CE".contains(command)){
            updateResultDisplay("0");
            if(currentOperator.equals("")){
                updateExpressionDisplay(num1);
            }else{
                updateExpressionDisplay(num1 + currentOperator);
            }
            num2 = "";
            num2Entered = false;

        }
        else if("+-*/".contains(command)){
            if(num1.equals(".")){
                num1 = "0";
            }
            num1 = String.valueOf(Double.parseDouble(num1));

            if(Double.parseDouble(num1) % 1 == 0){
                num1 = String.valueOf((int)Double.parseDouble(num1));
                updateResultDisplay(num1);
            }
            if(num1.equals("") || input.equals(".")){
                num1 = "0";
                updateExpressionDisplay(num1 + command); 
            }
            else if(!num2Entered){
                num2 = num1;
                updateExpressionDisplay(num1 + command);
            }
            else if(!num2.equals("")){
                calulateStringAndDisplay();
                updateExpressionDisplay(num1 + command);
            }
            currentOperator = command;
            operatorPressed = true; 
        }

        else if("=".contains(command)){
            try{
                if(Double.parseDouble(num1) % 1 == 0){
                    num1 = String.valueOf((int)Double.parseDouble(num1));
                    updateResultDisplay(num1);
                }
    
                if(num2.equals("")){
                    updateExpressionDisplay(num1 + "=");
                }
                else{
                    updateExpressionDisplay(num1 + currentOperator + num2);
                    calulateStringAndDisplay();
                }
            }catch(Exception ex){

            }


        }
        else if("%".contains(command)){
            String result;
            if(operatorPressed && num2Entered){
                if(currentOperator.equals("*") || currentOperator.equals("/")){
                    result = String.valueOf(Double.parseDouble(num2)/100);
                }else{
                    result = String.valueOf(Double.parseDouble(num1) * Double.parseDouble(num2)/100);
                }
                updateExpressionDisplay(String.valueOf(Double.parseDouble(num1)) + currentOperator + result);
                updateResultDisplay(result);
                num2 = result;
            }
            else if(num1.equals("")){
                num1 = "0";
            }
            else{
                result = String.valueOf(Double.parseDouble(num1)/100);
                updateExpressionDisplay(result);
                updateResultDisplay(result);
                num1 = result;
            }
        }
        else if("√x".contains(command)){
            if(operatorPressed && num2Entered){
                String result = String.valueOf(Math.sqrt(Double.parseDouble(num2)));
                updateExpressionDisplay(String.valueOf(Double.parseDouble(num1)) + currentOperator + "√" + num2);
                updateResultDisplay(result);
                num2 = result;
            }
            else if(num1.equals("")){
                num1 = "0";
            }
            else{
                String result = String.valueOf(Math.sqrt(Double.parseDouble(num1)));
                updateExpressionDisplay("√" + String.valueOf(Double.parseDouble(num1)));
                updateResultDisplay(result);
                num1 = result;
            }
        }
        else if("x²".contains(command)){
            if(operatorPressed && num2Entered){
                String result = String.valueOf(Math.pow(Double.parseDouble(num2),2));
                updateExpressionDisplay(num1 + currentOperator + num2 + "²");
                updateResultDisplay(result);
                num2 = result;
            }
            else if(num1.equals("")){
                num1 = "0";
            }
            else{
                String result = String.valueOf(Math.pow(Double.parseDouble(num1),2));
                updateExpressionDisplay(String.valueOf(Double.parseDouble(num1)) + "²");
                updateResultDisplay(result);
                num1 = result; 
            }  
        }
        else if("1/x".contains(command)){
            if(operatorPressed && num2Entered){
                String result = String.valueOf(1/Double.parseDouble(num2));
                updateExpressionDisplay(num1 + currentOperator + "1/" + num2);
                updateResultDisplay(result);
                num2 = result;
            }
            else if(num1.equals("")){
                num1 = "0";
            }
            else{
                String result = String.valueOf(1/Double.parseDouble(num1));
                updateExpressionDisplay("1/" + String.valueOf(Double.parseDouble(num1)));
                updateResultDisplay(result);
                num1 = result;
            }  
        }
        else if("+/-".contains(command)){
            if(!num2Entered){
                if(num1.isEmpty()){
                    updateResultDisplay("0");
                }
                else if(Double.parseDouble(num1) > 0){
                    num1 = "-" + num1;
                    num1 = String.valueOf(Double.parseDouble(num1));
                    updateResultDisplay(num1);
                }
            }
            else{
                if(num2.isEmpty()){
                    updateResultDisplay("0");
                }
                else if(Double.parseDouble(num2) > 0){
                    num2 = "-" + num2;
                    num2 = String.valueOf(Double.parseDouble(num2));
                    updateResultDisplay(num2);
                }
            }
        }
    }

    public void resetNum(){
        num1 = "";
        num2 = "";
    }

    public void updateResultDisplay(String text){
        resultField.setText(text);
    }
    public void updateExpressionDisplay(String text){
        displayLabel.setText(text);
    }

    public double calculate(double x,double y,String operator){
        switch (operator) {
            case "+": return x + y;
            case "-": return x - y;   
            case "*": return x * y; 
            case "/": return x / y; 
            default: return 0;    
        }
    }

    public void calulateStringAndDisplay(){
        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);
        double numResult = calculate(operand1,operand2, currentOperator);
        String result;
        if(numResult % 1 == 0){
            result = String.valueOf((int)numResult);
        }else{
            result = String.format("%.6f", numResult);
        }
        
        updateResultDisplay(result);
        num2Entered = false;
        num1 = result;
    }

    public Calculator(String title){
        calculatorPanel = new JPanel();
        outputPanel = new JPanel();
        
        setTitle(title);
        setSize(300,400);
        GridLayout layout = new GridLayout(6,4);
        layout.setVgap(5);
        layout.setHgap(5);
        calculatorPanel.setLayout(layout);

        String[] buttons = {
            "%","C","CE","<",
            "1/x","x²","√x","/",
            "1","2","3","*",
            "4","5","6","-",
            "7","8","9","+",
            "+/-","0",".","="
        };

        for(String button : buttons){
            JButton jb = new JButton(button);
            calculatorPanel.add(jb);
            jb.addActionListener(this);
        }

        displayLabel = new JLabel("");
        displayLabel.setHorizontalAlignment(JTextField.RIGHT);
        displayLabel.setFont(new Font(null,0,16));;
       
        resultField = new JTextField("0");
        resultField.setEditable(false);
        resultField.setHorizontalAlignment(JTextField.RIGHT);
        resultField.setFont(new Font(null,0,24));;

        outputPanel.setBackground(Color.WHITE);
        outputPanel.setPreferredSize(new Dimension(150,50));
        outputPanel.setLayout(new GridLayout(2,1));
        outputPanel.add(displayLabel);
        outputPanel.add(resultField);

        calculatorPanel.setBackground(new Color(30,30,30));
        outputPanel.setBackground(new Color(188,189,188));
        resultField.setBackground(new Color(158, 162, 161));   
        add(outputPanel,BorderLayout.NORTH);
        add(calculatorPanel);
    }

    public static void main(String[] args) {
        Calculator frame = new Calculator("Bukutsu's The Most Advanced Calculator in the World ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch(Exception ignored){}
    }
}