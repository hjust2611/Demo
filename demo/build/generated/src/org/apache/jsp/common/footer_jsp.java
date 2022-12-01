package org.apache.jsp.common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("<footer class=\"text-center text-lg-start bg-white text-muted\">\r\n");
      out.write("  <!-- Section: Social media -->\r\n");
      out.write("  <section class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\r\n");
      out.write("    <!-- Left -->\r\n");
      out.write("<!--    <div class=\"me-5 d-none d-lg-block\">\r\n");
      out.write("      <span>Get connected with us on social networks:</span>\r\n");
      out.write("    </div>-->\r\n");
      out.write("    <!-- Left -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Right -->\r\n");
      out.write("    <div>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-facebook-f\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-twitter\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-google\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-instagram\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-linkedin\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a href=\"\" class=\"me-4 link-secondary\">\r\n");
      out.write("        <i class=\"fab fa-github\"></i>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- Right -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- Section: Social media -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Section: Links  -->\r\n");
      out.write("  <section class=\"\">\r\n");
      out.write("    <div class=\"container text-center text-md-start mt-5\">\r\n");
      out.write("      <!-- Grid row -->\r\n");
      out.write("      <div class=\"row mt-3\">\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\r\n");
      out.write("          <!-- Content -->\r\n");
      out.write("          <h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("            <i class=\"fas fa-gem me-3 text-secondary\"></i>Company name\r\n");
      out.write("          </h6>\r\n");
      out.write("          <p>\r\n");
      out.write("            Here you can use rows and columns to organize your footer content. Lorem ipsum\r\n");
      out.write("            dolor sit amet, consectetur adipisicing elit. This is footer!!!\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("        <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("          <!-- Links -->\r\n");
      out.write("          <h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("            Products\r\n");
      out.write("          </h6>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Angular</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">React</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Vue</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Laravel</a>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\r\n");
      out.write("          <!-- Links -->\r\n");
      out.write("          <h6 class=\"text-uppercase fw-bold mb-4\">\r\n");
      out.write("            Useful links\r\n");
      out.write("          </h6>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Pricing</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Settings</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Orders</a>\r\n");
      out.write("          </p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <a href=\"#!\" class=\"text-reset\">Help</a>\r\n");
      out.write("          </p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\r\n");
      out.write("          <!-- Links -->\r\n");
      out.write("          <h6 class=\"text-uppercase fw-bold mb-4\">Contact</h6>\r\n");
      out.write("          <p><i class=\"fas fa-home me-3 text-secondary\"></i> New York, NY 10012, US</p>\r\n");
      out.write("          <p>\r\n");
      out.write("            <i class=\"fas fa-envelope me-3 text-secondary\"></i>\r\n");
      out.write("            info@example.com\r\n");
      out.write("          </p>\r\n");
      out.write("          <p><i class=\"fas fa-phone me-3 text-secondary\"></i> + 01 234 567 88</p>\r\n");
      out.write("          <p><i class=\"fas fa-print me-3 text-secondary\"></i> + 01 234 567 89</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Grid column -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- Grid row -->\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- Section: Links  -->\r\n");
      out.write("\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("  <div class=\"text-center p-4\" style=\"background-color: rgba(0, 0, 0, 0.025);\">\r\n");
      out.write("    © 2021 Copyright:\r\n");
      out.write("    <a class=\"text-reset fw-bold\" href=\"https://mdbootstrap.com/\">MDBootstrap.com</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Copyright -->\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("    </body>\r\n");
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
