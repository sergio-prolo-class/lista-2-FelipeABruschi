package ifsc.poo;

import edu.princeton.cs.algs4.Draw;
import java.awt.*;

public class Navio {

    private int tamanho;
    private int linha;
    private int coluna;
    private char orientacao;
    private Grade tabuleiro;

    // Métodos construtor da classe Navio, com os parametros para inicializar um navio com valores em seus atributos
    public Navio(int tamanho, int linha, int coluna, char orientacao, Grade tabuleiro){
        this.tamanho = tamanho;
        this.linha = linha;
        this.coluna = coluna;
        this.orientacao = orientacao;
        this.tabuleiro = tabuleiro;
    }

    public void desenhar(Draw tabuleiro) {

        //Esse laço implementa um navio no tabuleiro, imprimindo um quadrado colorido
        //dentro da tabela para representar
        for (int i = 0; i < tamanho; i++) {
            tabuleiro.setPenColor(Color.MAGENTA);
            int x, y;
            //incrementa os valores na escala na horizontal e vertical
            if(this.orientacao == 'h'){ // navio impresso na horizontal
                x = this.tabuleiro.lado + (this.coluna + i) * 40;
                y = this.tabuleiro.altura + this.linha * 40;
            }
            else{ //navio impresso na vertical
                x = this.tabuleiro.lado + this.coluna * 40;
                y = this.tabuleiro.altura + (this.linha + i) * 40;
            }
            //imprime um quadrado colorido e depois faz seu contorno em preto
            tabuleiro.filledSquare(x, y, 20);
            tabuleiro.setPenColor(Color.BLACK);
            tabuleiro.square(x, y, 20);
        }
    }
}
