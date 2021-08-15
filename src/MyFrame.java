import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
    
    MyFrame(){
            
        this.setVisible(true);
        this.setSize(420,420);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setTitle("Bom dia!"); 

        ImageIcon image = new ImageIcon("g.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(22,22,22));
    }
}

/*
private class TelaSwing extends javax.swing.JFrame{
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    private void btnClickActionPerformed(...){
        lblMensagem.setText("Olá, Mundo!");
    }
    
}*/

