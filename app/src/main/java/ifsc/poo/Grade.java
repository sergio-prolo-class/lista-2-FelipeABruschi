package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class Grade {

    public void desenhar(Draw tabuleiro){
//        tabuleiro.rectangle(20, 20, 20, 20);
//        tabuleiro.rectangle(20, 40, 20, 20);

        for(int i = 40; i <= 400; i += 40)
            for(int j = 40; j <= 400; j += 40)
                tabuleiro.rectangle(i, j, 20, 20);
    }
}
