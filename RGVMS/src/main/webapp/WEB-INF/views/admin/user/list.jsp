<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
        <meta charset="utf-8" />
        <title>RGVMS - 학생목록</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="../../../../resources/dist/assets/images/favicon.ico">

        <!-- inline style to handle loading of various element-->
        <style>body.loading {visibility: hidden;}</style>

        <!-- App css -->
        <link href="../../../../resources/dist/assets/css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="../../../../resources/dist/assets/css/app.min.css" rel="stylesheet" type="text/css" id="main-style-container" />

    </head>

    <body class="loading">
        <div id="detached-topbar-placeholder"></div>
        <!-- Begin page -->
        <div class="wrapper">

            <div id="vertical-sidebar-placeholder"></div>
            <div id="detached-sidebar-placeholder"></div>

            <!-- ============================================================== -->
            <!-- Start Page Content here -->
            <!-- ============================================================== -->

            <div class="content-page">
                <div class="content">

                    <div id="vertical-topbar-placeholder"></div>
                    <div id="horizontal-topbar-placeholder"></div>

                    <!-- Start Content-->
                    <div class="container-fluid">
                        
                        <!-- start page title -->
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    <div class="page-title-right">
                                        <ol class="breadcrumb m-0">
                                            <li class="breadcrumb-item"><a href="javascript: void(0);">학생관리</a></li>
                                            <!-- <li class="breadcrumb-item"><a href="javascript: void(0);">eCommerce</a></li> -->
                                            <li class="breadcrumb-item active">학생목록</li>
                                        </ol>
                                    </div>
                                    <h4 class="page-title">학생목록</h4>
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
                                                        <label for="status-select" class="mr-2">분류</label>
                                                        <select class="custom-select" id="status-select">
                                                            <option value=""
																<c:out value="${cri.searchType == null?'selected':''}"/>>
																전체</option>
															<option value="uno"
																<c:out value="${cri.searchType eq 'uno'?'selected':''}"/>>
																학번</option>
															<option value="g"
																<c:out value="${cri.searchType eq 'g'?'selected':''}"/>>
																학년</option>
															<option value="un"
																<c:out value="${cri.searchType eq 'un'?'selected':''}"/>>
																이름</option>
															<option value="s"
																<c:out value="${cri.searchType eq 's'?'selected':''}"/>>
																학적상태</option>
                                                        </select>
                                                    </div>
                                                    <div class="form-group mb-2">
                                                        <label for="inputPassword2" class="sr-only">Search</label>
                                                        <input type="search" class="form-control" name="keyword" value="${cri.keyword}" placeholder="검색어를 입력하세요.">
                                                        <button type="button" class="btn btn-light mb-2">검색</button>
                                                    </div>
                                                </form>                            
                                            </div><!-- end col-->
                                        </div>
                
                                        <div class="table-responsive">
                                            <table class="table table-centered mb-0">
                                                <thead class="thead-light">
                                                    <tr>
                                                        <th style="width: 20px;">
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="customCheck1">
                                                                <label class="custom-control-label" for="customCheck1">&nbsp;</label>
                                                            </div>
                                                        </th>
                                                        <th>NO</th>
                                                        <th>학번</th>
                                                        <th>학년</th>
                                                        <th>이름</th>
                                                        <th>학적상태</th>
                                                        <th>관리</th>
                                                        <!-- <th style="width: 125px;">Action</th> -->
                                                    </tr>
                                                </thead>
                                                
                                                <tbody>
                                                <!-- 리스트 내용 -->
                                                <c:forEach items="${list}" var="userVO">
                                                    <tr>
                                                        <td>
                                                            <div class="custom-control custom-checkbox">
                                                                <input type="checkbox" class="custom-control-input" id="customCheck2">
                                                                <label class="custom-control-label" for="customCheck2">&nbsp;</label>
                                                            </div>
                                                        </td>
                                                        <td>${userVO.rnum }</td>
                                                        <td>${userVO.userNo }</td>
                                                        <td>${userVO.grade }</td>
                                                        <td>${userVO.userName }</td>
                                                        <td>${userVO.state }</td>
                                                        <td>
                                                            <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-square-edit-outline"></i>수정</a>
                                                            <a href="javascript:void(0);" class="action-icon"> <i class="mdi mdi-delete"></i>삭제</a>
                                                        </td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div> <!-- end col -->
                        </div>
                        <!-- end row --> 
                        
                    </div> <!-- container -->

                </div> <!-- content -->

                <!-- Footer Start -->
                <footer class="footer">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                2018 - 2019 ⓒ Hyper - Coderthemes.com
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


        <!-- Right Sidebar -->
        <div class="right-bar">

          <div class="rightbar-title">
            <a href="javascript:void(0);" class="right-bar-toggle float-right">
              <i class="dripicons-cross noti-icon"></i>
            </a>
            <h5 class="m-0">Settings</h5>
          </div>

          <div class="slimscroll-menu rightbar-content">

            <div class="p-1">
              <div class="alert alert-primary" role="alert">
                <strong>Customize </strong> the overall color scheme, layout, sidebar menu, etc. Note that, Hyper stores the preferences in local storage.
              </div>
            </div>

            <!-- Settings -->
            <h5 class="pl-2">Color Scheme</h5>
            <hr class="mb-0" />

            <div class="p-2">
              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="color-scheme-mode" value="light" id="light-mode-check" checked />
                <label class="custom-control-label" for="light-mode-check">Light Mode</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="color-scheme-mode" value="dark" id="dark-mode-check" />
                <label class="custom-control-label" for="dark-mode-check">Dark Mode</label>
              </div>
            </div>

            <h5 class="pl-2">Layout</h5>
            <hr class="mb-0" />

            <div class="p-2">
              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="layout" value="vertical" id="vertical-check" checked />
                <label class="custom-control-label" for="vertical-check">Vertical Layout (Default)</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="layout" value="horizontal" id="horizontal-check" />
                <label class="custom-control-label" for="horizontal-check">Horizontal Layout</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="layout" value="detached" id="detached-check" />
                <label class="custom-control-label" for="detached-check">Detached Layout</label>
              </div>
            </div>

            <h5 class="pl-2">Width</h5>
            <hr class="mb-0" />
            <div class="p-2">
              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="width" value="fluid" id="fluid-check" checked />
                <label class="custom-control-label" for="fluid-check">Fluid</label>
              </div>
              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="width" value="boxed" id="boxed-check" />
                <label class="custom-control-label" for="boxed-check">Boxed</label>
              </div>
            </div>

            <h5 class="pl-2">Left Sidebar</h5>
            <hr class="mb-0" />

            <div class="p-2">
              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="theme" value="default" id="default-check" checked />
                <label class="custom-control-label" for="default-check">Default</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="theme" value="light" id="light-check" />
                <label class="custom-control-label" for="light-check">Light</label>
              </div>

              <div class="custom-control custom-switch mb-3">
                <input type="radio" class="custom-control-input" name="theme" value="dark" id="dark-check" />
                <label class="custom-control-label" for="dark-check">Dark</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="compact" value="fixed" id="fixed-check" checked />
                <label class="custom-control-label" for="fixed-check">Fixed</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="compact" value="condensed" id="condensed-check" />
                <label class="custom-control-label" for="condensed-check">Condensed</label>
              </div>

              <div class="custom-control custom-switch mb-1">
                <input type="radio" class="custom-control-input" name="compact" value="scrollable" id="scrollable-check" />
                <label class="custom-control-label" for="scrollable-check">Scrollable</label>
              </div>
            </div>

            <div class="p-2 text-center">
              <button class="btn btn-primary btn-block" id="resetBtn">Reset to Default</button>
            </div>
          </div>
        </div>

        <div class="rightbar-overlay"></div>
        <!-- /Right-bar -->



        <!-- App js -->
        <script src="../../../../resources/dist/assets/js/app.min.js"></script>
    </body>
</html>