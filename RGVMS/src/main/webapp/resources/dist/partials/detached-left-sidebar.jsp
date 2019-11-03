<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Topbar Start -->
<div class="left-side-menu left-side-menu-detached">
	
    <div class="leftbar-user">
        <a href="javascript: void(0);">
            <img src="/resources/dist/assets/images/users/avatar-1.jpg" alt="user-image" height="42" class="rounded-circle shadow-sm">
            <span class="leftbar-user-name">${login.userName} 님</span>
        </a>
    </div>

    <!--- Sidemenu -->
    <ul class="metismenu side-nav side-nav-light">

        <li class="side-nav-title side-nav-item">Navigation</li>

        <li class="side-nav-item">
            <a href="/user/main" class="side-nav-link">
                <i class="dripicons-meter"></i>
                <span> Dashboards </span>
            </a>
        </li>



        <li class="side-nav-item">
            <a href="/user/apply/list" class="side-nav-link">
               <i class="dripicons-document"></i>
                <span> 졸업인증 신청 관리 </span>
            </a>
        </li>

        <li class="side-nav-item">
            <a href="javascript: void(0);" class="side-nav-link">
                <i class="dripicons-copy"></i>
                <span>My Page </span>
                <span class="menu-arrow"></span>
            </a>
            <ul class="side-nav-second-level" aria-expanded="false">
                <li>
                    <a href="/user/mypage/myScore">내 점수</a>
                </li>
                <li>
                    <a href="/user/mypage/myInfo">내 정보</a>
                </li>
                <!-- <li>
                    <a href="/user/mypage/myGoal">내 목표</a>
                </li> -->
            </ul>
        </li>

    </ul>

    <!-- Help Box -->
    <div class="help-box help-box-light text-center">
        <a href="javascript: void(0);" class="float-right close-btn text-body">
            <i class="mdi mdi-close"></i>
        </a>
        <img src="/resources/dist/assets/images/help-icon.svg" height="90" alt="Helper Icon Image" />
        <h5 class="mt-3">졸업 인증 문의</h5>
        <p class="mb-3">졸업 인증 관련 자세한 사항은 학과 사무실로 연락부탁드립니다.</p>
        <a href="javascript: void(0);" class="btn btn-outline-primary btn-sm">연락하기</a>
    </div>
    <!-- end Help Box -->
    <!-- End Sidebar -->

    <div class="clearfix"></div>
    <!-- Sidebar -left -->

</div>
<!-- Left Sidebar End -->