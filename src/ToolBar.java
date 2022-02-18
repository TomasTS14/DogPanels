import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {


    JButton aceptarBoton;
    JButton cancelarBoton;
    StringListener textListener;

    public ToolBar() {

        aceptarBoton = new JButton("Aceptar");
        cancelarBoton = new JButton("Cancelar");

        add(aceptarBoton);
        add(cancelarBoton);

        aceptarBoton.addActionListener(this);
        cancelarBoton.addActionListener(this);

    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(clicked == aceptarBoton){
            if(textListener != null){
               textListener.textEmitted("");
            }
        }else if (clicked == cancelarBoton){
           if(textListener != null){
               textListener.textEmitted("");
           }
        }
    }
}
