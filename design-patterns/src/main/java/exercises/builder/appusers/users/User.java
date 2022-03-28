package exercises.builder.appusers.users;

import exercises.builder.appusers.components.DataUser;
import exercises.builder.appusers.components.UserType;
import exercises.builder.appusers.components.Permission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private UserType userType;
    private Permission permission;
    private DataUser dataUser;

    public String result(){
        StringBuilder userT = new StringBuilder();
        userT.append("Tipo de Usuário: " + userType + "\n");
        userT.append("Permissão: " + permission + "\n");
        userT.append("Nome: " + dataUser.getName() + "\n");
        userT.append("CPF: " + dataUser.getCpf() + "\n");
        return userT.toString();
    }
}
