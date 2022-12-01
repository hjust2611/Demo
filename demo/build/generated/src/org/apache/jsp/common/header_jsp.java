package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset='utf-8'>\r\n");
      out.write("    <meta http-equiv='X-UA-Compatible' content='IE=edge'>\r\n");
      out.write("    <title>Page Title</title>\r\n");
      out.write("    <meta name='viewport' content='width=device-width, initial-scale=1'>\r\n");
      out.write("    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>\r\n");
      out.write("    <script src='main.js'></script>\r\n");
      out.write("<!--    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">-->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("            \r\n");
      out.write("            <a target=\"_blank\" href=\"img/f8.jpg\">\r\n");
      out.write("                <img src=\"img/f8.jpg\" alt=\"Northern Lights\" width=\"35\" height=\"35\">\r\n");
      out.write("              </a>   \r\n");
      out.write("              <a>\r\n");
      out.write("                Học Lập Trình Để Đi Làm\r\n");
      out.write("              </a>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo03\">\r\n");
      out.write("                <form class=\"search\">\r\n");
      out.write("                    <input class=\"form-control\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                    <!-- <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button> -->\r\n");
      out.write("                </form>\r\n");
      out.write("                <ul class=\"navbar-nav mr-auto mt-2 mt-lg-0\">\r\n");
      out.write("                    <a target=\"_blank\" href=\"img/lt.png\">\r\n");
      out.write("                        <img src=\"img/lt.png\" alt=\"Northern Lights\" width=\"40\" height=\"40\">\r\n");
      out.write("                      </a>   \r\n");
      out.write("                      <a target=\"_blank\" href=\"img/hoc.png\">\r\n");
      out.write("                        <img src=\"img/hoc.png\" alt=\"Northern Lights\" width=\"40\" height=\"40\">\r\n");
      out.write("                      </a>  \r\n");
      out.write("                      <a target=\"_blank\" href=\"img/bl.png\">\r\n");
      out.write("                        <img src=\"img/bl.png\" alt=\"Northern Lights\" width=\"40\" height=\"40\">\r\n");
      out.write("                      </a>  \r\n");
      out.write("                      <a target=\"_blank\" href=\"chooselogin.jsp\">\r\n");
      out.write("                        <img src=\"img/addbl.png\" alt=\"Northern Lights\" width=\"40\" height=\"40\">\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <a target=\"_blank\" href=\"logincontroller\">\r\n");
      out.write("                        Đăng Nhập\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <a target=\"_blank\" href=\"registercontroller\">\r\n");
      out.write("                        Đăng Kí\r\n");
      out.write("                      </a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
