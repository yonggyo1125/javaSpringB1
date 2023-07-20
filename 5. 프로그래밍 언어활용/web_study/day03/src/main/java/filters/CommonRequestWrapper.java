package filters;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

import java.io.UnsupportedEncodingException;

public class CommonRequestWrapper extends HttpServletRequestWrapper  {


    public CommonRequestWrapper(HttpServletRequest request) {
        super(request);

        // 요청 전 공통 기능
        String method = request.getMethod();
        if (method.toUpperCase().equals("POST")) { // POST일때 공통 처리할 내용
            try {
                request.setCharacterEncoding("UTF-8");
            } catch (UnsupportedEncodingException e) {}
        }
    }

    @Override
    public String getParameter(String name) {
        String value = super.getParameter(name);
        value = value.toUpperCase();
        return value;
    }
}
