package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Grade {
    private int lado;
    private int altura;

    public Grade(int x, int y){
        this.lado = x;
        this.altura = y;
    }

    public void desenhar(Draw tabuleiro){

        int numero = 0;
        char letra = 65;

        for(int i = this.lado; i < this.lado + 400; i += 40, letra++){
            tabuleiro.setPenColor(Color.MAGENTA);
            tabuleiro.text(this.lado - 40, i, Character.toString(letra));
            for(int j = this.altura; j < this.altura + 400; j += 40, numero++) {
                if(i == this.lado) {
                    tabuleiro.setPenColor(Color.MAGENTA);
                    tabuleiro.text(j, this.altura - 40, Integer.toString(numero));
                }
                tabuleiro.setPenColor(Color.BLACK);
                tabuleiro.square(i, j, 20);
            }
        }
    }
}