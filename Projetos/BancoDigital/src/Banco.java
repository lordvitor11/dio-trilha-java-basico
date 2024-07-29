import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    @Getter
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(" - " + conta);
        }
    }

    public boolean adicionarConta(Conta conta) {
        return contas.add(conta);
    }

    public boolean removerConta(Conta conta) {
        return contas.remove(conta);
    }
}
