import javax.swing.*;

public class ExceptionCustumizada_2 {
    public static void main(String[] args) {
        int[] numerador = {3, 5, 7, 8};
        int[] denominador = {1, 5, 7, 4, 10};

        try {
            if (numerador[0] % 2 != 0)
                throw new DivisaoNaoExataException("Divisão inválida! Aceitamos apenas numeros inteiros! ", numerador[0], denominador[0]);

            int resultado = numerador[0] / denominador[0];
            System.out.println(resultado);
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (numerador[1] % 2 != 0)
                throw new DivisaoNaoExataException("Divisão inválida! Aceitamos apenas numeros inteiros! ", numerador[1], denominador[1]);

            int resultado = numerador[1] / denominador[1];
            System.out.println(resultado);
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (numerador[2] % 2 != 0)
                throw new DivisaoNaoExataException("Divisão inválida! Aceitamos apenas numeros inteiros! ", numerador[2], denominador[2]);

            int resultado = numerador[2] / denominador[2];
            System.out.println(resultado);
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (numerador[3] % 2 != 0)
                throw new DivisaoNaoExataException("Divisão inválida! Aceitamos apenas numeros inteiros! ", numerador[3], denominador[3]);

            int resultado = numerador[3] / denominador[3];
            System.out.println(resultado);
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        try {
            if (numerador[4] % 2 != 0)
                throw new DivisaoNaoExataException("Divisão inválida! Aceitamos apenas numeros inteiros! ", numerador[4], denominador[4]);

            int resultado = numerador[4] / denominador[4];
            System.out.println(resultado);
        } catch (DivisaoNaoExataException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.out.println("O programa continua...");
    }
}


