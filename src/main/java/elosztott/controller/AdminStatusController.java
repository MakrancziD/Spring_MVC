package elosztott.controller;

import elosztott.model.User;
import elosztott.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by makra on 2016. 09. 26..
 */
@Controller
public class AdminStatusController {
    @Autowired
    UserManager userManager;

    @ModelAttribute("userList")
    List<User> getUsers() {
        return userManager.getUsers();
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ModelAndView getdata() {

        List<User> list = userManager.getUsers();

        ModelAndView model = new ModelAndView("status");
        model.addObject("users", list);

        return model;

    }

}
