import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame{
    private JTextField loginTextField;
    private JTextField senhaTextField;
    private JButton btnLogar;
    private JPanel loginPanel;
    private JTextField textField1;
    private Sistema sistema;

    public LoginView(Sistema sistema) {
        super("Sua Dieta");

        this.sistema = sistema;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();

        btnLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.efetuarLogin(loginTextField.getText(), senhaTextField.getText());
            }
        });
    }


}
