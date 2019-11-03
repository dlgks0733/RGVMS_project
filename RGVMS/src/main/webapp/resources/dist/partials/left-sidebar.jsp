<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Topbar Start -->
<!-- ========== Left Sidebar Start ========== -->
<div class="left-side-menu">
	
    <div class="slimscroll-menu" id="left-side-menu-container">

        <!-- LOGO -->
        <a href="/admin/main" class="logo text-center">
            <span class="logo-lg">
                <img src="/resources/dist/assets/images/logo.png" alt="" height="16" id="side-main-logo">
            </span>
            <span class="logo-sm">
                <img src="/resources/dist/assets/images/logo_sm.png" alt="" height="16" id="side-sm-main-logo">
            </span>
        </a>

        <!--- Sidemenu -->
        <ul class="metismenu side-nav">

            <li class="side-nav-title side-nav-item">Navigation</li>

            <li class="side-nav-item">
                <a href="/admin/main" class="side-nav-link">
                    <i class="dripicons-meter"></i>
                    <span class="badge badge-success float-right"></span>
                    <span> Dashboards </span>
                </a>
            </li>
            
            <li class="side-nav-item">
                <a href="/admin/mis/list" class="side-nav-link">
                    <i class="dripicons-copy"></i>
                    <span class="badge badge-success float-right"></span>
                    <span> MIS 출결 관리 </span>
                </a>
            </li>
            
			<li class="side-nav-item">
                <a href="javascript: void(0);" class="side-nav-link">
                    <i class="dripicons-document"></i>
                    <span> 졸업인증신청 관리 </span>
                    <span class="menu-arrow"></span>
                </a>
                <ul class="side-nav-second-level" aria-expanded="false">
                    <li>
                        <a href="/admin/apply/waitList">승인대기 신청내역</a>
                    </li>
                    <li>
                        <a href="/admin/apply/list">전체 신청내역</a>
                    </li>
                </ul>
            </li>
            
            <li class="side-nav-item">
                <a href="javascript: void(0);" class="side-nav-link">
                    <i class="dripicons-document"></i>
                    <span class="badge badge-success float-right"></span>
                    <span> 졸업인증평가 관리 </span>
                    <span class="menu-arrow"></span>
                </a>
                <ul class="side-nav-second-level" aria-expanded="false">
                    <li>
                        <a href="/admin/estimation/list">졸업인증점수 현황</a>
                    </li>
                    <li>
                        <a href="/admin/statistics/list">인증항목 취득현황</a>
                    </li>
                </ul>
            </li>
            
            <li class="side-nav-item">
                <a href="javascript: void(0);" class="side-nav-link">
                    <i class="dripicons-view-apps"></i>
                    <span> 기초정보 관리 </span>
                    <span class="menu-arrow"></span>
                </a>
                <ul class="side-nav-second-level" aria-expanded="false">
                    <li>
                        <a href="/admin/user/list">학생 관리</a>
                    </li>
                    <li>
                        <a href="/admin/subject/list">인증항목 관리</a>
                    </li>
                </ul>
            </li>
            
        </ul>

        <!-- Help Box -->
        <div class="help-box text-white text-center">
            <a href="javascript: void(0);" class="float-right close-btn text-white">
                <i class="mdi mdi-close"></i>
            </a>
            <img src="/resources/dist/assets/images/help-icon.svg" height="90" alt="Helper Icon Image" />
            <h5 class="mt-3">시스템 관련 문의</h5>
            <p class="mb-3">시스템 관련 문의는 Email로 부탁드립니다.</p>
            <a href="javascript: void(0);" class="btn btn-outline-light btn-sm">연락하기</a>
        </div>
        <!-- end Help Box -->
        <!-- End Sidebar -->

        <div class="clearfix"></div>

    </div>
    <!-- Sidebar -left -->
    
</div>
<!-- Left Sidebar End -->