package com.xyh.controller;

import com.xyh.entity.User;
import com.xyh.entity.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author xyh
 * @version 1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value = "/index", method = RequestMethod.POST)   //params = {"id=1","name=tom"}
    public String index(@RequestParam("num") Integer id, @RequestParam("str") String name) {
        System.out.println("接收到了请求,参数是：id="+id+",name="+name);
        //返回逻辑视图
        return "index";
    }

    @RequestMapping("/restful/{id}/{name}")
    public String restful(@PathVariable("id") Integer id, @PathVariable("name") String name) {
        System.out.println(id+"-"+name);
        return "redirect:/index.jsp";
    }

    @RequestMapping("/cookie")
    public String getCookie(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String add(User user) {
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/baseType")
    @ResponseBody
    public String baseType(int id) {
        return "id:" + id;
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id:"+id;
    }

    @RequestMapping("/arrayType")
    @ResponseBody
    public String arrayType(String[] names) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : names) {
            stringBuffer.append(str).append(" ");
        }
        return "names:"+stringBuffer.toString();
    }

    @RequestMapping("/listType")
    @ResponseBody
    public String listType(UserList users) {
        StringBuffer stringBuffer = new StringBuffer();
        for (User user : users.getUsers()) {
            stringBuffer.append(user);
        }
        return "用户："+stringBuffer.toString();
    }
}
