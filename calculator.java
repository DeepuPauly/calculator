import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.module.ModuleDescriptor.Builder;
import java.util.concurrent.BlockingQueue;

import javax.lang.model.util.ElementScanner6;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.multi.MultiButtonUI;


public class calculator implements ActionListener{

boolean isOperatorClicked=false;    
String oldValue;
JFrame jf;
JLabel displyJLabel;
JButton sevenButton;
JButton eightButton;
JButton nineButton;
JButton sixButton;
JButton fiveButton;
JButton fourButton;
JButton oneButton;
JButton twoButton;
JButton threeButton;
JButton zeroButton;
JButton dotButton;
JButton equalButton;
JButton divButton;
JButton multiButton;
JButton subButton;
JButton addButton;
JButton clearButton;
float result;





    public calculator() {
        JFrame jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(600,  600);
        jf.setLocation(100, 100);

        displyJLabel=new JLabel(  );
        displyJLabel.setBounds(30, 50, 380, 70);
        displyJLabel.setBackground(Color.gray);
        displyJLabel.setOpaque(true);
        displyJLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displyJLabel.setForeground(Color.white) ;
        jf.add(displyJLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.addActionListener(this);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(eightButton);

        
        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(nineButton);

        sixButton=new JButton("6");
        sixButton.setBounds(30, 230, 80, 80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(sixButton);


        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(fiveButton);

        
        fourButton=new JButton("4");
        fourButton.setBounds(230, 230, 80, 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(fourButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(twoButton);

        
        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(threeButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(30, 430, 80, 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(zeroButton);

        dotButton=new JButton(".");
        dotButton.setBounds(130, 430, 80, 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(dotButton);

        
        equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(equalButton);
      
        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(divButton);

        
        multiButton=new JButton("*");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.addActionListener(this);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(multiButton);

        
        subButton=new JButton("-");
        subButton.setBounds(330, 330, 80, 80);
        subButton.addActionListener(this);
        subButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(subButton);

        addButton=new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        addButton.addActionListener(this);
        addButton.setFont(new Font("Arial", Font.PLAIN, 50));
        jf.add(addButton);

        clearButton=new JButton("clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 20));
        jf.add(clearButton);



        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
public static void main(String[] args) {
    new calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
    if(e.getSource()==sevenButton){
        if(isOperatorClicked){
            displyJLabel.setText("7");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"7");
        }
   
} else if(e.getSource()==eightButton){
     if(isOperatorClicked){
            displyJLabel.setText("8");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"8");
        }
    
} else if(e.getSource()==nineButton){
     if(isOperatorClicked){
            displyJLabel.setText("9");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"9");
        }
   
} else if(e.getSource()==sixButton){
     if(isOperatorClicked){
            displyJLabel.setText("6");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"6");
        }
    
} else if(e.getSource()==fiveButton){
     if(isOperatorClicked){
            displyJLabel.setText("5");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"5");
        }
} else if(e.getSource()==fourButton){
     if(isOperatorClicked){
            displyJLabel.setText("4");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"4");
        }
} else if(e.getSource()==oneButton){
     if(isOperatorClicked){
            displyJLabel.setText("1");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"1");
        }
} else if(e.getSource()==twoButton){
     if(isOperatorClicked){
            displyJLabel.setText("2");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"2");
        }
} else if(e.getSource()==threeButton){
     if(isOperatorClicked){
            displyJLabel.setText("3");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"3");
        }
} else if(e.getSource()==zeroButton){
     if(isOperatorClicked){
            displyJLabel.setText("0");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+"0");
        }
} else if(e.getSource()==dotButton){
     if(isOperatorClicked){
            displyJLabel.setText(".");
            isOperatorClicked=false;
        }else {
             displyJLabel.setText(displyJLabel.getText()+".");
        }
}  else if(e.getSource()==equalButton){
    String newValue=displyJLabel.getText();
    float oldValueF=Float.parseFloat(oldValue);
    float newValueF=Float.parseFloat(newValue);
    switch(result){
        case addButton:
        Float result=newValueF+oldValueF;
        break;
        case multiButton:
        result=newValueF*oldValueF;
        break;
        case divButton:
        result=newValueF/oldValueF;
        break;
        case multiButton:
        result=newValueF*oldValueF;
        break;
        case subButton:
        result=newValueF-oldValueF;
        break;
        default:
        
    }
    displyJLabel.setText(result+"");
   
} else if(e.getSource()==addButton){
    isOperatorClicked=true;
    oldValue=displyJLabel.getText();

} else if(e.getSource()==multiButton){
      isOperatorClicked=true;
    oldValue=displyJLabel.getText();


} else if(e.getSource()==divButton){
      isOperatorClicked=true;
    oldValue=displyJLabel.getText();


} else if(e.getSource()==dotButton){
      isOperatorClicked=true;
    oldValue=displyJLabel.getText();


} else if(e.getSource()==subButton){

      isOperatorClicked=true;
    oldValue=displyJLabel.getText();

} else if(e.getSource()==clearButton){
    displyJLabel.setText("");
}


}

}