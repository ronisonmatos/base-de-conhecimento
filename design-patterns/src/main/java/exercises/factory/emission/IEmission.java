package exercises.factory.emission;

/*
 * 1 - O Produto declara a interface, que é comum a todos os objetos que podem ser produzidos pelo criador e suas subclasses.
 */

public interface IEmission {
    void startEmission();
    void getTypeDocment();
}
