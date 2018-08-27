package com.br.test.controller;

import lojaEletronicos.dao.ProdutoDAO;
import lojaEletronicos.entities.Produto;

public class ProdutoController extends AbstractController{

    @Override
    public void execute() {
        String control = request.getParameter("control").split("\\.")[1].toUpperCase();
        switch(control){
            case "CREATE":
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
        String nome = request.getParameter("nome");
        String preco = request.getParameter("preco");
        String regiao = request.getParameter("regiao");
        String cod_Produto = request.getParameter("cod_Produto");

        Produto user = new Produto(nome, preco, regiao, cod_Produto);
        ProdutoDAO dao = new ProdutoDAO();
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
        long id_Produto =Long.decode(request.getParameter("id_Produto"));  
         
        String regiao = request.getParameter("regiao");
        
        ProdutoDAO dao = new ProdutoDAO();
        Produto user = new Produto(id_Produto, regiao);
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
        String nome = request.getParameter("nome");
        String preco = request.getParameter("preco");
        String regiao = request.getParameter("regiao");
        String cod_Produto = request.getParameter("cod_Produto");

        Produto user = new Produto(nome, preco, regiao, cod_Produto);
        ProdutoDAO dao = new ProdutoDAO();
        boolean resp = dao.update(user);

        if (resp) {
            returnPage = "admin1.jsp";
            this.request.getSession().setAttribute("user", user);
        } else {
            returnPage = "error.jsp";
            this.request.getSession().setAttribute("error", "Falha ao atualizar!");
        }
    }
}
