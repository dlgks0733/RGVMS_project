<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>MIS 출결 관리 항목</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta
	content="A fully featured admin theme which can be used to build CRM, CMS, etc."
	name="description" />
<meta content="Coderthemes" name="author" />
<!-- App favicon -->
<link rel="shortcut icon"
	href="../../../../resources/dist/assets/images/favicon.ico">

<!-- inline style to handle loading of various element-->
<style>
body.loading {
	visibility: hidden;
}
</style>

<!-- App css -->
<link href="../../../../resources/dist/assets/css/icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="../../../../resources/dist/assets/css/app.min.css"
	rel="stylesheet" type="text/css" id="main-style-container" />

</head>

<body class="loading">
	<!-- Begin page -->
	<div class="wrapper">

		<div id="vertical-sidebar-placeholder"></div>

		<!-- ============================================================== -->
		<!-- Start Page Content here -->
		<!-- ============================================================== -->

		<div class="content-page">
			<div class="content">

				<div id="vertical-topbar-placeholder"></div>

				<!-- Start Content-->
				<div class="container-fluid">

					<!-- start page title -->
					<div class='box-body'>			
							<br><br>
								<div class="row mb-2">
										<div class="col-lg-8">
											<form class="form-inline">
												<div class="form-group mx-sm-3 mb-2">
													<label for="status-select" class="mr-2">분류</label> 
													<select name="searchType" class="custom-select" id="status-select">
														<option value=""
															<c:out value="${cri.searchType == null?'selected':''}"/>>
															전체</option>
														<option value="t"
															<c:out value="${cri.searchType eq 't'?'selected':''}"/>>제목
														</option>
														<option value="m"
															<c:out value="${cri.searchType eq 'm'?'selected':''}"/>>회차
														</option>
													</select>
												</div>
												<div class="form-group mb-2">
													<label for="inputPassword2" class="sr-only">Search</label>
													<input type="search" class="form-control" name="keyword" id="keywordInput" 
													value="${cri.keyword}" placeholder="검색어를 입력하세요.">
													<button type="button" id='searchBtn' class="btn btn-light">검색</button>
												</div>
											</form>
										</div>
										<!-- end col-->
									</div>
						


						<div class="row">
							<div class="col-12">
								<div class="page-title-box">
								</div>
							</div>
						</div>
						<!-- end page title -->
						<div class="row">
							<div class="col-xl-9">

								<div class="card">
									<div class="card-body">
										<div class="table-responsive-sm">
											<table class="table table-centered mb-0">
												<thead>
													<tr>
														<th>NO</th>
														<th>제목</th>
														<th>시행일</th>
														<th>등록일</th>

													</tr>
												</thead>
												<tbody>
													<c:forEach items="${list}" var="misVO" varStatus="status">
														<tr>
															<td>${(pageMaker.totalCount - status.index) -  (pageMaker.cri.page-1) * 10 }</td>
															<td><a
																href='modify${pageMaker.makeSearch(pageMaker.cri.page)}&misNo=${misVO.misNo}'>
																제${misVO.times}회 MISDAY ${misVO.title}</a></td>
															<td><fmt:formatDate pattern="yyyy-MM-dd" value ="${misVO.misDate}" /></td>	
															<td><fmt:formatDate pattern="yyyy-MM-dd" value ="${misVO.misRegdate}" /></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										
										 <div class="box-footer">
										 
										 <br><br>
	
						<!-- 페이징 -->
						<div class="text-align: center;">
							<ul class="pagination pagination-rounded" style="text-align: center;">
								<li class="page-item">
                            	   <a class="page-link" href="javascript: void(0);" aria-label="Previous">
                                   	<span aria-hidden="true">&laquo;</span>
                                  	 <span class="sr-only">Previous</span>
			                               </a>
			                          		 </li>

							<c:if test="${pageMaker.prev}">
								<li class="page-item"><a href="/admin/mis/list${pageMaker.makeSearch(pageMaker.startPage - 1) }" 
								class="page-link" >&laquo;</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
								<li class="page-item" 
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="/admin/mis/list${pageMaker.makeSearch(idx)}" 
									class="page-link" >${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li class="page-item" >
								<a href="/admin/mis/list${pageMaker.makeSearch(pageMaker.endPage +1) }" 
								class="page-link" >&raquo;</a></li>
							</c:if>
							
							 <li class="page-item"><a class="page-link" href="javascript: void(0);" aria-label="Next">
                                  <span aria-hidden="true">&raquo;</span>
                                  <span class="sr-only">Next</span>
                                                        	  </a>
                                                          </li>
													</ul>
												</div>
												
											<!-- 페이징 끝 -->
										</div>			
									</div>
								</div>
								
								<!-- 버튼 div -->
								<div style="text-align: right;">
									<button type="button" onclick="location.href='register'"
										class="btn btn-primary">등록</button>
									</div>

							</div>
						</div>
						<!-- end col-12 -->
					</div>
					<!-- end row -->
				</div>
				<!-- container -->

			</div>
			<!-- content -->

			<!-- Footer Start -->
			<footer class="footer">
				<div class="container-fluid">
					<div class="row">
						<div class="col-md-6">2018 - 2019 © Hyper - Coderthemes.com</div>
						<div class="col-md-6">
							<div class="text-md-right footer-links d-none d-md-block">
								<a href="javascript: void(0);">About</a> <a
									href="javascript: void(0);">Support</a> <a
									href="javascript: void(0);">Contact Us</a>
							</div>
						</div>
					</div>
				</div>
			</footer>
			<!-- end Footer -->

		</div>

		<!-- ============================================================== -->
		<!-- End Page content -->
		<!-- ============================================================== -->


	</div>
	<!-- END wrapper -->


	<!-- App js -->
	<script src="../../../../resources/dist/assets/js/app_admin.js"></script>

	<!-- third party js -->
	<script
		src="../../../../resources/dist/assets/js/vendor/jquery-ui.min.js"></script>
	<script
		src="../../../../resources/dist/assets/js/vendor/fullcalendar.min.js"></script>
	<!-- third party js ends -->

	<!-- demo app -->
	<script
		src="../../../../resources/dist/assets/js/pages/demo.calendar.js"></script>
	<!-- end demo js-->


	<script>
		var result = '${msg}';
	
		if (result == 'REGISTER') {
			alert("등록 되었습니다.");
		}
		
		var result = '${msg}';
		
		if (result == 'MODIFY') {
			alert("수정 되었습니다.");
		}
		
		var result = '${msg}';
		
		if (result == 'REMOVE') {
			alert("삭제 되었습니다.");
		}
	</script>
	
	<script>
		$(document).ready(
				function() {
	
					$('#searchBtn').on(
							"click",
							function(event) {
	
								self.location = "list"
										+ '${pageMaker.makeQuery(1)}'
										+ "&searchType="
										+ $("select option:selected").val()
										+ "&keyword=" + $('#keywordInput').val();
	
							});
	
				});
	</script>


	<script>
		$(document).ready(function() {
			$("#detached-check input:radio").click(function() {

				alert("clicked");
			});

			$("input:radio:first").prop("checked", true).trigger("click");

		});
	</script>
</body>
</html>