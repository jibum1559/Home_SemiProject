<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="./css/MyPage.css">
        <title>마이페이지 메인화면</title> <!-- mypage_main.html -->
        <meta charset="UTF-8">
    </head>
    <body>
        <header>
            <div class="use_list_box">
                <div class="use_list">
                        <a href="Main.jsp" class="use_main">
                            <span><img src="./img/로고.png" class="logo"></span>
                        </a>
                    <ul class="use">
                        <li>
                            <a href="logout.jsp" class="use_logout" title="로그아웃">
                                <span><img src="./img/logout.png" class="logout"><br>LOGOUT</span>
                            </a>
                        </li>
                        <li>
                            <a href="MyPage.jsp" class="use_mypage" title="마이페이지">
                                <span><img src="./img/유저.png" class="user"><br>MY</span>
                            </a>
                        </li>
                        <li>
                            <a href="MyPageLikeList.jsp" class="use_likelist" title="찜매물">
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
                    <li><a href="deleteUser.jsp">회원탈퇴</a></li>
                </ul>
                 <hr>
            </nav>
        </section>
            <article class="main">
                <h1 class="recent">최근 본 매물</h1><br>
                <hr class="width_line">
                
                <div class="realestate_area">
                    <div class="realestate_box">
                        <div class="realestate_list">
                            <ul class="realestate">
                                <li>
                                <a href="매물 상세정보로 전환">
                                최근 본 매물 정보
                                </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </article>
    </body>
</html>