import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 47257165p on 21/04/16.
 */
public class Color extends HttpServlet{

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("Text/html");
        PrintWriter printWriter= resp.getWriter();

        String value = req.getParameter("value");

        switch (value)
        {
            case "blanco":
            {
                printWriter.print(toPost("white", "blanco", "black"));
                break;
            }
            case "negro":
            {
                printWriter.print(toPost("black", "negro", "white"));
                break;
            }
            case "amarillo":
            {
                printWriter.print(toPost("yellow", "amarillo", "black"));
                break;
            }
            case "rojo":
            {
                printWriter.print(toPost("red", "rojo", "black"));
                break;
            }
            case "lila":
            {
                printWriter.print(toPost("purple", "lila", "black"));
                break;
            }
            case "azul":
            {
                printWriter.print(toPost("blue", "azul", "white"));
                break;
            }
            case "verde":
            {
                printWriter.print(toPost("green", "verde", "white"));
                break;
            }
            default:
            {
                printWriter.print(noExiste());
                break;
            }
        }
    }

    private static String toPost (String color, String colorEsp, String bgColor)
    {

        return "<body bgcolor=\""+bgColor+"\">\n" +
                "<h1>La vida en colores!</h1>\n" +
                "<h1 style=\"color:"+color+"\">Esto es "+colorEsp+"</h1>\n" +
                "<input name =\"button\" type=\"submit\" value=\"Volver!!\" onclick=\"location.href='./color.jsp'\"/>" +
                "\n" +
                "</body>";
    }

    private static String noExiste ()
    {

        return "<body bgcolor=\"white\">\n" +
                "<h1>La vida en colores!</h1>\n" +
                "<h1 style=\"color:black\">No sé cómo es este color :S!</h1>\n" +
                "<img src=\"imagen.jpg\">\n" +
                "<br><br>\n" +
                "<input name =\"button\" type=\"submit\" value=\"Volver!!\" onclick=\"location.href='./color.jsp'\"/>\n" +
                "\n" +
                "</body>";
    }
}