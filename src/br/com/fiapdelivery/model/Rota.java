package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacote;
    private Veiculo veiculoDesignado; 

    public Rota(Pacote pacote, Veiculo veiculoDesignado) {
        this.pacote = pacote;
        this.veiculoDesignado = veiculoDesignado;
    }

    public void iniciarRota() {
        System.out.println("Iniciando rota...");
        System.out.println("Levando pacote " + this.pacote.getCodigo() + 
                           " no veículo placa " + this.veiculoDesignado.getPlaca());
    }
}