package com.hafiz.www.filter;




import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Author：yanghl
 * Desc：
 * Date: 2017/3/24.
 */
public class AuthorizationCheckFilter implements Filter {

    //private Logger logger = LoggerFactory.getLogger(AuthorizationCheckFilter.class);//写法一
    private Logger logger = Logger.getLogger(AuthorizationCheckFilter.class);//写法二

    private ServletContext context = null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        context = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String url = req.getRequestURL().toString();
        logger.info("url:"+url);
        if(url.indexOf("insert")>0){
            System.out.println("Illegal URL!");
        }
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
