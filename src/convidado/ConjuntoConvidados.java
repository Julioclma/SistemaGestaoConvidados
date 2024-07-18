package convidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void add(String nome, int codigoConvite) {
        this.convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removePerCode(int codigoConvite) {
        Convidado convidadoToRemove = null;

        for (Convidado convidado : this.convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                this.convidados.remove(convidado);
                return;
            }
        }

    }

    public int contarConvidados() {
        return this.convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidados);
    }


    public static void main(String[] args) {

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.add("Julio", 123456);
        conjuntoConvidados.add("João", 231241);


        System.out.println("quantidade: "+conjuntoConvidados.contarConvidados());

       conjuntoConvidados.exibirConvidados();
    }
}
