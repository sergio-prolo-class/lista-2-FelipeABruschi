package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    public void desenhar(Draw tabuleiro){

        int numero = 0;
        char letra = 65;

        for(int i = 60; i <= 420; i += 40, letra++){
            tabuleiro.text(20, i, Character.toString(letra));
            for(int j = 60; j <= 420; j += 40, numero++) {
                if(i == 60)
                    tabuleiro.text(j, 20, Integer.toString(numero));
                tabuleiro.square(i, j, 20);
            }
        }


    }
}
