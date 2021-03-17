
package classes;

import javax.swing.JButton;

public class ClasseFinal {
    
    protected final String nome;
    protected final int idade;
    protected final JButton botao = new JButton ("rotulo do botao");
    protected final int[] vetor;
    protected final int i;
    
    public ClasseFinal(){
        idade = 20;
        nome = "Classe final";
        vetor = new int [100];
        i = 0;
    }
//    public ClasseFinal(int id, String nm, int tamanho){
//        i = id;
//        nome = nm;
//        vetor = new int[tamanho];
//    }
    
    public final void imprime(final int posicao){
        System.out.println(vetor[posicao]);
    }
    
    public final void inicializa(){
        for (int w = 0; w < vetor.length; w++) {
            vetor[w] = w * 9;
        }
        botao.setText("novo rotulo do botao");
                
    }
    
}

