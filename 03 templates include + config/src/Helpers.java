import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class Helpers {

    public static void render(HttpServletRequest request,
                              HttpServletResponse response,
                              String path,
                              Map<String, Object> root) {


        Configuration cfg = FreeMarkerConfig.getConfig(request);
        try {
            System.out.println(cfg);
            Template tmpl = cfg.getTemplate(path);
            try {
                tmpl.process(root, response.getWriter());
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
