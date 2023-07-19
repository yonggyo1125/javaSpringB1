package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       String setting = filterConfig.getInitParameter("filtersetting");
       System.out.println("init : " + setting);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("filter1 - 요청 전 처리");

        chain.doFilter(request, response); // Filter2 이동

        System.out.println("filter1 - 응답 후 처리");
    }
}
