package com.twimi.documentmanager.Controller;

import com.twimi.documentmanager.Model.Proposal;
import com.twimi.documentmanager.Model.User;
import com.twimi.documentmanager.Service.ProposalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ProposalService proposalService;

    @RequestMapping("/index")
    public String index(ModelMap modelMap, HttpSession session) {
        User user = (User) session.getAttribute("user");
        List<Proposal> proposals = proposalService.getAll();
        if(user!=null){
            modelMap.addAttribute("user",user);
        }
        modelMap.addAttribute("proposals",proposals);
        return "index";
    }
}
