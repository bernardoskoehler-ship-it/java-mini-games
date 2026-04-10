import java.util.Random;
import java.util.Scanner;

public class Jogo{
    private final Scanner scanner = new Scanner(System.in);
    private final Random rand = new Random();

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
        while (true) {
            System.out.println(jogador.getNome() + " marque uma posição!");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();
            if (!posicaoValida(linha, coluna)) {
                System.out.println("Posicao invalida!");
                continue;
            }
            if (!posicaoLivre(linha, coluna)) {
                System.out.println("Posicao ocupada!");
                continue;
            }
            grade[linha][coluna] = jogador.getSimbolo();
            break;
        }
    }

    private void jogarCPU(CPU cpu) {
        int linha;
        int coluna;

        do {
            linha = rand.nextInt(3);
            coluna = rand.nextInt(3);
        } while (!posicaoLivre(linha, coluna));

        grade[linha][coluna] = cpu.getSimbolo();
        System.out.println("CPU marcou em: " + linha + " " + coluna);
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
        while(!cv.vitoria(this) && !cv.empate(this)) {
            executarAcao(j1);
            mostrarGrade();
            if(!cv.vitoria(this) && !cv.empate(this)) {
                executarAcao(j2);
                mostrarGrade();
            }
        }
        if(cv.empate(this)) {
            System.out.println("Empate no Idosas Game!");
            return;
        }
        String nomeVencedor;
        if(j1.getSimbolo() == cv.mostrarVencedor()) {
            nomeVencedor = j1.getNome();
        }else {
            nomeVencedor = j2.getNome();
        }

        System.out.println(nomeVencedor +" venceu o Idosas Game!");
    }
    public void iniciarJogoCPU(Jogador j1, CPU cpu) {
        CondicaoDeVitoria cv = new CondicaoDeVitoria();
        System.out.println("Esta começando o Idosas Games, Contra a CPU!");

        while (!cv.vitoria(this) && !cv.empate(this)) {
            executarAcao(j1);
            mostrarGrade();

            if (!cv.vitoria(this) && !cv.empate(this)) {
                jogarCPU(cpu);
                mostrarGrade();
            }
        }
        if(cv.empate(this)) {
            System.out.println("Empate no Idosas Game!");
            return;
        }
        String nomeVencedor;
        if(j1.getSimbolo() == cv.mostrarVencedor()) {
            nomeVencedor = j1.getNome();
        }else {
            nomeVencedor = cpu.getNome();
        }

        System.out.println(nomeVencedor +" venceu o Idosas Game!");
    }
}
