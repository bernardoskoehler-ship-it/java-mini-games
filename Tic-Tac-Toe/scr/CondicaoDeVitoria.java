public class CondicaoDeVitoria{

    int vencedor;

    private boolean vColuna(Jogo jogo) {
        if(jogo.getGrade(0, 0) == 1 && jogo.getGrade(1, 0) == 1 && jogo.getGrade(2, 0) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0,1) == 1 && jogo.getGrade(1, 1) == 1 && jogo.getGrade(2, 1) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0, 2) == 1 && jogo.getGrade(1, 2) == 1 && jogo.getGrade(2, 2) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0, 0) == 2 && jogo.getGrade(1, 0) == 2 && jogo.getGrade(2, 0) == 2) {
            vencedor = 2;
            return true;
        }
        if(jogo.getGrade(0,1) == 2 && jogo.getGrade(1, 1) == 2 && jogo.getGrade(2, 1) == 2) {
            vencedor = 2;
            return true;
        }
        if(jogo.getGrade(0, 2) == 2 && jogo.getGrade(1, 2) == 2 && jogo.getGrade(2, 2) == 2) {
            vencedor = 2;
            return true;
        }

        return false;
    }
    private boolean vLinha(Jogo jogo) {
        if(jogo.getGrade(0, 0) == 1 && jogo.getGrade(0, 1) == 1 && jogo.getGrade(0, 2) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(1,0) == 1 && jogo.getGrade(1, 1) == 1 && jogo.getGrade(1, 2) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(2, 0) == 1 && jogo.getGrade(2, 1) == 1 && jogo.getGrade(2, 2) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0, 0) == 2 && jogo.getGrade(0, 1) == 2 && jogo.getGrade(0, 2) == 2) {
            vencedor = 2;
            return true;
        }
        if(jogo.getGrade(1,0) == 2 && jogo.getGrade(1, 1) == 2 && jogo.getGrade(1, 2) == 2) {
            vencedor = 2;
            return true;
        }
        if(jogo.getGrade(2, 0) == 2 && jogo.getGrade(2, 1) == 2 && jogo.getGrade(2, 2) == 2) {
            vencedor = 2;
            return true;
        }
        return false;
    }
    private boolean vDiagonal(Jogo jogo) {
        if(jogo.getGrade(0,0) == 1 && jogo.getGrade(1, 1) == 1 && jogo.getGrade(2, 2) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0,2) == 1 && jogo.getGrade(1, 1) == 1 && jogo.getGrade(2, 0) == 1) {
            vencedor = 1;
            return true;
        }
        if(jogo.getGrade(0,0) == 2 && jogo.getGrade(1, 1) == 2 && jogo.getGrade(2, 2) == 2) {
            vencedor = 2;
            return true;
        }
        if(jogo.getGrade(0,2) == 2 && jogo.getGrade(1, 1) == 2 && jogo.getGrade(2, 0) == 2) {
            vencedor = 2;
            return true;
        }
        return false;
    }

    public boolean vitoria(Jogo jogo) {
        return vColuna(jogo) || vLinha(jogo) || vDiagonal(jogo);
    }
    public int mostrarVencedor() {
        return vencedor;
    }
}
