import java.util.Map;
import java.util.HashMap;

public class Personagem {

    Controle controle = new Controle();
    Map<String, Itens> inventario = new HashMap<>();
    private int simbolo = 1;

    public void andar(Mapa mapa) {
        String direcao = controle.input();

        int linha = mapa.getLinha(simbolo);
        int coluna = mapa.getColuna(simbolo);

        if (direcao.equals("w")) {
            if (!mapa.valorValido(linha - 1, coluna) || !mapa.espacoDisponivel(linha - 1, coluna)) {
                System.out.println("Movimento invalido!");
                return;
            }
            mapa.mapa[linha - 1][coluna] = 1;
            mapa.mapa[linha][coluna] = 0;
            return;
        }
        if (direcao.equals("s")) {
            if (!mapa.valorValido(linha + 1, coluna) || !mapa.espacoDisponivel(linha + 1, coluna)) {
                System.out.println("Movimento invalido!");
                return;
            }
            mapa.mapa[linha + 1][coluna] = 1;
            mapa.mapa[linha][coluna] = 0;
            return;
        }
        if (direcao.equals("a")) {
            if (!mapa.valorValido(linha, coluna - 1) || !mapa.espacoDisponivel(linha, coluna - 1)) {
                System.out.println("Movimento invalido!");
                return;
            }
            mapa.mapa[linha][coluna - 1] = 1;
            mapa.mapa[linha][coluna] = 0;
            return;
        }
        if (direcao.equals("d")) {
            if ( !mapa.valorValido(linha, coluna + 1) || !mapa.espacoDisponivel(linha, coluna + 1)) {
                System.out.println("Movimento invalido!");
                return;
            }
            mapa.mapa[linha][coluna + 1] = 1;
            mapa.mapa[linha][coluna] = 0;
            return;
        }
    }


}
