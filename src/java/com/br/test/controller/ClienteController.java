package com.br.test.controller;

import lojaEletronicos.dao.ClienteDAO;
import lojaEletronicos.entities.Cliente;

public class ClienteController extends AbstractController{

    @Override
    public void execute() {
        String control = request.getParameter("control").split("\\.")[1].toUpperCase();
        switch(control){
            case "REGISTER":
                register();
                break;
            case "LOGIN":
                login();
                break;
            case "DELETE":
                delete();
                break;
            case "UPDATE":
                update();
                break;
        }
    }

    private void register() {
        String nome = request.getParameter("nome");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        String pwd2 = request.getParameter("password2");

        Cliente user = new Cliente(nome, address, tel, username, pwd);
        ClienteDAO dao = new ClienteDAO();
        boolean resp = dao.create(user);

        if (resp) {
            returnPage = "index.jsp";
            this.request.getSession().setAttribute("user", user);
        } else {
            returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Erro no cadastro!");
        }
    }
    
    private void login() {
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");
        
        ClienteDAO dao = new ClienteDAO();
        Cliente user = dao.login(username, pwd);
        if(user == null){
            this.returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Usuário ou senha incorretos!");
        } else {
            this.returnPage = "cliente.jsp";
            this.request.getSession().setAttribute("user", user);
        }
    }
    
        private void delete() { 
        long id =Long.decode(request.getParameter("id_Cliente"));  
         
        String pwd = request.getParameter("password");
        String pwd2 = request.getParameter("password2");
        
        ClienteDAO dao = new ClienteDAO();
        Cliente user = new Cliente(id, pwd);
        boolean resp = dao.delete(user);
        
        if (resp == false) {
            this.returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Usuário ou senha incorretos!");
        } else {
            this.returnPage = "delete.jsp";
            this.request.getSession().setAttribute("error", "Deletado Com Sucesso");
        }
    }
        
    private void update() {
        String nome = request.getParameter("nome");
        String address = request.getParameter("adress");
        String tel = request.getParameter("tel");
        String username = request.getParameter("username");
        String pwd = request.getParameter("password");

        Cliente user = new Cliente(nome, address, tel, username, pwd);
        ClienteDAO dao = new ClienteDAO();
        boolean resp = dao.update(user);

        if (resp) {
            returnPage = "update.jsp";
            this.request.getSession().setAttribute("user", user);
        } else {
            returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Falha ao atualizar!");
        }
    }
}
