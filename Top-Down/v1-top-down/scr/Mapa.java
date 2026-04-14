public class Mapa {
    int[][] mapa = new int[7][7];


    public boolean valorValido(int linha, int coluna) {
        return linha >= 0 && linha < 7 && coluna >= 0 && coluna < 7;
    }
    public boolean espacoDisponivel(int linha, int coluna) {
        return mapa[linha][coluna] == 0;
    }

    public void mostrarMapa() {
        for (int linha = 0; linha < 7; linha++) {
            System.out.println(
                    mostrarSimbolo(mapa[linha][0]) +"   " +
                            mostrarSimbolo(mapa[linha][1])+"   " +
                            mostrarSimbolo(mapa[linha][2])+"   " +
                            mostrarSimbolo(mapa[linha][3])+"   " +
                            mostrarSimbolo(mapa[linha][4])+"   " +
                            mostrarSimbolo(mapa[linha][5])+"   " +
                            mostrarSimbolo(mapa[linha][6])+"   "
            );
        }
    }

    private String mostrarSimbolo(int numero) {
        if (numero == 1) return "X";
        if (numero == 2) return "y";
        if (numero == 3) return "=";
        if (numero == 4) return "0";
        return ".";
    }

    public int getLinha(int simbolo) {
        int posicaoLinha = 0;
        for (int linha = 0; linha < 7; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if(mapa[linha][coluna] == simbolo) {
                    posicaoLinha = linha;
                }
            }
        }
        return posicaoLinha;
    }
    public int getColuna(int simbolo) {
        int posicaoColuna = 0;
        for (int linha = 0; linha < 7; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                if(mapa[linha][coluna] == simbolo) {
                    posicaoColuna = coluna;
                }
            }
        }
        return posicaoColuna;
    }
}
