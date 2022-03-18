package exercises.factory;

import exercises.factory.emission.Cte;
import exercises.factory.emission.IEmission;

public class CreateCteEmission extends Document{
    @Override
    protected IEmission createEmission() {
        return new Cte();
    }
}
