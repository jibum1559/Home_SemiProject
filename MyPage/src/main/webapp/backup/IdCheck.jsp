<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <title>���������� �� ���� ID Ȯ��ȭ��</title> 
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/Idcheck.css">

    </head>
    <body>
    <form action="UserIdCheckServlet" method="post">
        <header>
            <div class="use_list_box">
                <div class="use_list">
                    <p>
                        <a href="������������ �̵�" class="use_main">
                            <span><img src="./img/�ΰ�.png" class="logo"></span>
                        </a>
                    </p>
                    <ul class="use">
                        <li>
                            <a href="������������ �̵�" class="use_logout" title="�α׾ƿ�">
                                <span><img src="./img/logout.png" class="logout"><br>LOGOUT</span>
                            </a>
                        </li>
                        <li>
                            <a href="MyPage.jsp" class="use_mypage" title="����������">
                                <span><img src="./img/����.png" class="user"><br>MY</span>
                            </a>
                        </li>
                        <li>
                            <a href="MyPageLikeList.jsp" class="use_likelist" title="��Ź�">
                                <span><img src="./img/��.png" class="like"><br>��</span>
                            </a>
                        </li>
                    </ul>

                </div>

            </div>
        </header>
        <section>
            <nav class="left_category">
                <ul>
                    <li class="mypage" ><img src="./img/����������_������.png" alt="���������� ������">
                        ����������</li>
                    <li style="color: #5887d6;"><a href="IdCheck.jsp">������</a></li>
                    <li><a href="MyPageLikeList.jsp">���� �Ź�</a></li>
                    <li>�� ���ǳ���</li>
                    <li>�߰��� ���</li>
                    <li>ȸ��Ż��</li>
                </ul>
                <hr>
            </nav>
		</section>
            <article class="main">
                <h1 class="myinfo">�� ����</h1><br>
                <hr style="width: 96%;">
                
                <div class="info_box">
                    <img src="./img/���̵�Ȯ��.png" alt="Ȯ���̹���">
                    <div class="user_info">
                        <div class="user_check">
                            <label for="userid">���̵� :</label>
                            <input type="text" id="userid" name="userid" placeholder=" ���̵� �Է����ּ���." required><br>
                            <label for="password">��й�ȣ :</label>
                            <input type="password" id="password" name="password" placeholder=" ��й�ȣ �Է����ּ���." required><br><br>
                            <button type="submit" id="usercheck">Ȯ ��</button>                      
                            <!--<input type="submit" id="usercheck" value="Ȯ��"> -->                  
                              
                             <% String message = (String) request.getAttribute("message");
			                   if (message != null) { %>
			               	 <div class="error_message">
			                    <%= message %>
			               	 </div>  
                             <% } %> 
                        </div>
                    </div>
                </div>
            </article>
            </form>
    </body>
</html>