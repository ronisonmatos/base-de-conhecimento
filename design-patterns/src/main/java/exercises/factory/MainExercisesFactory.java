package exercises.factory;

/*
 * Factory Method é um padrão de design criacional que fornece uma interface para criar objetos em uma superclasse,
 * mas permite que subclasses alterem o tipo de objetos que serão criados.
 * Fonte: https://refactoring.guru/design-patterns/factory-method
 * */

public class MainExercisesFactory {

    /*
     * O padrão Factory Method sugere que você substitua as chamadas diretas de construção de objeto (usando o new operador)
     * por chamadas para um método de fábrica especial. Não se preocupe: os objetos ainda são criados por meio do new operador, mas estão sendo
     * chamados de dentro do método de fábrica.
     * Objetos retornados por um método de fábrica geralmente são chamados de produtos.
     */
    private static Document document;

    /*
     * 3 - A classe Creator declara o método de fábrica que retorna novos objetos de produto. É importante que o tipo de retorno desse método corresponda à interface do produto.
     * Você pode declarar o método de fábrica como abstrato para forçar todas as subclasses a implementar suas próprias versões do método. Como alternativa,
     * o método de fábrica base pode retornar algum tipo de produto padrão.
     */
    public static void main(String[] args){
        configure(args[0]);
        if(document != null){
            runEmission();
        }
    }

    private static void runEmission() {
        document.startDocument();
    }

    /*Recebo o tipo de Emissão*/
    private static void configure(String type) {
        switch (type){
            case "nfe":
                document = new CreateNfeEmission();
                break;
            case "cte":
                document = new CreateCteEmission();
                break;
            case "mdfe":
                document = new CreateMdfeEmission();
                break;
            default:
                System.out.println("Tipo de documento inválido");
        }
    }
}
