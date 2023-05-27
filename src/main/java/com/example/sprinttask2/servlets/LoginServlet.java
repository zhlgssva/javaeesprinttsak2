package com.example.sprinttask2.servlets;

import com.example.sprinttask2.database.DBManager;
import com.example.sprinttask2.database.Users;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Users> users = DBManager.getUsers();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean check = false;
        for (Users user: users){
            if (user.getEmail().equals(email)){
                if (user.getPassword().equals(password)){
                    check = true;
                    break;
                }
            }
        }
        if (check) response.sendRedirect("/profile.jsp");
        else response.sendRedirect("/login.jsp");
    }
}
