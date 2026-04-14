public class Chave extends Itens{
    Chave() {
        super("Chave", 2);
    }

    public void serPegoPorPersonagem(Mapa mapa, Personagem personagem) {
        int linha = mapa.getLinha(simbolo);
        int coluna = mapa.getColuna(simbolo);
        if(mapa.mapa[linha][coluna] != 2) {
            return;
        }
        if(mapa.mapa[linha + 1][coluna] == 1 || mapa.mapa[linha - 1][coluna] == 1 || mapa.mapa[linha][coluna + 1] == 1 || mapa.mapa[linha][coluna - 1] == 1) {
            System.out.println("Pegue a chave: digite E");
            String opcao = c.input();
            if(opcao.equals("E") || opcao.equals("e")) {
                adicionarNoInventario(personagem);
                apagarItemDoMapa(mapa);
                return;
            }
        }
    }
}
