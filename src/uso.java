import javax.swing.*;

public class uso {


    public static void main(String[] args) {


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame main= new MainFrame();
            }
        });
    }


}
