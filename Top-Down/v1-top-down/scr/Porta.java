public class Porta extends Itens{
    Porta() {
        super("Porta", 4);
    }
    public void destrancar(Mapa mapa, Personagem personagem) {
        int linha = mapa.getLinha(simbolo);
        int coluna = mapa.getColuna(simbolo);
        if(mapa.mapa[linha][coluna] != 4) {
            return;
        }
        if(mapa.mapa[linha + 1][coluna] == 1 && personagem.inventario.containsKey("Chave")) {
            System.out.println("Abra a porta: aperte E");
            String opcao = c.input();
            if(opcao.equals("E") || opcao.equals("e")) {
                apagarItemDoMapa(mapa);
                return;
            }
        }
    }
}
