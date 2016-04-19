import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 47257165p on 05/04/16.
 */
public class Controller extends HttpServlet{

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("Text/html");
        PrintWriter printWriter= resp.getWriter();

        String value = req.getParameter("value");
        int charValue = 0;
        String transformed = "";
        printWriter.print("<h1>FRASE INICIAL: "+value+"</h1>");

        //función para crear el cesar y postearlo por cada cesar que queramos. para añadir más simplemente cambiar el 26 por el número de cesars deseados
        for (int i = 1; i < 26; i++)
        {
            for (int e = 0; e < value.length(); e++)
            {
                charValue = value.charAt(e);
                transformed += String.valueOf( (char) (charValue + i));
            }
            printWriter.print("<h1>CESAR +"+i+" "+transformed+"</h1>");
            transformed = "";
        }
    }
}
