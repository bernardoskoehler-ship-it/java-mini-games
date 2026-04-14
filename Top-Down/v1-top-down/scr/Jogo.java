public class Jogo {
    Mapa mapa = new Mapa();
    Personagem personagem = new Personagem();

    Chave chave = new Chave();
    Porta porta = new Porta();
    Parede parede = new Parede();

    public void contruirMapa() {
        chave.adicionarItemNoMapa(mapa, 5, 5);
        porta.adicionarItemNoMapa(mapa, 2, 1);

        parede.adicionarItemNoMapa(mapa, 2, 0);
        parede.adicionarItemNoMapa(mapa, 2, 2);
        parede.adicionarItemNoMapa(mapa, 2, 3);
        parede.adicionarItemNoMapa(mapa, 2, 4);
        parede.adicionarItemNoMapa(mapa, 2, 5);
        parede.adicionarItemNoMapa(mapa, 2, 6);

        mapa.mapa[4][3] = 1;
    }

    public void iniciarJogo() {
        while(true) {
            mapa.mostrarMapa();
            chave.serPegoPorPersonagem(mapa, personagem);
            porta.destrancar(mapa, personagem);
            personagem.andar(mapa);
        }
    }
}
