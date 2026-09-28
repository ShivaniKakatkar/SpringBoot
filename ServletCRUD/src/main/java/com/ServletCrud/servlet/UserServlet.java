package com.ServletCrud.servlet;

import com.ServletCrud.Model.User;
import com.ServletCrud.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserService();
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response){
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if(id == null || name == null || email == null || mobile == null){
            //return 400
        }
        User user = new User(id,name,email,mobile);
        User createdUser = userService.createUser(user);
        //return json object
    }
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response){

    }
    @Override
    public void doPut(HttpServletRequest request,
                      HttpServletResponse response){

    }
    @Override
    public void doDelete(HttpServletRequest request,
                         HttpServletResponse response){

    }
}
