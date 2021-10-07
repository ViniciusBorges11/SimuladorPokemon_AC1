package pokemon_ac1;

public class Pokemons {

    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque1;
    private int ataque2;

    public Pokemons(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        atributos();
        calculaBonus();
        imprimepokemon();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;

    }

    public int getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    private void imprimepokemon() {
        System.out.println("Nome: " + nome + " | "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque1: " + ataque1 + " | "
                + "Ataque2: " + ataque2 + " | "
        );
    }

    private void atributos() {
        switch (this.tipo) {
            case "Fogo":
                this.vida = 130;
                this.ataque1 = 75;
                this.ataque2 = 60;
                break;

            case "Agua":
                this.vida = 120;
                this.ataque1 = 80;
                this.ataque2 = 50;
                break;

            case "Grama":
                this.vida = 150;
                this.ataque1 = 80;
                this.ataque2 = 60;
                break;

            case "Eletrico":
                this.vida = 110;
                this.ataque1 = 90;
                this.ataque2 = 55;
                break;
        }
    }

    private void calculaBonus() {

        vida = vida + (level / 2);
        ataque1 = ataque1 + (level / 3);
        ataque2 = ataque2 + (level / 3);
    }
}
