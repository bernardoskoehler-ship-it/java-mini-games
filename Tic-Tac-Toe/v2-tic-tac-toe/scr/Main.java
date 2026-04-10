public static void main(String[] args) {
    Jogo jogo = new Jogo();

    Jogador[] j = {
      new Jogador("Bernardo", 1),
      new Jogador("Leo", 2),
      new Jogador("CPU", 2)
    };

    //jogo.iniciarJogo(j[0], j[1]);
    jogo.iniciarJogoCPU(j[0], j[2]);
}
