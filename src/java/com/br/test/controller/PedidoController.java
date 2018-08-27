package com.br.test.controller;

import lojaEletronicos.dao.PedidoDAO;
import lojaEletronicos.entities.Pedido;

public class PedidoController extends AbstractController{

    @Override
    public void execute() {
        String control = request.getParameter("control").split("\\.")[1].toUpperCase();
        switch(control){
            case "BUY":
                create();
                break;
            case "DELETE":
                delete();
                break;
            case "UPDATE":
                update();
                break;
        }
    }

    private void create() {
        long num_Pedido = Long.decode(request.getParameter("num_Pedido"));

        Pedido user = new Pedido(num_Pedido);
        PedidoDAO dao = new PedidoDAO();
        boolean resp = dao.create(user);

        if (resp) {
            returnPage = "admin1.jsp";
            this.request.getSession().setAttribute("user", user);
        } else {
            returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Erro no cadastro!");
        }
    }
    
        private void delete() { 
        long num_Pedido =Long.decode(request.getParameter("num_Pedido"));  
        
        
        PedidoDAO dao = new PedidoDAO();
        Pedido user = new Pedido(num_Pedido);
        boolean resp = dao.delete(user);
        
        if (resp == false) {
            this.returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Usuário ou senha incorretos!");
        } else {
            this.returnPage = "admin1.jsp";
            this.request.getSession().setAttribute("error", "Deletado Com Sucesso");
        }
    }
        
    private void update() {
        long num_Pedido = Long.decode(request.getParameter("num_Pedido"));

        Pedido user = new Pedido(num_Pedido);
        PedidoDAO dao = new PedidoDAO();
        boolean resp = dao.update(user);

        if (resp) {
            returnPage = "client.jsp";
            this.request.getSession().setAttribute("user", user);
        } else {
            returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Falha ao atualizar!");
        }
    }
}
