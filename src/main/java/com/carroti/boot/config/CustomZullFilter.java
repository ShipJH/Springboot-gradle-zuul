package com.carroti.boot.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class CustomZullFilter extends ZuulFilter {

    @Override
    public boolean shouldFilter() {

        return true;
    }

    @Override
    public int filterOrder() {

        return 0;
    }

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public Object run() throws ZuulException {
    	
    	RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        
        
        
        
        return null;
    }
}