<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   	
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>관리자 페이지</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="/resources/dist/assets/images/favicon.ico">

        <!-- inline style to handle loading of various element-->
        <style>body.loading {visibility: hidden;}</style>

        <!-- third party css -->
        <link href="/resources/dist/assets/css/vendor/fullcalendar.min.css" rel="stylesheet" type="text/css" />
        <!-- third party css end -->

        <!-- App css -->
        <link href="/resources/dist/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="/resources/dist/assets/css/app.min.css" rel="stylesheet" type="text/css" id="main-style-container" />

    </head>

    <body class="loading">
        <!-- Begin page -->
        <div class="wrapper">

            <div id="vertical-sidebar-placeholder"></div>

            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page" style="align:center;">
                <div class="content">

                    <div id="vertical-topbar-placeholder"></div>

                    <!-- Start Content-->
                    <div class="container-fluid">
                        
                    <!-- start page title -->
					<div class="row" style=" justify-content: center;">
						<div class="col-7">
							<div class="page-title-box">
								<div class="page-title-right">
									<ol class="breadcrumb m-0">
										<li class="breadcrumb-item"><a
											href="javascript: void(0);">학생관리</a></li>
										<!-- <li class="breadcrumb-item"><a
											href="javascript: void(0);"></a></li> -->
										<li class="breadcrumb-item active">학생수정</li>
									</ol>
								</div>
								<h4 class="page-title">학생수정</h4>
							</div>
						</div>
					</div>
					<!-- end page title -->

					<div class="row" style=" justify-content: center;">
						<div class="col-lg-7">
							<div class="card">
								<div class="card-body">
									<h4 class="header-title mb-3">학생정보입력란</h4>

									<form class="needs-validation" role="form">
										<div class="form-group mb-3">
											<label for="userNo">학번</label> <input
												type="text" class="form-control" name="userNo" value="${userVO.userNo}"
												placeholder="학번을 입력해주세요."/>
											<div class="valid-feedback">확인!</div>
										</div>
										
										<div class="box">
											<div class="form-group mb-3">
												<label for="grade">학년</label>
												<select class="form-control select2" name="grade">
												<option value="4"
													<c:out value="${userVO.grade eq '4'?'selected':'' }"/>>4</option>
												<option value="3"
													<c:out value="${userVO.grade eq '3'?'selected':'' }"/>>3</option>	
												<option value="2"
													<c:out value="${userVO.grade eq '2'?'selected':'' }"/>>2</option>
												<option value="1"
													<c:out value="${userVO.grade eq '1'?'selected':'' }"/>>1</option>		
	                                            </select>
												<div class="invalid-feedback">학년을 선택해주세요.</div>
											</div>
											<div class="form-group mb-3">
												<label for="state">학적상태</label>
												<select class="form-control select2" name="state">
                                                <option value="재학"
													<c:out value="${userVO.state eq '재학'?'selected':'' }"/>>재학</option>
												<option value="휴학"
													<c:out value="${userVO.state eq '휴학'?'selected':'' }"/>>휴학</option>
												<option value="졸업"
													<c:out value="${userVO.state eq '졸업'?'selected':'' }"/>>졸업</option>
												<option value="수료"
													<c:out value="${userVO.state eq '수료'?'selected':'' }"/>>수료</option>	
	                                            </select>
												<div class="invalid-feedback">학년을 선택해주세요.</div>
											</div>
										</div>
										
										<div class="form-group mb-3">
											<label for="userName">이름</label> <input
												type="text" class="form-control" name="userName" value="${userVO.userName}"
												placeholder="이름을 입력해주세요."/>
											<div class="valid-feedback">확인!</div>
										</div>

										<input type="hidden" class="form-control" name="userPw" value="1234">
										<input type="hidden" class="form-control" name="authority" value="0">
										<input type="hidden" class="form-control" name="regNum" value="${userVO.regNum }">
										
										<!-- 페이징과 검색처리를 위한 파라미터값 -->
										<%-- <input type='hidden' name='page' value="${cri.page}">
										<input type='hidden' name='perPageNum' value="${cri.perPageNum}"> --%>
										<input type='hidden' name='searchType' value="${cri.searchType}">
										<input type='hidden' name='keyword' value="${cri.keyword}">
										
										<div class="row mt-4">
												<div class="col-sm-6">
													<a href="/admin/user/list?
															searchType=${cri.searchType}&keyword=${cri.keyword}"
															class="btn text-muted d-none d-sm-inline-block btn-link font-weight-semibold">
														<i class="mdi mdi-arrow-left"></i> 목록으로 돌아가기
													</a>
												
												<!-- searchType=page=${cri.page}&perPageNum=${cri.perPageNum}
															&searchType=${cri.searchType}&keyword=${cri.keyword} -->
												
												</div>
												<!-- end col -->
												<div class="col-sm-6">
													<div class="text-sm-right">
														<button class="btn btn-primary" type="button">수정</button>
													</div>
												</div>
												<!-- end col -->
											</div>
										
									</form>

								</div>
								<!-- end card-body-->
							</div>
							<!-- end card-->
						</div>
						<!-- end col-->
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
                            <div class="col-md-6">
                                2018 - 2019 © Hyper - Coderthemes.com
                            </div>
                            <div class="col-md-6">
                                <div class="text-md-right footer-links d-none d-md-block">
                                    <a href="javascript: void(0);">About</a>
                                    <a href="javascript: void(0);">Support</a>
                                    <a href="javascript: void(0);">Contact Us</a>
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

</body>

<script>
	$(document).ready(function() {

		var formObj = $("form[role='form']");

		console.log(formObj);
		
		/* 수정버튼 */
		$(".btn-primary").on("click", function() {
			formObj.attr("action", "/admin/user/modify");
			formObj.attr("method", "post");
			formObj.submit();
		});

	});
	</script>
</html>