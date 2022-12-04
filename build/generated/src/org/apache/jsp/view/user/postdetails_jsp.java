package org.apache.jsp.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class postdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Post Details</title>\r\n");
      out.write("        <!-- Bootstrap 5 CSS -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link href=\"css/postdetails.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"col-md-8 order-md-1\">\r\n");
      out.write("            <h2>Post Details</h2>\r\n");
      out.write("            <form class=\"needs-validation\" method=\"post\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"username\">Title</label>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <div class=\"input-group-prepend\">\r\n");
      out.write("                            <span class=\"input-group-text\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Input title\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"email\">Excerpt <span class=\"text-muted\"></span></label>\r\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Input excerpt\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!--                <div class=\"col-md-5 mb-3\">\r\n");
      out.write("                                    <label for=\"country\">Category</label>\r\n");
      out.write("                                    <select class=\"custom-select d-block w-100\" id=\"country\" required>\r\n");
      out.write("                                        <option value=\"\">Choose...</option>\r\n");
      out.write("                                        <option>Study</option>\r\n");
      out.write("                                        <option>Tu add</option>\r\n");
      out.write("                                    </select>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div class=\"col-md-4\">\r\n");
      out.write("                                        <div class=\"custom-file\">\r\n");
      out.write("                                            <label class=\"custom-file-label text-left\" for=\"customFile\">Choose image to upload</label>\r\n");
      out.write("                                            <input type=\"file\" class=\"custom-file-input\" id=\"customFile\" multiple lang=\"ar\" dir=\"rtl\"\">\r\n");
      out.write("                \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <script type=\"text/javascript\">\r\n");
      out.write("                                        $('.custom-file input').change(function (e) {\r\n");
      out.write("                                            var files = [];\r\n");
      out.write("                                            for (var i = 0; i < $(this)[0].files.length; i++) {\r\n");
      out.write("                                                files.push($(this)[0].files[i].name);\r\n");
      out.write("                                            }\r\n");
      out.write("                                            $(this).next('.custom-file-label').html(files.join(', '));\r\n");
      out.write("                                        });\r\n");
      out.write("                                    </script>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <h4 class=\"mb-3\">Status</h4>\r\n");
      out.write("                \r\n");
      out.write("                                <div class=\"d-block my-3\">\r\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\r\n");
      out.write("                                        <input id=\"credit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" checked required>\r\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"credit\">Draft</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\r\n");
      out.write("                                        <input id=\"debit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\r\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"debit\">Published</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\r\n");
      out.write("                                        <input id=\"paypal\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\r\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"paypal\">UnPublished</label>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"mb-3\">\r\n");
      out.write("                                    <label for=\"author\">Author</label>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Input author name\" required>\r\n");
      out.write("                                </div>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group\">\r\n");
      out.write("                    <div class=\"left\">\r\n");
      out.write("                        <div class=\"inputt\">\r\n");
      out.write("                            <label for=\"country\">Category</label>\r\n");
      out.write("                            <select class=\"custom-select d-block w-100\" id=\"country\" required>\r\n");
      out.write("                                <option value=\"\">Choose...</option>\r\n");
      out.write("                                <option>Study</option>\r\n");
      out.write("                                <option>Tu add</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"inputt\">\r\n");
      out.write("                            <label for=\"author\">Author</label>\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Input author name\" required>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"right\">\r\n");
      out.write("                        <div class=\"inputt\">\r\n");
      out.write("                            <label for=\"address\">User avatar</label>\r\n");
      out.write("                            <div class=\"avatar\"></div>\r\n");
      out.write("                            <input type=\"button\" value=\"Change\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group form-inline\">\r\n");
      out.write("                        <label class=\"control-label col-sm-3\" style=\"text-align:left;\" >Status:</label>\r\n");
      out.write("                        <div class=\"col-sm-6\">\t\r\n");
      out.write("                           <label class=\"radio-inline\">\r\n");
      out.write("                             \r\n");
      out.write("                           <input type=\"radio\" name=\"radio2\" id=\"radio0\" value=\"0\"  onchange=\"\" checked>Draft\r\n");
      out.write("                           </label>\r\n");
      out.write("                           <label class=\"radio-inline\">\r\n");
      out.write("                           <input type=\"radio\" name=\"radio2\" id=\"radio1\" value=\"200\"  onchange=\"\">Publish\r\n");
      out.write("                           </label>\r\n");
      out.write("                           <label class=\"radio-inline\">\r\n");
      out.write("                           <input type=\"radio\" name=\"radio2\" id=\"radio2\" value=\"300\"  onchange=\"\">UnPublished\r\n");
      out.write("                           </label>\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb-3\">\r\n");
      out.write("                    <label for=\"tag\">Tag</label>\r\n");
      out.write("                    <div class=\"input-group\">\r\n");
      out.write("                        <div class=\"input-group-prepend\">\r\n");
      out.write("                            <span class=\"input-group-text\">*</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Input tag\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <label for=\"content\">Content</label>\r\n");
      out.write("                    <textarea\r\n");
      out.write("                        class=\"form-control\"\r\n");
      out.write("                        id=\"InputSubject\"\r\n");
      out.write("                        placeholder=\"Write something....\"\r\n");
      out.write("                        style=\"height: 200px\"\r\n");
      out.write("                        >\r\n");
      out.write("                    </textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Add</button>\r\n");
      out.write("                <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Update</button>\r\n");
      out.write("                <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Delete</button>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap 5 JavaScript Bundle with Popper -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
