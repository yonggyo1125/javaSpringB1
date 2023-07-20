package filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
        //request.setCharacterEncoding("UTF-8");


        CommonRequestWrapper req = new CommonRequestWrapper((HttpServletRequest) request);
        CommonResponseWrapper res = new CommonResponseWrapper((HttpServletResponse) response);

        chain.doFilter(req, res); // Filter2 이동

        System.out.println("filter1 - 응답 후 처리");
    }
}
