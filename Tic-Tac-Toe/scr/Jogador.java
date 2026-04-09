public class Jogador {
    private String nome;
    private int simbolo;

    Jogador(String nome, int simbolo) {
        setNome(nome);
        setSimbolo(simbolo);
    }
    private void setNome(String nome) {
        if(nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        }
    }
    public String getNome() {
        return nome;
    }

    private void setSimbolo(int simbolo) {
        if(simbolo == 1 || simbolo == 2) {
            this.simbolo = simbolo;
        }
    }
    public int getSimbolo() {
        return simbolo;
    }
}
