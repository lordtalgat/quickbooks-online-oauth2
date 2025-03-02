package com.intuit.developer.helloworld.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class GetAccessToken {
    private static final Logger logger = Logger.getLogger(QBOController.class);

    @RequestMapping("/getAccessToken")
    @ResponseBody
    public  String getAccessToken(HttpSession session) {
        return (String)session.getAttribute("access_token");
    }


}
