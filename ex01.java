//definição de classe
class Carro {
    private String marca;
    private String nome;
    public Carro(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    public void andar() {
        System.out.println("O carro " + marca + " " + nome + " está andando");
    }
}

//Instanciamento de objetos
public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");

        // Irá exibir "O carro Toyota Corolla está andando".
        carro.andar();
    }
}
