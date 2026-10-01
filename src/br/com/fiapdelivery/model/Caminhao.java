package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade); 
        this.setEixos(eixos);
    }

    public int getEixos() {
        return this.eixos;
    }

    private void setEixos(int eixos) {
        if(eixos > 0) {
            this.eixos = eixos;
        }
    }
}