package elosztott.controller;

import elosztott.model.NewUserRequest;
import elosztott.model.User;
import elosztott.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by makra on 2016. 09. 19..
 */

@Controller
@RequestMapping("/admin")
public class AdminController
{
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public ModelAndView getdata() {

        List<User> list = userManager.getUsers();

        ModelAndView model = new ModelAndView("status");
        model.addObject("users", list);

        return model;
    }

    @RequestMapping(value = "status/remove", method = RequestMethod.POST)
    public ModelAndView removeUser(@ModelAttribute(value = "users") ArrayList<User> users) {
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/status");
        return model;

    }

    @RequestMapping(value = "/get_balance", method = RequestMethod.GET)
    public String getBalance() { return "get_balance"; }

    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String showForm(@ModelAttribute NewUserRequest userForm) {
        return "new_user";
    }

    @RequestMapping(value = "/new_user", method = RequestMethod.POST)
    public String checkUserForm(@ModelAttribute @Valid NewUserRequest newUserRequest, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "new_user";
        }
        User user = new User(
                newUserRequest.getUsername(),
                newUserRequest.getVegzettseg(),
                new ArrayList<String>(),//newUserRequest.getColor()),
                newUserRequest.getNem()
        );
        userManager.addUser(user);

        return "redirect:/admin/status";
    }
}
