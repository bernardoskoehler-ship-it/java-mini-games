import java.util.Scanner;

public class Jogo{
    Scanner scanner = new Scanner(System.in);

    private int[][] grade = new int[3][3];

    public int getGrade(int v1, int v2) {
        return grade[v1][v2];
    }

    public boolean posicaoValida(int linha, int coluna) {
        return linha >=0 && linha < 3 && coluna >= 0 && coluna < 3;
    }
    public boolean posicaoLivre(int linha, int coluna) {
        return grade[linha][coluna] == 0;
    }

    private void marcarPosicao(Jogador jogador) {
        while(true) {
            System.out.println(jogador.getNome() + " marque uma posição!");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if(!posicaoValida(linha, coluna)) {
                System.out.println("Posicao invalida!");
                continue;
            }
            if(!posicaoLivre(linha, coluna)) {
                System.out.println("Posicao ocupada!");
                continue;
            }

            grade[linha][coluna] = jogador.getSimbolo();
            break;
        }
    }
    public void executarAcao(Jogador jogador) {
        marcarPosicao(jogador);
    }

    public void mostrarGrade() {
        System.out.println("   0   1   2");
        System.out.println("0  " +getGrade(0,0) +" | " +getGrade(0,1) +" | " +getGrade(0,2));
        System.out.println("1  " +getGrade(1,0) +" | " +getGrade(1,1) +" | " +getGrade(1,2));
        System.out.println("2  " +getGrade(2,0) +" | " +getGrade(2,1) +" | " +getGrade(2,2));
    }

    public void iniciarJogo(Jogador j1, Jogador j2) {
        CondicaoDeVitoria cv = new CondicaoDeVitoria();
        System.out.println("Esta começando o Idosas Games!");
        while(!cv.vitoria(this)) {
            executarAcao(j1);
            mostrarGrade();
            if(!cv.vitoria(this)) {
                executarAcao(j2);
                mostrarGrade();
            }
        }

        String nomeVencedor;
        if(j1.getSimbolo() == cv.mostrarVencedor()) {
            nomeVencedor = j1.getNome();
        }else {
            nomeVencedor = j2.getNome();
        }

        System.out.println(nomeVencedor +" venceu o Idosas Game!");
    }
}
