<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴 사이트</title>
<link rel="stylesheet" type="text/css" href="./css/MyPage.css">
</head>
<body>
	
	<script>
		window.onload = function() {
	    		var isError = <%=request.getParameter("error") %>;
	    		console.log(isError);
	    		if(isError) {
	    			alert("아이디 또는 비밀번호가 일치하지 않습니다.");
	    		}
	    	}
	</script>	
        <header>
            <div class="use_list_box">
                <div class="use_list">
                        <a href="메인페이지로 이동" class="use_main">
                            <span><img src="./img/로고.png" class="logo"></span>
                        </a>
                    <ul class="use">
                        <li>
                            <a href="메인페이지로 이동" class="use_logout" title="로그아웃">
                                <span><img src="./img/logout.png" class="logout"><br>LOGOUT</span>
                            </a>
                        </li>
                        <li>
                            <a href="마이페이지로 이동" class="use_mypage" title="마이페이지">
                                <span><img src="./img/유저.png" class="user"><br>MY</span>
                            </a>
                        </li>
                        <li>
                            <a href="찜 매물 조회로 이동" class="use_likelist" title="찜매물">
                                <span><img src="./img/찜.png" class="like"><br>찜</span>
                            </a>
                        </li>
                    </ul>

                </div>

            </div>
        </header>
        <section>
            <nav class="left_category">
                <div class="mypage" ><img src="./img/마이페이지_아이콘.png" alt="마이페이지 아이콘">
                        마이페이지</div>
                <ul>
                    <li><a href="IdCheck.jsp">내정보</a></li>
                    <li><a href="MyPageLikeList.jsp">찜한 매물</a></li>
                    <li>내 문의내역</li>
                    <li onclick="location.href='myPageIntermediaryAdd.jsp'">중개인 등록</li>
                    <li style="color: #5887d6;"><a href="deleteUser.jsp">회원탈퇴</a></li>
                </ul>
                <hr>
            </nav>
        </section>
            <article class="main">
                <h1 class="delete">회원탈퇴</h1><br>
                <hr class="width_line">
                
                <div class="dleletUser_box"> 
                    <img src="./img/회원탈퇴.png" alt="확인이미지">
                    <form action="DeleteUserServlet" method="post">
                    <div id="deleteUserCheck">    
                        <div id="deleteUserInfo">
                            <label for="ID">아이디 : </label>
                            <input type="text" placeholder="아이디 입력해주세요." id="ID" name="ID" required><br>
                            <label for="PASSWORD">비밀번호 : </label>
                            <input type="PASSWORD" placeholder="비밀번호 입력해주세요." id="PASSWORD" name="PASSWORD" required><br><br>
                          
                            <button type="submit" id="deleteButton">회원탈퇴</button>
                        <!--<input type="submit" value="회원탈퇴" id="deleteButton">-->
                        <!-- ******위에 input 대신 button으로 수정함 참고***** -->
                              
                        </div>
                    </div>
                </form>
                </div>
            </article>
    </body>
</html>