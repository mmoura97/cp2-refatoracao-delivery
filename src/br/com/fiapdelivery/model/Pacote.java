package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        this.codigo = codigo;
        this.setPeso(peso);
        this.status = status;
    }

    public String getCodigo() { return this.codigo; }
    public double getPeso() { return this.peso; }
    public String getStatus() { return this.status; }

    private void setPeso(double peso) {
        if(peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Erro: Peso inválido.");
        }
    }

    public void atualizarStatus(String novoStatus) {
        if(novoStatus != null && !novoStatus.trim().isEmpty()) {
            this.status = novoStatus;
            System.out.println("Status do pacote " + this.codigo + " atualizado para: " + this.status);
        }
    }
}