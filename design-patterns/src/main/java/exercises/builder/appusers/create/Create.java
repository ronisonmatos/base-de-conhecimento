package exercises.builder.appusers.create;

import exercises.builder.appusers.builders.IUsersBuilder;
import exercises.builder.appusers.components.DataUser;
import exercises.builder.appusers.components.UserType;
import exercises.builder.appusers.components.Permission;

public class Create {

    public void createClient(IUsersBuilder usersBuilder, DataUser dataUser){
        usersBuilder.setDataUser(dataUser);
        usersBuilder.setUserType(UserType.PATIENTS);
        usersBuilder.setPermission(Permission.CLIENT);
    }

    public void createAdm(IUsersBuilder usersBuilder, DataUser dataUser){
        usersBuilder.setDataUser(dataUser);
        usersBuilder.setUserType(UserType.ADM);
        usersBuilder.setPermission(Permission.ADM_SYSTEM);
    }
}
