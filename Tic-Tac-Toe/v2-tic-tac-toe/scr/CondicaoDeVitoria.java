public class CondicaoDeVitoria{

    private int vencedor;

    private boolean vColuna(Jogo jogo) {
        for (int coluna = 0; coluna < 3; coluna++) {
            int valor = jogo.getGrade(0, coluna);

            if (valor != 0 &&
                    valor == jogo.getGrade(1, coluna) &&
                    valor == jogo.getGrade(2, coluna)) {
                vencedor = valor;
                return true;
            }
        }
        return false;
    }

    private boolean vLinha(Jogo jogo) {
        for (int linha = 0; linha < 3; linha++) {
            int valor = jogo.getGrade(linha, 0);

            if (valor != 0 &&
                    valor == jogo.getGrade(linha, 1) &&
                    valor == jogo.getGrade(linha, 2)) {
                vencedor = valor;
                return true;
            }
        }
        return false;
    }

    private boolean vDiagonal(Jogo jogo) {
        int valorPrincipal = jogo.getGrade(0, 0);

        if (valorPrincipal != 0 &&
                valorPrincipal == jogo.getGrade(1, 1) &&
                valorPrincipal == jogo.getGrade(2, 2)) {
            vencedor = valorPrincipal;
            return true;
        }

        int valorSecundaria = jogo.getGrade(0, 2);

        if (valorSecundaria != 0 &&
                valorSecundaria == jogo.getGrade(1, 1) &&
                valorSecundaria == jogo.getGrade(2, 0)) {
            vencedor = valorSecundaria;
            return true;
        }

        return false;
    }

    private boolean deuEmpate(Jogo jogo) {
        int valor = 0;
        for(int linha = 0; linha < 3; linha ++) {
            for(int coluna = 0; coluna < 3; coluna ++) {
                if(jogo.getGrade(linha, coluna) != 0) {
                    valor ++;
                }
            }
        }
        return valor == 9;
    }
    public boolean empate(Jogo jogo) {
        return deuEmpate(jogo);
    }

    public boolean vitoria(Jogo jogo) {
        vencedor = 0;
        return vColuna(jogo) || vLinha(jogo) || vDiagonal(jogo);
    }
    public int mostrarVencedor() {
        return vencedor;
    }
}
