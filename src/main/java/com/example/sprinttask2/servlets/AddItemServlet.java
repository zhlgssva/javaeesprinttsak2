package com.example.sprinttask2.servlets;

import com.example.sprinttask2.database.DBManager;
import com.example.sprinttask2.database.Items;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/New-Sales")
public class AddItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String description1 = request.getParameter("firstDescription");
        String description2 = request.getParameter("secondDescription");
        String description3 = request.getParameter("thirdDescription");

        Items item = new Items();
        item.setName(name);
        item.setDescription1(description1);
        item.setDescription2(description2);
        item.setDescription3(description3);
        item.setPrice(price);
        DBManager.addItem(item);
        response.sendRedirect("/main");
    }
}
