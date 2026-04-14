abstract class Itens {
    Controle c = new Controle();

    String nome;
    int simbolo;

    Itens(String nome, int simbolo) {
        setNome(nome);
        setSimbolo(simbolo);
    }


    protected void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    protected void setSimbolo(int simbolo) {
        this.simbolo = simbolo;
    }

    protected void adicionarNoInventario(Personagem personagem) {
        personagem.inventario.put(nome, this);
    }
    protected void removerDoInventario(Personagem personagem) {
        if(!personagem.inventario.containsKey(nome)) {
            System.out.println("Nao possui o item");
            return;
        }
        personagem.inventario.remove(nome);
    }
    protected void apagarItemDoMapa(Mapa mapa) {
        int linha = mapa.getLinha(simbolo);
        int coluna = mapa.getColuna(simbolo);
        mapa.mapa[linha][coluna] = 0;
    }
    protected void adicionarItemNoMapa(Mapa mapa, int linha, int coluna) {
        if(!mapa.espacoDisponivel(linha, coluna)) {
            System.out.println("Espaco ocupado!");
            return;
        }
        mapa.mapa[linha][coluna] = simbolo;
    }
}
