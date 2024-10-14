package Principal;

public class carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
        carro carro1 = new carro("Toyota", "Corolla", 2022, "Prata");
        carro carro2 = new carro("Ford", "Mustang", 2021, "Vermelho");

        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();
    }
}