package com.twimi.documentmanager.Controller;

import com.twimi.documentmanager.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(ModelMap modelMap, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user!=null){
            modelMap.addAttribute("username",user.getUsername());
        }
        return "index";
    }
}
