package com.rongdc.core.controller;

import com.rongdc.annotation.MyController;
import com.rongdc.annotation.MyRequestMapping;
import com.rongdc.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author rongdc
 */
@MyController
@MyRequestMapping("/test")
public class TestController {
    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response, @MyRequestParam("param") String param) {
        System.out.println(param);
        try {
            response.getWriter().write("doTest method Success param:" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @MyRequestMapping("/doTest2")
    public void test2(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.getWriter().write("doTest2 method success!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
