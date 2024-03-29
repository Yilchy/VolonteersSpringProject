package ua.edu.sumdu.volonteerProject.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import ua.edu.sumdu.volonteerProject.errors.InvalidLoginResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        log.error("error with login occured: ", authException);
        InvalidLoginResponse invalidLoginResponse = new InvalidLoginResponse();
        String jsonResponse = new ObjectMapper().writeValueAsString(invalidLoginResponse);
        response.setContentType("application/json");
        response.setStatus(401);
        response.getWriter().print(jsonResponse);
    }
}
