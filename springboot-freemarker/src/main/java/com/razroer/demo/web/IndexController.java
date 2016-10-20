package com.razroer.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

/**
 * Created by Daniel on 20/10/2016.
 */
public class IndexController {

    @RequestMapping("/index")
    public String index(Map<String, Object> model) {

        model.put("time", new Date());
        model.put("name", "you");

        return "index";
    }


}
