package com.intuit.developer.helloworld.controller;


import com.google.gson.Gson;
import com.intuit.developer.helloworld.helper.QBOServiceHelper;
import com.intuit.ipp.core.IEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QBOInvoceComtroller {

    @Autowired
    public QBOServiceHelper helper;

    @ResponseBody
    @RequestMapping("/getInvoiceInfo")
    public String callQBOInvoiceInfo(HttpSession session) {
            String sql = "select * from Invoice";
            List<? extends IEntity> queryResult = helper.queryData(session,sql);
            Gson sGson = new Gson();
            return sGson.toJson(queryResult);
    }


}
