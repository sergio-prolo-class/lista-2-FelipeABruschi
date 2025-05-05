package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Navio {

    private int tamanho;
    private int linha;
    private int coluna;
    private char orientacao;
    private Grade tabuleiro;

    public Navio(int tamanho, int linha, int coluna, char orientacao, Grade tabuleiro){
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.orientacao = orientacao;
        this.tabuleiro = tabuleiro;
    }

    public void desenhar(Draw tabuleiro) {

        for (int i = 0; i < tamanho; i++) {
            tabuleiro.setPenColor(Color.MAGENTA);
            int x, y;
            if(this.orientacao == 'h'){
                x = this.tabuleiro.lado + (this.coluna + i) * 40;
                y = this.tabuleiro.altura + this.linha * 40;
            }
            else{
                x = this.tabuleiro.lado + this.coluna * 40;
                y = this.tabuleiro.altura + (this.linha + i) * 40;
            }

            tabuleiro.filledSquare(x, y, 20);
            tabuleiro.setPenColor(Color.BLACK);
            tabuleiro.square(x, y, 20);
        }
    }
}
