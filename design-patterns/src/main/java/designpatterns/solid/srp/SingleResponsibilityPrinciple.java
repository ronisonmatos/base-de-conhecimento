package designpatterns.solid.srp;

/*
 * SRP: Princ�pio da Responsabilidade �nica (Single Responsibility Principle) Um corol�rio ativo da lei de
Conway: a melhor estrutura para um sistema de software deve ser altamente influenciada pela estrutura social da
organiza��o que o utiliza, de modo que cada m�dulo de software tenha uma, e apenas uma, raz�o para mudar.
 */
/**
 * @author Ronison Matos
 */
public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {

    }

    public void listClient() {

    }

    public void addClient() {

    }

    public void updateClient() {

    }

    public void deleteClient() {

    }
    /*
     * O m�todo notifyEmail() est� fora da responsabilidade da classe, deve dividir as responsabilidades criando outra
     * classe espec�fica
     */

    /* Solu��o: Criar classe para o m�todo espec�fico */

    // public void notifyEmail(){
    // }

}
