<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>관리자 페이지</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta
	content="A fully featured admin theme which can be used to build CRM, CMS, etc."
	name="description" />
<meta content="Coderthemes" name="author" />
<!-- App favicon -->
<link rel="shortcut icon"
	href="/resources/dist/assets/images/favicon.ico">

<!-- inline style to handle loading of various element-->
<style>
body.loading {
	visibility: hidden;
}
</style>

<!-- third party css -->
<link href="/resources/dist/assets/css/vendor/fullcalendar.min.css"
	rel="stylesheet" type="text/css" />
<!-- third party css end -->

<!-- App css -->
<link href="/resources/dist/assets/css/icons.min.css" rel="stylesheet"
	type="text/css" />
<link href="/resources/dist/assets/css/app.min.css" rel="stylesheet"
	type="text/css" id="main-style-container" />
	
<!-- javaScript -->
<script type="text/javascript">
	function subRegister() {
		location.href="/admin/subject/register";
	}
</script>

<!-- 개정안 부칙 팝업창띄우기 -->
<script type="text/javascript">
	function subRevised() {
		location.href="/admin/subject/revised";
	}
	
</script>
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
					<div class="row">
						<div class="col-12">
							<div class="page-title-box">
								<div class="page-title-right">
									<ol class="breadcrumb m-0">
										<li class="breadcrumb-item"><a
											href="javascript: void(0);">인증항목관리</a></li>
										<li class="breadcrumb-item active">인증항목목록</li>
									</ol>
								</div>
								<h4 class="page-title">인증항목목록</h4>
							</div>
						</div>
					</div>
					<!-- end page title -->

					<div class="row">
						<div class="col-12">
							<div class="card">
								<div class="card-body">
									<div class="row mb-2">
										<div class="col-lg-8">
											<form class="form-inline">
												<div class="form-group mx-sm-3 mb-2">
													<label for="status-select" class="mr-2">분류</label> <select
														class="custom-select" id="status-select" name="searchType">
														<option value=""
															<c:out value="${cri.searchType == null?'selected':''}"/>>
															전체</option>
														<option value="c"
															<c:out value="${cri.searchType eq 'c'?'selected':''}"/>>
															분류</option>
														<option value="a"
															<c:out value="${cri.searchType eq 'a'?'selected':''}"/>>
															영역</option>
														<option value="sn"
															<c:out value="${cri.searchType eq 'sn'?'selected':''}"/>>
															항목</option>
														<option value="sc"
															<c:out value="${cri.searchType eq 'sc'?'selected':''}"/>>
															평가점수</option>
														<option value="p"
															<c:out value="${cri.searchType eq 'p'?'selected':''}"/>>
															발행처</option>
													</select>
												</div>
												<div class="form-group mb-2">
													<label for="inputPassword2" class="sr-only">Search</label>
													<input type="text" class="form-control" name="keyword"
														value="${cri.keyword}" placeholder="검색어를 입력하세요." id="keywordInput">
													<button id="searchBtn" type="button" class="btn btn-light mb-2"
														style="vertical-align: bottom;">검색</button>
												</div>
											</form>
										</div>
										<!-- end col-->
									</div>

									<form id="form" method="post">
										<div class="table-responsive">
											<table class="table table-centered mb-0">
												<thead class="thead-light">
													<tr>
														<!-- <th style="width: 20px;">
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="customCheck1">
                                                                <label class="custom-control-label" for="customCheck1">&nbsp;</label>
                                                            </div>
                                                        </th> -->
														<th>NO</th>
														<th>분류</th>
														<th>영역</th>
														<th>항목</th>
														<th>평가점수</th>
														<th>발행처</th>
														<!-- <th style="width: 125px;">Action</th> -->
													</tr>
												</thead>

												<tbody>
													<!-- 리스트 내용 -->
													<c:forEach items="${list}" var="subjectVO" varStatus="status">
														<tr>
															<!-- <td>
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="customCheck2">
                                                                <label class="custom-control-label" for="customCheck2">&nbsp;</label>
                                                            </div>
                                                        </td> -->
                                                        <td>${(pageMaker.totalCount - status.index) -  (pageMaker.cri.page-1) * 10}</td>
															<%-- <td>${status.count}</td> --%>
															<td>${subjectVO.categ}</td>
															<td>${subjectVO.area}</td>
															<td><a
															href='/admin/subject/modify?subNo=${subjectVO.subNo}'>
															${subjectVO.subName} </a></td>
															<td>${subjectVO.score}</td>
															<td>${subjectVO.publication}</td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
										
										<!-- 페이징처리 -->
										<div class="box-footer">
											<div class="text-center">
												<ul class="pagination" style="text-align: center;">
													<c:if test="${pageMaker.prev}">
														<li class="page-item"><a class="page-link"
															href="/admin/subject/list${pageMaker.makeSearch(pageMaker.startPage - 1) }">
															<span aria-hidden="true">&laquo;</span>
															<span class="sr-only">Previous</span></a></li>
													</c:if>
						
													<c:forEach begin="${pageMaker.startPage }"
														end="${pageMaker.endPage }" var="idx">
														<li class="page-item"
															<c:out value="${pageMaker.cri.page == idx?'class =active':''}"/>>
															<a class="page-link" href="/admin/subject/list${pageMaker.makeSearch(idx)}">${idx}</a>
														</li>
													</c:forEach>
						
													<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
														<li class="page-item"><a class="page-link" aria-label="Next"
															href="/admin/subject/list${pageMaker.makeSearch(pageMaker.endPage +1) }">
															<span aria-hidden="true">&raquo;</span>
															<span class="sr-only">Next</span></a></li>
													</c:if>
												</ul>
											</div>
										</div>
										<!-- 페이징처리 -->
										
										<div style="margin-top:2%;">
											<button type="button" class="btn btn-outline-secondary mb-2" onclick="subRevised()">졸업인증제 개정안 부칙</button>
										</div>
										<div style="text-align: right;">
											<button type="button" class="btn btn-primary mb-2" onclick="subRegister()">인증항목등록</button>
										</div>
									</form>
									<!-- form -->

								</div>
								<!-- end card-body-->
							</div>
							<!-- end card-->
						</div>
						<!-- end col -->
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
						<div class="col-md-6">2018 - 2019 © Hyper - Coderthemes.com
						</div>
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
	<script src="/resources/dist/assets/js/app_admin.js"></script>

	<!-- third party js -->
	<script src="/resources/dist/assets/js/vendor/jquery-ui.min.js"></script>
	<script src="/resources/dist/assets/js/vendor/fullcalendar.min.js"></script>
	<!-- third party js ends -->

	<!-- demo app -->
	<script src="/resources/dist/assets/js/pages/demo.calendar.js"></script>
	<!-- end demo js-->


	<script>
	var result = '${msg}';

	if (result == 'SUCCESS') {
		alert("처리가 완료되었습니다.");
	}
	</script>

	<script>
	$(document).ready(
		function() {
	
			$('#searchBtn').on(
					"click",
					function(event) {
	
						self.location = "/admin/subject/list"
							+ '${pageMaker.makeQuery(1)}'
								+ "&searchType="
								+ $("select option:selected").val()
								+ "&keyword=" + $('#keywordInput').val();
	
					});
			});
	</script>

</body>
</html>