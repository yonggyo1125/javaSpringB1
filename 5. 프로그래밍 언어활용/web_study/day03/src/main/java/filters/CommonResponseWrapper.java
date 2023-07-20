package filters;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {

    public CommonResponseWrapper(HttpServletResponse response) {
        super(response);

        // 응답 후 공통 기능
        System.out.println("공통 기능 정의...");
    }
}
