package exercises.factory;

import exercises.factory.emission.Cte;
import exercises.factory.emission.IEmission;
import exercises.factory.emission.Mdfe;

public class CreateMdfeEmission extends Document{

    /* 5 - Os Criadores de Concreto substituem o método de fábrica base para que ele retorne um tipo diferente de produto.
     * Observe que o método de fábrica não precisa criar novas instâncias o tempo tod0. Ele também pode retornar objetos existentes de um cache,
     * um pool de objetos ou outra fonte.
     */
    @Override
    protected IEmission createEmission() {
        return new Mdfe();
    }
}
