<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="./css/styles.css">
		<meta charset="utf-8">
		<title>회원가입 성공</title>
	</head>
	<body>
		<div class="register_success">
			<img src="./img/join1.png" alt="">  
			<img src="./img/join2.png" alt="">  
			<img src="./img/join3.png" alt="">  
			<img src="./img/join4.png" alt=""><br>    
				<p>가입 완료! <%= session.getAttribute("ID") %>님!<br> 드루와방의 회원이 되신 것을 환영합니다.^^</p>  
		</div>
	<script>
		

		// 이미지를 차례대로 표시하는 함수
		function showImagesSequentially() {
        var images = document.querySelectorAll('.register_success img');
        var delay = 900; // 이미지 간의 딜레이 (0.5초)
        var index = 0;
        
        function showNextImage() {
          if (index < images.length) {
            images[index].style.opacity = 1;
            index++;
            setTimeout(showNextImage, delay);
          }
        }
        
        showNextImage();
      }
      
      // 페이지가 로드되면 이미지를 순차적으로 표시
      window.onload = function() {
        showImagesSequentially();
      };

	</script>
	</body>
</html>