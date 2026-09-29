package com.ServletCrud.servlet;

import com.ServletCrud.Model.User;
import com.ServletCrud.service.UserService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/users")
public class UserServlet extends HttpServlet {
    private UserService userService = new UserService();

    //POST
    //localhost:8080/crud-app/users?id= &name= &email= &mobile=
    @Override
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if(id == null || name == null || email == null || mobile == null ){
            response.setStatus(400);
            response.setContentType("application/json");
            response.getWriter().write(
                    "{\n"+
                           "     \"message\": \"Some fields are missing\"\n" +
                    "}"
            );
        }
        User user = new User(id,name,email,mobile);
        User createdUser = userService.createUser(user);
        //return json object
        response.setStatus(201);
        response.setContentType("application/json");
        response.getWriter().write(
                "{\n"+
                        "     \"message\": \"User Added Successfully\"\n" +
                "}"
        );
    }

    //GET
    //localhost:8080/crud-app/users?id=
    //localhost:8080/crud-app/users
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");

        if(idParam == null){
            List<User> users = userService.getAllUsers();
            //return users
            response.setStatus(200);
            response.setContentType("application/json");
            response.getWriter().write(usersToJson(users));
            return;
        }

        Integer id = Integer.parseInt(idParam);

        User userResp = userService.getUserById(id);

        if(userResp == null){
            //return status = 404
            response.setStatus(404);
            response.setContentType("application/json");
        }
        //return user;
        response.setStatus(200);
        response.setContentType("application/json");
        response.getWriter().write(userToJson(userResp));
    }

    //PUT
    //localhost:8080/crud-app/users?id= &name= &email= &mobile=
    @Override
    public void doPut(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if(id == null || name == null || email == null || mobile == null){
            response.setStatus(400);
            response.setContentType("application/json");
            response.getWriter().write(
                    "{\n"+
                            "     \"message\": \"Some fields are missing\"\n" +
                            "}"
            );
            return;
        }
        if(userService.idExists(id)){
            User user = new User(id,name,email,mobile);
            User updatedUser = userService.updateUser(user);
            response.setStatus(201);
            response.setContentType("application/json");
            response.getWriter().write(userToJson(updatedUser));
            return;
        }
        response.setStatus(404);
        response.setContentType("application/json");
        response.getWriter().write(
                "{\n"+
                        "     \"message\": \"Id does not exists\"\n" +
                        "}"
        );
    }

    //DELETE
    //localhost:8080/crud-app/users?id=
    @Override
    public void doDelete(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {
        String idParam = request.getParameter("id");
        if (idParam == null){
            response.setStatus(400);
            response.setContentType("application/json");
            response.getWriter().write(
                    "{\n"+
                            "     \"message\": \"Id is missing\"\n" +
                            "}"
            );
            return;
        }
        Integer id = Integer.parseInt(idParam);
        if(userService.idExists(id)){

            userService.deleteUser(id);
            response.setStatus(201);
            response.setContentType("application/json");
            response.getWriter().write(
                    "{\n"+
                            "     \"message\": \"User Deleted Successfully\"\n" +
                            "}"
            );
            return;
        }
        response.setStatus(404);
        response.setContentType("application/json");
        response.getWriter().write(
                "{\n"+
                        "     \"message\": \"Id does not exists\"\n" +
                        "}"
        );
    }

    private String userToJson(User user){
        return "{\n" +
                "    \"id\" : "+user.getId()+",\n" +
                "    \"name\" : \""+user.getName()+"\",\n" +
                "    \"email\" : \""+user.getEmail()+"\",\n" +
                "    \"mobile\" : \""+user.getMobile()+"\"\n" +
                "}";
    }
    private String usersToJson(List<User> users){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for(int i = 0; i< users.size(); i++){
            stringBuilder.append(userToJson(users.get(i)));
            if(i < users.size() - 1){
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
