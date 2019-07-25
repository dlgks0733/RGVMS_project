<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>사용자 페이지</title>
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

<!-- javaScript validate() -->
<script>
function validate() {
	
	var userPw = document.getElementById("userPw");
	var grade = document.getElementById("grade");
	var state = document.getElementById("state");
	var userName = document.getElementById("userName");
	
	if(grade.inter[0].checked == false &&
	   grade.inter[1].checked == false &&
	   grade.inter[2].checked == false &&
	   grade.inter[3].checked == false &&
	   grade.inter[4].checked == false
	   ) {
		
		alert()
		
	}
	
}
</script>
</head>

    <body class="loading">
        <div id="detached-topbar-placeholder"></div>
        <!-- Begin page -->
        <div class="wrapper">

            <div id="detached-sidebar-placeholder"></div>

            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">

                    <!-- start page title -->
					<div class="row" style=" justify-content: center;">
						<div class="col-7">
							<div class="page-title-box">
								<div class="page-title-right">
									<ol class="breadcrumb m-0">
										<li class="breadcrumb-item"><a
											href="javascript: void(0);">MyPage</a></li>
										<!-- <li class="breadcrumb-item"><a
											href="javascript: void(0);"></a></li> -->
										<li class="breadcrumb-item active">내정보</li>
									</ol>
								</div>
								<h4 class="page-title">내정보</h4>
							</div>
						</div>
					</div>
					<!-- end page title -->

					<div class="row" style=" justify-content: center;">
						<div class="col-lg-7">
							<div class="card">
								<div class="card-body">
									<form class="needs-validation" onsubmit="return validate();" action="myInfoUpdate" method="post">
										<div class="form-group mb-3">
											<label for="userNo">학번</label>
											<input type="text" class="form-control" name="userNo"
											value="${userVO.userNo}" readonly="readonly"/>
										</div>
										
										<div class="box">
											<div class="form-group mb-3">
												<label for="grade">학년</label>
												<select class="form-control select2" name="grade" id="gradeSelect">
													<option value="4"
														<c:out value="${userVO.grade eq '4'?'selected':'' }"/>>4</option>
	                                                <option value="3"
														<c:out value="${userVO.grade eq '3'?'selected':'' }"/>>3</option>
													<option value="2"
														<c:out value="${userVO.grade eq '2'?'selected':'' }"/>>2</option>
													<option value="1"
														<c:out value="${userVO.grade eq '1'?'selected':'' }"/>>1</option>
	                                            </select>
											</div>
											<div class="form-group mb-3">
												<label for="state">학적상태</label>
												<select class="form-control select2" name="state" id="stateSelect">
													<option value="재학"
														<c:out value="${userVO.state eq '재학'?'selected':'' }"/>>재학</option>
													<option value="휴학"
														<c:out value="${userVO.state eq '휴학'?'selected':'' }"/>>휴학</option>
													<option value="졸업"
														<c:out value="${userVO.state eq '졸업'?'selected':'' }"/>>졸업</option>
													<option value="수료"
														<c:out value="${userVO.state eq '수료'?'selected':'' }"/>>수료</option>
	                                            </select>
											</div>
										</div>
										
										<div class="form-group mb-3">
											<label for="userName">이름</label> <input
												type="text" class="form-control" name="userName" value="${userVO.userName}"/>
										</div>
										
										<div class="form-group mb-3">
											<label for="userPw">비밀번호변경</label>
											<input type="text" class="form-control" name="userPw" value="${userVO.userPw}" placeholder="새 비밀번호를 입력하세요."/>
											<h6>비밀번호는 4자리 이상으로 만들어주세요.</h6>
										</div>
										
										<div class="form-group mb-3">
											<label for="userPw">비밀번호변경</label>
											<input type="text" class="form-control" name="userPw" placeholder="새 비밀번호를 입력하세요."/>
											<h6>비밀번호는 4자리 이상으로 만들어주세요.</h6>
										</div>

										<input type="hidden" class="form-control" name="userPw" value="1234">
										<input type="hidden" class="form-control" name="authority" value="0">
										
										<div style="text-align: right;">
											<button class="btn btn-primary" type="submit">수정</button>
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
        <script src="/resources/dist/assets/js/app.js"></script>

        <!-- third party js -->
        <script src="/resources/dist/assets/js/vendor/jquery-ui.min.js"></script>
        <script src="/resources/dist/assets/js/vendor/fullcalendar.min.js"></script>
        <!-- third party js ends -->

        <!-- demo app -->
        <script src="/resources/dist/assets/js/pages/demo.calendar.js"></script>
        <!-- end demo js-->

</body>

<script>
var result = '${user}';

if (result == 'SUCCESS') {
	alert("정보가 수정되었습니다.");
}
</script>
</html>