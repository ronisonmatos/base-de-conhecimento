package exercises.factory;

import exercises.factory.emission.Cte;
import exercises.factory.emission.IEmission;
import exercises.factory.emission.Mdfe;

public class CreateMdfeEmission extends Document{
    @Override
    protected IEmission createEmission() {
        return new Mdfe();
    }
}
