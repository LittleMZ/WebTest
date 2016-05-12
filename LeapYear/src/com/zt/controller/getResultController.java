package com.zt.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by M on 16/5/12.
 */
@WebServlet("/getResult")
public class getResultController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer inputYear = Integer.valueOf(req.getParameter("year"));
        boolean flag = false;
        if(inputYear%4==0){
            flag = true;
        }
        req.setAttribute("flag",flag);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/result.jsp");
        dispatcher.forward(req,resp);
    }
}
