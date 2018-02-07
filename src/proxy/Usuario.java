package proxy;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private List<String> permissoes;

    public Usuario(String nome) {
        this.nome = nome;
        permissoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void autorizaAcesso(String classe, String metodo) {
        permissoes.add(String.format("%s: %s", classe, metodo));
    }

    public boolean verificaPermissao(String classe, String metodo) {
        return permissoes.contains(String.format("%s: %s", classe, metodo));
    }
}
