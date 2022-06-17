package servlet;

import bo.BOFactory;
import bo.custom.impl.customerBoImpl;
import dto.customerDTO;

import javax.annotation.Resource;
import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/customer")
public class customerServlet extends HttpServlet {

    public static DataSource ds;

    customerBoImpl customerBo= (customerBoImpl) BOFactory.BOFactory().getBO(BOFactory.BOType.CUSTOMER);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        double salary = Double.parseDouble(req.getParameter("salary"));
        customerDTO customerDTO = new customerDTO(id, name, address, salary);
        PrintWriter writer = resp.getWriter();

            try {
                if (customerBo.addCustomer(customerDTO)) {
                    JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
                    resp.setStatus(HttpServletResponse.SC_CREATED);
                    objectBuilder.add("status", 200);
                    objectBuilder.add("message", "Successfully added..");
                    objectBuilder.add("data", " ");
                    writer.print(objectBuilder.build());
                }
            } catch (SQLException e) {
                JsonObjectBuilder response = Json.createObjectBuilder();
                resp.setStatus(HttpServletResponse.SC_OK);
                response.add("status", 400);
                response.add("message", "error");
                response.add("data", e.getLocalizedMessage());
                writer.print(response.build());
                e.printStackTrace();
            }


    }
}
