package kz.bitlab.serviceB.serviceB.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    public List<String> getUsers(){
        return Arrays.asList("Ilyas", "Berik", "Serik", "Erik");
    }

}
