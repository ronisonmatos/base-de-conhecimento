package exercises.builder.appusers.builders;

import exercises.builder.appusers.components.DataUser;
import exercises.builder.appusers.components.Permission;
import exercises.builder.appusers.components.UserType;
import exercises.builder.appusers.users.User;

public interface IUsersBuilder {
    void setPermission(Permission permission);
    void setUserType(UserType userType);
    void setDataUser(DataUser dataUser);
}
