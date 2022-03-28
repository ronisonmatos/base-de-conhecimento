package exercises.builder.appusers.builders;

import exercises.builder.appusers.components.DataUser;
import exercises.builder.appusers.components.UserType;
import exercises.builder.appusers.components.Permission;
import exercises.builder.appusers.users.User;

public class UserBuilder implements IUsersBuilder {

    private DataUser dataUser;
    private Permission permission;
    private UserType userType;

    @Override
    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    @Override
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public void setDataUser(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    public User getResult(){
        return new User(userType,permission,dataUser);
    }
}
