package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    public int lado;
    public int altura;

    public Grade(int x, int y){
        this.lado = x;
        this.altura = y;
    }

    public void desenhar(Draw tabuleiro){

        int numero = 0;
        char letra = 65;

        for(int i = this.lado; i < this.lado + 400; i += 40, numero++){
            for(int j = this.altura; j < this.altura + 400; j += 40, letra++) {

                if (j == this.altura) {
                    tabuleiro.setPenColor(Color.MAGENTA);
                    tabuleiro.text(i, this.altura - 40, Integer.toString(numero));
                }

                if (i == this.lado) {
                    tabuleiro.setPenColor(Color.MAGENTA);
                    tabuleiro.text(this.lado - 40, j, Character.toString(letra));
                }

                tabuleiro.setPenColor(Color.BLACK);
                tabuleiro.square(i, j, 20);
            }
        }
    }
}