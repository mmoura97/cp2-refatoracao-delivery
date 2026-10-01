package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.*;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Sistema FiapDelivery ---");
        
        Caminhao caminhao = new Caminhao("ABC-1234", 15000.0, 4);
        Pacote pacote = new Pacote("BR999", 10.5, "Pendente");

        Rota rotaCaminhao = new Rota(pacote, caminhao);
        rotaCaminhao.iniciarRota();
        pacote.atualizarStatus("Em trânsito");
        
        System.out.println("\n--- Testando nova Rota com Moto ---");
        Moto moto = new Moto("XYZ-9876", 30.0, true);
        Pacote pacotePequeno = new Pacote("MINI-001", 2.0, "Pendente");
        
        Rota rotaMoto = new Rota(pacotePequeno, moto);
        rotaMoto.iniciarRota();
    }
}