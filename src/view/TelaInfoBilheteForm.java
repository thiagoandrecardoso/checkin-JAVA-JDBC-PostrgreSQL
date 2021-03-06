package view;

import model.Bilhete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalTime;

public abstract class TelaInfoBilheteForm extends JFrame {
    public Bilhete bilhete;
    public JPanel jPanelCAbecalho;
    public JLabel jLabelCabecalho;
    public JPanel jPanelInfoBilhete;
    public JLabel jLabelOrigem;
    public JLabel jLabelDestino;
    public JLabel jLabelHoraPrevistaEmbarque;
    public JLabel jLabelHoraPrevistaPartida;
    public JLabel jLabelHoraRelogioParede;
    public JPanel jPanelPassageiro;
    public JTextField txtNome;
    public JTextField txtCpf;
    public JButton btnAtualizarDadosPessoais;
    public JButton btnProximo;

    public TelaInfoBilheteForm(Bilhete bilhete) {
        this.bilhete = bilhete;
        inicializar();
    }

    private void inicializar() {
        jPanelCAbecalho = getjPanelCAbecalhoForm();
        jPanelInfoBilhete = getBilheteForm();
        jPanelPassageiro = getPassageiroForm();
        event();
    }

    public abstract void btnProximo(ActionEvent e);

    public abstract void editPassageiro(ActionEvent ev);

    private void event() {
        btnProximo.addActionListener(this::btnProximo);
        btnAtualizarDadosPessoais.addActionListener(this::editPassageiro);
    }

    public JPanel getjPanelCAbecalhoForm() {
        if (jPanelCAbecalho == null) {
            jPanelCAbecalho = new JPanel();
            jLabelCabecalho = new JLabel("Informações da Linha:");
            jPanelCAbecalho.add(jLabelCabecalho);
        }
        return jPanelCAbecalho;
    }

    public JPanel getBilheteForm() {
        if (jPanelInfoBilhete == null) {
            jPanelInfoBilhete = new JPanel(new GridLayout(5, 1, 10, 10));
            jLabelOrigem = new JLabel("Origem: " + bilhete.getLinha().getOrigem());
            jLabelDestino = new JLabel("Destino: " + bilhete.getLinha().getDestino());
            jLabelHoraPrevistaEmbarque = new JLabel("Hora prevista do embarque: " + bilhete.getLinha().getHora_embarque());
            jLabelHoraPrevistaPartida = new JLabel("Hora prevista da partida: " + bilhete.getLinha().getHora_partida());
            jLabelHoraRelogioParede = new JLabel("Hora atual: " + LocalTime.now());

            jPanelInfoBilhete.add(jLabelOrigem);
            jPanelInfoBilhete.add(jLabelDestino);
            jPanelInfoBilhete.add(jLabelHoraPrevistaEmbarque);
            jPanelInfoBilhete.add(jLabelHoraPrevistaPartida);
            jPanelInfoBilhete.add(jLabelHoraRelogioParede);

            jPanelInfoBilhete.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 0));
        }
        return jPanelInfoBilhete;
    }

    public JPanel getPassageiroForm() {
        if (jPanelPassageiro == null) {
            jPanelPassageiro = new JPanel(new GridLayout(2, 2, 10, 5));
            txtNome = new JTextField(bilhete.getPassageiro().getNome());
            txtNome.setEditable(false);
            txtCpf = new JTextField(bilhete.getPassageiro().getCpf());
            txtCpf.setEditable(false);
            btnAtualizarDadosPessoais = new JButton("Editar");
            btnProximo = new JButton("Próximo");

            jPanelPassageiro.add(txtNome);
            jPanelPassageiro.add(txtCpf);
            jPanelPassageiro.add(btnAtualizarDadosPessoais);
            jPanelPassageiro.add(btnProximo);

            jPanelPassageiro.setBorder(BorderFactory.createEmptyBorder(0, 20, 10, 20));
        }
        return jPanelPassageiro;
    }
}
