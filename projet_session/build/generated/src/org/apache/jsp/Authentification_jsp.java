package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Authentification_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("      <script src=\"https://cdn.tailwindcss.com\"></script>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <section class=\"bg-sky-100 min-h-screen flex items-center justify-center\">\n");
      out.write("  <!-- login container -->\n");
      out.write("  <div class=\"bg-gray-100 flex rounded-2xl shadow-2xl max-w-3xl p-5 items-center\">\n");
      out.write("    <!-- form -->\n");
      out.write("    <div class=\"md:w-1/2 px-8 md:px-16\">\n");
      out.write("      <h2 class=\"font-bold text-2xl text-[#002D74]\">Authentification</h2>\n");
      out.write("      <p class=\"text-xs mt-4 text-[#002D74]\">Si vous êtes déjà membre, connectez-vous facilement</p>\n");
      out.write("\n");
      out.write("      <form action=\"AuthentificationController\" class=\"flex flex-col gap-4\">\n");
      out.write("          <input class=\"p-2 mt-8 rounded-xl border\" type=\"email\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("       \n");
      out.write("        <div class=\"relative\">\n");
      out.write("          <input class=\"p-2 rounded-xl border w-full\" type=\"password\" name=\"password\" placeholder=\"Password\" required>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("          <input type=\"submit\" name=\"submit\" value=\"Se connecter\" class=\"text-sm text-white  px-3 py-1 md:mt-8  border-2 border-sky-400 rounded-xl text-white bg-[#002D74] hover:text-sky-500 hover:border-sky-500 hover:bg-white hover:border-2 py-2 hover:scale-105 duration-300\" />\n");
      out.write("       \n");
      out.write("      </form>\n");
      out.write("    \n");
      out.write("\n");
      out.write("      <div class=\"  py-2 w-full rounded-xl mt-5 flex \">\n");
      out.write("        ");

                        if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("                        <div class=\"col-span-3 flex justify-center text-red-500\">");
      out.print( request.getParameter("msg"));
      out.write("</div>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mt-5 text-xs border-b border-[#002D74] py-4 text-[#002D74] \">\n");
      out.write("          <div class=\"hover:-translate-y-1 hover:font-bold duration-300\">\n");
      out.write("              <a href=\"passoublie.jsp\" class=\" hover:text-sky-400 \"><u>Mot de passe oublié</u></a>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"mt-3 text-xs flex justify-between items-center text-[#002D74]\">\n");
      out.write("        <p>Créer un compte ?</p>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("     <a href=\"Inscription.jsp\" class=\"py-2 px-5 bg-white border rounded-xl hover:scale-110 duration-300\">S'inscrire</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- image -->\n");
      out.write("    <div class=\"md:block hidden w-1/2\">\n");
      out.write("        <img class=\"rounded-2xl\" src=\"silas-schneider-6Iy8QtLv9Yw-unsplash.jpg\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
