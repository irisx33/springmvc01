package com.xyh.controller;

import com.xyh.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xyh
 * @version 1.0
 */
@Controller
@RequestMapping("/view")
@SessionAttributes(value = "user")
public class ViewHandler {
    @RequestMapping("/map")
    public String map(Map<String, Object> map) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        return "show";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        model.addAttribute("user", user);
        return "show";
    }

    @RequestMapping("/mav1")
    public ModelAndView modelAndView1() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        //填充业务数据
        modelAndView.addObject("user", user);
        //绑定视图信息
        modelAndView.setViewName("show");
        return modelAndView;
    }
    @RequestMapping("/mav2")
    public ModelAndView modelAndView2() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(1);
        modelAndView.addObject("user", user);
        View view = new InternalResourceView("/show.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping("/mav3")
    public ModelAndView modelAndView3() {
        ModelAndView modelAndView = new ModelAndView("show");
        User user = new User();
        user.setId(1);
        user.setName("张三");
        modelAndView.addObject("user",user);
        return modelAndView;
    }

    @RequestMapping("/mav4")
    public ModelAndView modelAndView4() {
        View view = new InternalResourceView("/show.jsp");
        ModelAndView modelAndView = new ModelAndView(view);
        User user = new User();
        user.setId(1);
        user.setName("张三");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/mav5")
    public ModelAndView modelAndView5() {
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        ModelAndView modelAndView = new ModelAndView("show", map);
        return modelAndView;
    }

    @RequestMapping("/mav6")
    public ModelAndView modelAndView6() {
        Map<String,Object> map = new HashMap<>();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        map.put("user", user);
        View view = new InternalResourceView("/show.jsp");
        ModelAndView modelAndView = new ModelAndView(view, map);
        return modelAndView;
    }

    @RequestMapping("/mav7")
    public ModelAndView modelAndView7() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        ModelAndView modelAndView = new ModelAndView("show","user",user);
        return modelAndView;
    }

    @RequestMapping("/mav8")
    public ModelAndView modelAndView8() {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        View view = new InternalResourceView("/show.jsp");
        ModelAndView modelAndView = new ModelAndView(view,"user",user);
        return modelAndView;
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        request.setAttribute("user", user);
        return "show";
    }

    @RequestMapping("/modelAttribule")
    public String modelAttribute() {
        return "show";
    }

//    @ModelAttribute
//    public User getUser() {
//        User user = new User();
//        user.setId(1);
//        user.setName("张三");
//        return user;
//    }
//    @ModelAttribute
//    public void getUser(Model model) {
//        User user = new User();
//        user.setId(1);
//        user.setName("张三");
//        model.addAttribute("user", user);
//    }

    @RequestMapping("/session")
    public String session(HttpSession session) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        session.setAttribute("user",user);
        return "show";
    }

//    @RequestMapping("/sessionAnnotation")
//    public ModelAndView sessionAnnotation() {
//        ModelAndView modelAndView = new ModelAndView("show");
//        User user = new User();
//        user.setId(1);
//        user.setName("张三");
//        modelAndView.addObject("user",user);
//        return modelAndView;
//    }

}
