package designpatterns.solid.srp;

/*
 * SRP: Princípio da Responsabilidade Única (Single Responsibility Principle) Um corolário ativo da lei de
Conway: a melhor estrutura para um sistema de software deve ser altamente influenciada pela estrutura social da
organização que o utiliza, de modo que cada módulo de software tenha uma, e apenas uma, razão para mudar.
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
     * O método notifyEmail() está fora da responsabilidade da classe, deve dividir as responsabilidades criando outra
     * classe específica
     */

    /* Solução: Criar classe para o método específico */

    // public void notifyEmail(){
    // }

}
