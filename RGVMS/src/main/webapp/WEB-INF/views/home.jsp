<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>RGVMS LOGIN</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="assets/images/favicon.ico">

        <!-- inline style to handle loading of various element-->
        <style>body.loading {visibility: hidden;}</style>

        <!-- App css -->
        <link href="../../resources/dist/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="../../resources/dist/assets/css/app.min.css" rel="stylesheet" type="text/css" id="main-style-container" />

    </head>

    <body class="authentication-bg">

        <div class="account-pages mt-5 mb-5">
            <div class="container">
                <div class="row justify-content-center">
                    <div class="col-lg-5">
                        <div class="card">

                            <!-- Logo -->
                            <div class="card-header pt-4 pb-4 text-center bg-primary">
                                <a href="index.html">
                                    <span><img src="../../resources/dist/assets/images/logo.png" alt="" height="18"></span>
                                </a>
                            </div>

                            <div class="card-body p-4">
                                
                                <div class="text-center w-75 m-auto">
                                    <h4 class="text-dark-50 text-center mt-0 font-weight-bold">로그인</h4>
                                </div>

                                <form action="/loginPost" method="post" onsubmit="return loginCheck()">

                                    <div class="form-group">
                                        <label for="emailaddress">학번</label>
                                        <input class="form-control" type="text" id="userNo" name="userNo" required="" placeholder="학번을 입력해주세요.">
                                    </div>

                                    <div class="form-group">
                                        <!-- <a href="pages-recoverpw.html" class="text-muted float-right"><small>Forgot your password?</small></a> -->
                                        <label for="password">비밀번호</label>
                                        <input class="form-control" type="password" required="" id="userPw" name="userPw" placeholder="비밀번호를 입력해주세요.">
                                    </div>

                                    <!-- <div class="form-group mb-3">
                                        <div class="custom-control custom-checkbox">
                                            <input type="checkbox" class="custom-control-input" id="checkbox-signin" checked>
                                            <label class="custom-control-label" for="checkbox-signin">Remember me</label>
                                        </div>
                                    </div> -->

                                    <div class="form-group mb-0 text-center">
                                        <button class="btn btn-primary" type="submit"> 로그인 </button>
                                    </div>

                                </form>
                            </div> <!-- end card-body -->
                        </div>
                        <!-- end card -->

                       <!--  <div class="row mt-3">
                            <div class="col-12 text-center">
                                <p class="text-muted">Don't have an account? <a href="pages-register.html" class="text-muted ml-1"><b>Sign Up</b></a></p>
                            </div> end col
                        </div> -->
                        <!-- end row -->

                    </div> <!-- end col -->
                </div>
                <!-- end row -->
            </div>
            <!-- end container -->
        </div>
        <!-- end page -->

        <footer class="footer footer-alt">
            2018 - 2019 © Hyper - Coderthemes.com
        </footer>

        <!-- App js -->
        <script src="../../resources/dist/assets/js/app.min.js"></script>
    </body>
<script>
var msg;

if(msg == "fail"){
	alert("학번 또는 비밀번호가 일치하지 않습니다.");
}

function loginCheck(){
	var userNo = $("#userNo").val();
	var userPw = $("#userPw").val();
	
	if(userNo == ""){
		alert("학번을 입력해주세요.");
		document.getElementById("userNo").focus();
		return false;
	}
	if(userPw == ""){
		alert("비밀번호를 입력해주세요.");
		document.getElementById("userPw").focus();
		return false;
	}
	
}
</script>
</html>
