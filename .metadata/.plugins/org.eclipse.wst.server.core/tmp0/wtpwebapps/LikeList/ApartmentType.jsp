<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>    
<%@ page import ="com.kh.semi.likeList.LikeRealestate" %>
<%@ page import ="com.kh.semi.likeList.LikeListDAO" %>
<%@ page import ="com.kh.semi.likeList.ApartmentTypeDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>마이페이지 찜한 매물</title>
<link rel="stylesheet" type="text/css" link href="LikeList.css">
</head>
<body>
	        <header>
            <div class="use_list_box">
                <div class="use_list">
                    <p>
                        <a href="메인페이지로 이동" class="use_main" onclik>
                            <span><img src="./img/로고.png" class="logo"></span>
                        </a>
                    </p>
                    <ul class="use">
                        <li>
                            <a href="메인페이지로 이동" class="use_logout" title="로그아웃" onclik>
                                <span><img src="./img/logout.png" class="logout"><br>LOGOUT</span>
                            </a>
                        </li>
                        <li>
                            <a href="마이페이지로 이동" class="use_mypage" title="마이페이지" onclik>
                                <span><img src="./img/회원가입3.png" class="user"><br>MY</span>
                            </a>
                        </li>
                        <li>
                            <a href="찜 매물 조회로 이동" class="use_likelist" title="찜매물" onclik>
                                <span><img src="./img/찜.png" class="like"><br>찜</span>
                            </a>
                        </li>
                    </ul>

                </div>

            </div>
        </header>
        <section>
            <nav class="left_category">
                <ul>
                    <li class="mypage" ><img src="./img/마이페이지_아이콘.png" alt="마이페이지 아이콘">
                        마이페이지</li>
                    <li>내정보</li>
                    <li><a href="MyPageLikeList.jsp">찜한 매물</a></li>
                    <li>내 문의내역</li>
                    <li>중개인 등록</li>
                    <li>회원탈퇴</li>
                </ul>
                <hr>
            </nav>
            <article class="main">
                <h1 class="LikeList">찜한 매물</h1><br>
                <hr style="width: 96%;">
                

                <div class="type_box">
                    <div class="type_list">
                        <ul class="type">
                            <li><a href="MyPageLikeList.jsp">전체매물</a></li>
                            <li><a href="ApartmentType.jsp" style="color: #6190E8;">아파트</a></li>
                            <li><a href="VillaType.jsp">빌라</a></li>
                            <li>오피스텔</li>
                            <li><a href="OneRoomType.jsp">원룸</a></li>
                            <li>주택</li>
                        </ul>
                        <hr style="width: 96%;">
                    </div>
                </div>
                
                <div class="realestate_area">
                    <div class="realestate_box">
                        <div class="realestate_list">
                            <ul class="realestate">
    <% 
    ApartmentTypeDAO apartmentTypeDAO = new ApartmentTypeDAO();
	    List<LikeRealestate> LikeRealestates = apartmentTypeDAO.getAllLikeRealestates();
	    
	    for(LikeRealestate l : LikeRealestates) {
	%>                  
					        <li>
					        <a href="매물 상세정보로 전환">
								    <%= l.getRealestateName() %><br>
								    <%= l.getRealestateType() %><br>
								    <%= l.getRealestateCondition() %><br>
								    <%= l.getRealestateSaleprice() %><br>
								    <%= l.getRealestateMonthly() %><br>
								    <%= l.getRealestateArea() %><br>
								    <%= l.getFloors() %><br><br>
					        </a>
					        </li>                   
	<% 
	    }
	%>
                            </ul>
                        </div>
                    </div>
                </div>
            </article>
    </div>
</body>
</html>