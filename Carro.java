public class Carro {
  // Propriedades do carro
  private String marca;
  private String modelo;
  private int ano;

  // Construtor da classe Carro
  public Carro(String marca, String modelo, int ano) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
  }

  // Método para exibir os detalhes do carro
  public void exibirDetalhes() {
      System.out.println("Carro: " + marca + " " + modelo + ", Ano: " + ano);
  }

  // Método principal para testar a classe
  public static void main(String[] args) {
      Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
      meuCarro.exibirDetalhes();
  }
}
