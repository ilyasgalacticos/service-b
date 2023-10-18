package kz.bitlab.serviceB.serviceB.api;

import kz.bitlab.serviceB.serviceB.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<String> getUsers(){
        return itemService.getUsers();
    }

}