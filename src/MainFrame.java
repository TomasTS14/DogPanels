import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    ToolBar toolBar;
    PanelDatos panel;

    public MainFrame(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLayout(new BorderLayout());
        toolBar = new ToolBar();
        panel = new PanelDatos();


        add(toolBar, BorderLayout.SOUTH);
        add(panel, BorderLayout.CENTER);

        toolBar.setStringListener(new StringListener() {

            @Override
            public void textEmitted(String text) {
                System.out.println(panel.getDatos());
            }
        });



    }


}

