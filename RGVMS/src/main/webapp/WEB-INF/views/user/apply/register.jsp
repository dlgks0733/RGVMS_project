<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" name="frm">
<input type="hidden" name="subNo">
분류 : <input type="text" name="categ" disabled="disabled"> &nbsp;&nbsp;&nbsp; 영역 : <input type="text" name="area" disabled="disabled">
<br>
<br>
항목명 : <input type="text" name="subName" readonly="readonly" id="subPopup" onclick="subPopUp()"> &nbsp;&nbsp;&nbsp; 점수 : <input type="text" name="score" disabled="disabled">
<br>
<br>
안내사항 : <br>
<textarea name="guide" style="margin: 0px; width: 467px; height: 92px;" disabled="disabled">
</textarea>
<br>
<br>
일련번호 : <input type="text" name="serialNum"> &nbsp;&nbsp;&nbsp; 취득일자 : <input type="text">
<br>
<br>
상세내용
<br>
<textarea name="content" style="margin: 0px; width: 467px; height: 92px;">
</textarea>
</form>
</body>
<script>

function subPopUp(){
	var url = "searchPopup";
	var name = "항목 검색";
	var option = "width = 500, height = 500, top = 100, left = 200, location = no";
	window.open(url, name, option);
}

// $("#subPopup").click(function(){
// 	var url = "/searchPopup";
//     var name = "항목 검색";
//     var option = "width = 500, height = 500, top = 100, left = 200, location = no";
//     window.open(url, name, option);
// });

</script>
</html>