import javax.swing.*;

public class Sistema {
    private String login = "Mayla", senha = "abc123";
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        JFrame frame = new LoginView(sistema);
        frame.setVisible(true);
    }

    public boolean efetuarLogin(String login, String senha){
        System.out.println("loguuuei");
        return login.equals(this.login) && senha.equals(this.senha);
    }

}
