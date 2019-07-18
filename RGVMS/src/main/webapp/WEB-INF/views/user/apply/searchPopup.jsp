<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

항목명 : <input type="text" name="subName"> &nbsp;&nbsp;&nbsp; <input type="submit" value="검색">

<table border="1">
	<tr>
		<th>NO</th>
		<th>분류</th>
		<th>영역</th>
		<th>항목명</th>
		<th>점수</th>
	</tr>
	<c:forEach items="${subList}" var="sVo" varStatus="listStat">
		<tr>
			<td>
			${listStat.count}
			</td>
			<td>${sVo.categ}</td>
			<td>${sVo.area}</td>
			<td><a href="#" onclick="sendData('${sVo.subNo}', '${sVo.categ}', '${sVo.area}', '${sVo.subName}', '${sVo.score}', '${sVo.guide}')">${sVo.subName}</a></td>
			<c:if test="${sVo.score eq '0'}">
			<td>
			-
			<%-- <c:out value="${sVo.score ne '0' ? '-' :}"></c:out> --%>
			</td>
			</c:if>
			<c:if test="${sVo.score ne '0'}">
			<td>
			${sVo.score}
			</td>
			</c:if>
		</tr>
	</c:forEach>
	

</table>


</body>
<script type="text/javascript">
function sendData(subNo, categ, area, subName, score, guide){
	opener.document.frm.subNo.value = subNo;
	opener.document.frm.categ.value = categ;
	opener.document.frm.area.value = area;
	opener.document.frm.subName.value = subName;
	opener.document.frm.score.value = score;
	opener.document.frm.guide.value = guide;
	
	window.close();
	
}
</script>
</html>