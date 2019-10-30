package exercicio2;

public class Carro {
    private String modelo;
    private String cor;
    private String ano;
    private String marca;
    private String chassi;
    private Proprietario proprierario;
    private Double velocidademaxima;
    private Double velocidadeatual;
    private Double numeromarchas;
    private Double quantidadecombustivel;
    private int marchaatual = 0;
    private Double percorrido = 0D;

    public Carro(Proprietario proprierario, Double quantidadecombustivel) {
        this.proprierario = proprierario;
        this.quantidadecombustivel = quantidadecombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Double getVelocidademaxima() {
        return velocidademaxima;
    }

    public void setVelocidademaxima(Double velocidademaxima) {
        this.velocidademaxima = velocidademaxima;
    }

    public Double getVelocidadeatual() {
        return velocidadeatual;
    }

    public void setVelocidadeatual(Double velocidadeatual) {
        this.velocidadeatual = velocidadeatual;
    }

    public Double getNumeromarchas() {
        return numeromarchas;
    }

    public void setNumeromarchas(Double numeromarchas) {
        this.numeromarchas = numeromarchas;
    }

    public void acelerar() {
        if (velocidadeatual >= velocidademaxima) {
            System.out.println("Velocidade maxima altingida");
        } else velocidadeatual++;
        System.out.println("A velocidade atual subiu para: " + velocidadeatual);
    }

    public void freiar() {
        setVelocidadeatual((double) 0);
        System.out.println("O carro freiou, a velocidade atual é: "+ velocidadeatual);
    }

    public void trocarmarcha() {
        if (marchaatual < numeromarchas){
            marchaatual++;
            System.out.println("A marcha foi trocada, marcha atual: "+ marchaatual);
        }
    }

    public void reduzirmarcha() {
        if (marchaatual > 0){
            marchaatual--;
            System.out.println("A marcha foi reduzida, marcha atual: "+ marchaatual);
        }
    }

    public void marchare(){
        if (velocidadeatual == 0D){
            marchaatual = 0;
            System.out.println("Marcha RÉ: "+ marchaatual);
        } else System.out.println("O carro precisa estar parado");
    }

    public void autonomia(Double comsumoMedio){
        percorrido = quantidadecombustivel * comsumoMedio;
        System.out.println("O carro faz 12 km por litro, distancia percorrida: "+ percorrido);

    }
}
