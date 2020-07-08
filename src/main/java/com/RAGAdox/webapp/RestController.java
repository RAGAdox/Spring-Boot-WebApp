package com.RAGAdox.webapp;

import com.RAGAdox.webapp.Domain.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/rest")
    public String index(){
        return "Hii Boot";
    }
    @RequestMapping("/functionCall")
    public void functionCall(HttpServletResponse response) throws IOException {
        System.out.println("\n\n\n there was a function called \n\n\n");
        

        //jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS beers(name VARCHAR(100))");
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS beers(name VARCHAR(100));INSERT INTO beers VALUES ('Rishi');INSERT INTO beers VALUES ('RAGAdox')");
        jdbcTemplate.execute("INSERT INTO beers VALUES ('Stella')");
        List<Beer> beers = jdbcTemplate.query("SELECT * FROM beers", (resultSet, rowNum) -> new Beer(resultSet.getString("name")));
        beers.forEach(System.out::println);
        response.sendRedirect("/rest");
    }

}
