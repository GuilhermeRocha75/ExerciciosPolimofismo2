/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno.saolucas
 */
import javax.swing.JOptionPane;

public class FormaGeometricaDAO {

    public void imprimirArea(FormaGeometricaDTO formaDTO) {
        double area = 0;

        switch (formaDTO.getTipoForma().toLowerCase()) {
            case "circulo":
                area = Math.PI * Math.pow(formaDTO.getMedida1(), 2);
                break;
            case "retangulo":
                area = formaDTO.getMedida1() * formaDTO.getMedida2();
                break;
            case "triangulo":
                area = (formaDTO.getMedida1() * formaDTO.getMedida2()) / 2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Forma geométrica desconhecida!");
                return;
        }

        JOptionPane.showMessageDialog(null, "Área do " + formaDTO.getTipoForma() + ": " + area);
    }
}

