package com.br.test.controller;

import lojaEletronicos.dao.Admin1DAO;
import lojaEletronicos.entities.Admin1;

public class Admin1Controller extends AbstractController{

    @Override
    public void execute() {
        String control = request.getParameter("control").split("\\.")[1].toUpperCase();
        switch(control){
            case "LOGIN":
                login();
                break;
        }
    }
    
    private void login() {
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        
        Admin1DAO dao = new Admin1DAO();
        Admin1 user = dao.login(username, pwd);
        if(user == null){
            this.returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Usuário ou senha incorretos!");
        } else {
            this.returnPage = "admin1.jsp";
            this.request.getSession().setAttribute("user", user);
        }
    }
}
