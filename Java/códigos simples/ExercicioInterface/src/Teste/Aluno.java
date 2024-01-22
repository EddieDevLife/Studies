package Teste;

import javax.swing.*;

import static java.lang.Float.parseFloat;
import static javax.swing.JOptionPane.*;

public class Aluno implements Nota {


    @Override
    public void imprimeNota() {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("digite a nota do aluno: "));


        if (nota > 6) {
            JOptionPane.showMessageDialog(null,"Parabéns, você atingiu todos os indicadores de avaliação com excelência");
        } else if (nota == 6) {
            JOptionPane.showMessageDialog(null,"Parabéns, você obteve aproveitamento satisfatório nos indicadores de avaliação");
        } else {
            JOptionPane.showMessageDialog(null,"Você não atingiu o mínimo esperado para aprovação");
        }

    }
}
