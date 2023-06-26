package generics;

import java.util.ArrayList;
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

    public List<String> checkAllTypeClients(List<? extends Client> clients){
        List<String> types = new ArrayList<>();
        for(Client client: clients){
            types.add(client.getType());
        }
        return types;
    }

    public boolean checkValidIdNumber(List<? extends Client> clients){

        for(Client client: clients){
           if(!client.isValidIDNumber())
               throw new IllegalArgumentException("Invalid ID for client: "+client.getName());
        }
        return true;
    }
}
