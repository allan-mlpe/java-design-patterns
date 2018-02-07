package proxy;

public class ProxySegurancaNegocio implements InterfaceNegocio {

    //o proxy encapsula uma interface do mesmo tipo
    private InterfaceNegocio encapsulado;

    private Usuario user;

    public ProxySegurancaNegocio(InterfaceNegocio encapsulado, Usuario user) {
        this.encapsulado = encapsulado;
        this.user = user;
    }

    @Override
    public void executaTransacao() {
        if(user.verificaPermissao("InterfaceNegocio", "executaTransacao")) {
            encapsulado.executaTransacao();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public void cancelaTransacao() {
        if(user.verificaPermissao("InterfaceNegocio", "cancelaTransacao")) {
            encapsulado.cancelaTransacao();
        } else {
            throw new RuntimeException();
        }
    }

    public InterfaceNegocio getEncapsulado() {
        return encapsulado;
    }

    public void setEncapsulado(InterfaceNegocio encapsulado) {
        this.encapsulado = encapsulado;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
