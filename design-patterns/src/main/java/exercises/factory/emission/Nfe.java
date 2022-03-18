package exercises.factory.emission;

public class Nfe implements IEmission{

    /*
     * 2 -Produtos concretos são implementações diferentes da interface do produto.
     */

    @Override
    public void startEmission() {
        getTypeDocment();
        System.out.println("Lendo o XML do documento.");
    }

    @Override
    public void getTypeDocment() {
        System.out.println("Emitindo NF-e");
    }
}
