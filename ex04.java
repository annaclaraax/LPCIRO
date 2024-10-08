//Agregação
class Carro {
    private String marca;
    private String nome;
    public Carro(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    protected String nomeCompleto() {
        return marca + " " + nome;
    }
    public void andar() {
        System.out.println("O carro " + nomeCompleto() + " está andando");
    }
}
class Bomba {
    private String combustivel;
    private Carro carroAbastecendo;
    public Bomba(String combustivel) {
        this.combustivel = combustivel;
    }
    public void abastecer(Carro carro) {
        this.carroAbastecendo = carro;
        System.out.println("O " + carro.getClass().getSimpleName() + " " + carro.nomeCompleto() + " está sendo abastecido com " + this.combustivel);
    }
    public boolean estaDisponivel() {
        return this.carroAbastecendo == null;
    }
}
public class App {
    public static void main(String[] args) {
        Bomba bomba = new Bomba("Gasolina");
        bomba.abastecer(new Carro("Fiat", "Gol")); // O Carro Fiat Gol está sendo abastecido com Gasolina
    }
}
