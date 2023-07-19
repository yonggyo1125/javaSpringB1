package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter2 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("filter2 - 요청 전 처리");

        chain.doFilter(request, response); // JoinServlet::doGet..

        System.out.println("filter2 - 응답 후 처리");
    }
}
