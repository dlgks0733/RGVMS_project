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

						<select name="searchType">
							<option value="n"
								<c:out value="${cri.searchType == null?'selected':''}"/>>
								---</option>
							<option value="t"
								<c:out value="${cri.searchType eq 't'?'selected':''}"/>>제목
							</option>
						</select> <input type="text" name='keyword' id="keywordInput"
							value='${cri.keyword }'>
						<button id='searchBtn'>Search</button>


						<div class="row">
							<div class="col-12">
								<div class="page-title-box">

									<h3 class="page-title">MIS 출결 관리</h3>
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
													<c:forEach items="${list}" var="MisVO">
														<tr>
															<td>${MisVO.misNo}</td>
															<td><a
																href='read${pageMaker.makeSearch(pageMaker.cri.page)}&misNo=${MisVO.misNo}'>
																제${MisVO.times}회 MISDAY ${MisVO.title}</a></td>
															<td><fmt:formatDate pattern="yyyy-MM-dd" value ="${MisVO.misDate}" /></td>	
															<td><fmt:formatDate pattern="yyyy-MM-dd" value ="${MisVO.misRegdate}" /></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										
										 <div class="box-footer">
										 
										 <br><br>
						<div class="text-center">
							<ul class="pagination">

							<c:if test="${pageMaker.prev}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.startPage - 1) }">&laquo;</a></li>
							</c:if>

							<c:forEach begin="${pageMaker.startPage }"
								end="${pageMaker.endPage }" var="idx">
								<li
									<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
									<a href="list${pageMaker.makeSearch(idx)}">${idx}</a>
								</li>
							</c:forEach>

							<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
								<li><a
									href="list${pageMaker.makeSearch(pageMaker.endPage +1) }">&raquo;</a></li>
							</c:if>

						</ul>
					</div>

				</div>
										
									</div>
								</div>
								
								<!-- <div style="text-align: center;">
												 <nav>
                                                    <ul class="pagination pagination-rounded">
                                                        <li class="page-item">
                                                            <a class="page-link" href="javascript: void(0);" aria-label="Previous">
                                                                <span aria-hidden="true">&laquo;</span>
                                                                <span class="sr-only">Previous</span>
                                                            </a>
                                                        </li>
                                                        <li class="page-item"><a class="page-link" href="javascript: void(0);">1</a></li>
                                                        <li class="page-item"><a class="page-link" href="javascript: void(0);">2</a></li>
                                                        <li class="page-item active"><a class="page-link" href="javascript: void(0);">3</a></li>
                                                        <li class="page-item"><a class="page-link" href="javascript: void(0);">4</a></li>
                                                        <li class="page-item"><a class="page-link" href="javascript: void(0);">5</a></li>
                                                        <li class="page-item">
                                                            <a class="page-link" href="javascript: void(0);" aria-label="Next">
                                                                <span aria-hidden="true">&raquo;</span>
                                                                <span class="sr-only">Next</span>
                                                            </a>
                                                        </li>
                                                    </ul>
                                                </nav>
                                               </div>
                                                -->
                  
				
				
                                                
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
		$(document).ready(function() {
			$("#detached-check input:radio").click(function() {

				alert("clicked");

			});

			$("input:radio:first").prop("checked", true).trigger("click");

		});
	</script>
</body>
</html>