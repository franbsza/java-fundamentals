package generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public <T> List<T> convertArrayToList(T[] array){
        return Arrays.asList(array);
    }

    public <T extends Client> List<T> uppercaseEachElement(List<T> clientList){
        for(Client client : clientList){
            client.setName(client.getName().toUpperCase());
        }
        return clientList;
    }

    public void checkAllTypeClients(List<? extends Client> clients){

        for(Client client: clients){
            client.getGrettings();
        }
    }

    public void checkValidIdNumber(List<? extends Client> clients){

        for(Client client: clients){
            System.out.println(client.isValidIDNumber());
        }
    }
}
