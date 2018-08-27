package com.br.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractController implements Controller {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String returnPage;

    @Override
    public void init(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    @Override
    public String getReturnPage() {
        return returnPage;
    }
}
