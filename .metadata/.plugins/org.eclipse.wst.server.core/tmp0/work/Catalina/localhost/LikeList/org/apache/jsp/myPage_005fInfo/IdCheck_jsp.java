/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-11-14 16:18:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.myPage_005fInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IdCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>마이페이지 내 정보 ID 확인화면</title> \r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/Idcheck.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"use_list_box\">\r\n");
      out.write("                <div class=\"use_list\">\r\n");
      out.write("                    <p>\r\n");
      out.write("                        <a href=\"메인페이지로 이동\" class=\"use_main\">\r\n");
      out.write("                            <span><img src=\"../img/로고.png\" class=\"logo\"></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <ul class=\"use\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"메인페이지로 이동\" class=\"use_logout\" title=\"로그아웃\">\r\n");
      out.write("                                <span><img src=\"../img/logout.png\" class=\"logout\"><br>LOGOUT</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"마이페이지로 이동\" class=\"use_mypage\" title=\"마이페이지\">\r\n");
      out.write("                                <span><img src=\"../img/유저.png\" class=\"user\"><br>MY</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"찜 매물 조회로 이동\" class=\"use_likelist\" title=\"찜매물\">\r\n");
      out.write("                                <span><img src=\"../img/찜.png\" class=\"like\"><br>찜</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <section>\r\n");
      out.write("            <nav class=\"left_category\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"mypage\" ><img src=\"../img/마이페이지_아이콘.png\" alt=\"마이페이지 아이콘\">\r\n");
      out.write("                        마이페이지</li>\r\n");
      out.write("                    <li style=\"color: #5887d6;\"><a href=\"IdCheck.jsp\">내정보</a></li>\r\n");
      out.write("                    <li><a href=\"../MyPageLikeList.jsp\">찜한 매물</a></li>\r\n");
      out.write("                    <li>내 문의내역</li>\r\n");
      out.write("                    <li>중개인 등록</li>\r\n");
      out.write("                    <li>회원탈퇴</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <hr>\r\n");
      out.write("            </nav>\r\n");
      out.write("		</section>\r\n");
      out.write("            <article class=\"main\">\r\n");
      out.write("                <h1 class=\"myinfo\">내 정보</h1><br>\r\n");
      out.write("                <hr style=\"width: 96%;\">\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"info_box\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"user_info\">\r\n");
      out.write("                        <div class=\"user_check\">\r\n");
      out.write("                            <label for=\"userid\">아이디 :</label>\r\n");
      out.write("                            <input type=\"text\" id=\"userid\" name=\"userid\" placeholder=\" 아이디 입력해주세요.\" required><br>\r\n");
      out.write("                            <label for=\"password\">비밀번호 :</label>\r\n");
      out.write("                            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\" 비밀번호 입력해주세요.\" required><br><br>\r\n");
      out.write("                            <button type=\"submit\" id=\"usercheck\">확 인</button>                                \r\n");
      out.write("                               \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </article>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
