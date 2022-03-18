package exercises.factory;

import exercises.factory.emission.IEmission;

public abstract class Document {

    void startDocument(){
        IEmission  iEmission = createEmission();
        iEmission.startEmission();
    }

    protected abstract IEmission createEmission();

}
