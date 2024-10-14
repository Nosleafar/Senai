package entities;

public class Car {

    private String modelo;
    private int ano;
    private String cor;
    private String motor;
    private String cambio;
    private String velocidade;
    private String acelerar;

    public String getAcelerar() {
        return acelerar;
    }

    public void setAcelerar(String acelerar) {
        this.acelerar = acelerar;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    public void especificacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Motor: " + motor);
        System.out.println("Câmbio: " + cambio);
        System.out.println("Velocidade Máxima: " + velocidade + " Km/h");
    }
}