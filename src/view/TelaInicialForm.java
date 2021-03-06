package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public abstract class TelaInicialForm extends JFrame {
    public JPanel jPanel;
    public JCheckBox cbCheckin;
    public JTextField txtCheckin;
    public JButton btnProximo;

    public TelaInicialForm() {
        this.inicializar();
    }

    private void inicializar() {
        this.setTitle("Checkin");
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(getForm(), BorderLayout.CENTER);
        this.setResizable(false);
        event();
    }

    public abstract void btnProximoLocalizaBilhete(ActionEvent ev);

    public abstract void adicionarEscutaCheckBox();

    public abstract void adicionaEscutaTxtCheckin();

    private void event() {
        btnProximo.addActionListener(this::btnProximoLocalizaBilhete);
        adicionarEscutaCheckBox();
        adicionaEscutaTxtCheckin();
    }

    public JPanel getForm() {
        if (jPanel == null) {
            jPanel = new JPanel(new GridLayout(3, 1));
            cbCheckin = new JCheckBox("Realizar Checkin", false);
            cbCheckin.setBounds(100, 150, 50, 50);
            jPanel.add(cbCheckin);
            txtCheckin = new JTextField();
            txtCheckin.setBounds(100, 150, 50, 50);
            txtCheckin.setEditable(false);
            jPanel.add(txtCheckin);
            btnProximo = new JButton("Próximo");
            jPanel.add(btnProximo);
        }
        return jPanel;
    }

}
