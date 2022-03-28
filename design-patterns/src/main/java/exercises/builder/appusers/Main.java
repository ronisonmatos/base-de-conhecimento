package exercises.builder.appusers;

import exercises.builder.appusers.builders.UserBuilder;
import exercises.builder.appusers.components.DataUser;
import exercises.builder.appusers.create.Create;
import exercises.builder.appusers.users.User;

public class Main {

    public static void main(String[] args){

        Create createA = new Create();
        DataUser dataUserA = new DataUser();
        dataUserA.setName("Roni");
        dataUserA.setCpf("40203356931");

        UserBuilder userBuilderA = new UserBuilder();
        createA.createClient(userBuilderA,dataUserA);
        User userA = userBuilderA.getResult();
        System.out.println(userA.result());

        System.out.println("============================================================ \n");

        Create createB = new Create();
        DataUser dataUserB = new DataUser();
        dataUserB.setName("Fulano");
        dataUserB.setCpf("40203692546");

        UserBuilder userBuilderB = new UserBuilder();
        createB.createAdm(userBuilderB,dataUserB);
        User userB = userBuilderB.getResult();
        System.out.println(userB.result());


    }
}
