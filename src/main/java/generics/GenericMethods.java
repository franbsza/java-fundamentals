package generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static <T> List<T> convertArrayToList(T[] array){
        return Arrays.asList(array);
    }

    public static <T extends Client> List<T> uppercaseEachElement(List<T> clientList){
        for(Client client : clientList){
            client.getName().toUpperCase();
        }
        return clientList;
    }

    public static void checkAllTypeClients(List<? extends Client> clients){

        for(Client client: clients){
            client.getGrettings();
        }
    }

    public static void checkValidIdNumber(List<? extends Client> clients){

        for(Client client: clients){
            System.out.println(client.isValidIDNumber());
        }
    }
}
