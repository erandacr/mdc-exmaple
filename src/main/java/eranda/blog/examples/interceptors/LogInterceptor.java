package eranda.blog.examples.interceptors;

import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

public class LogInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
    UUID requestId = UUID.randomUUID();
    MDC.clear();
    MDC.put("requestId", String.valueOf(requestId));
    return true;
  }

}
