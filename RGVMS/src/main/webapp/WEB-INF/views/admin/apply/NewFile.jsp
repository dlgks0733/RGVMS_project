<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<title>Hyper - Responsive Bootstrap 4 Admin Dashboard</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta
	content="A fully featured admin theme which can be used to build CRM, CMS, etc."
	name="description" />
<meta content="Coderthemes" name="author" />
<!-- App favicon -->
<link rel="shortcut icon" href="assets/images/favicon.ico">

<!-- inline style to handle loading of various element-->
<style>
body.loading {
	visibility: hidden;
}
</style>

<!-- third party css -->
<link href="assets/css/vendor/fullcalendar.min.css" rel="stylesheet"
	type="text/css" />
<!-- third party css end -->

<!-- App css -->
<link href="assets/css/icons.min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/app.min.css" rel="stylesheet" type="text/css"
	id="main-style-container" />

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
										<li class="breadcrumb-item"><a
											href="javascript: void(0);">Hyper</a></li>
										<li class="breadcrumb-item"><a
											href="javascript: void(0);">Apps</a></li>
										<li class="breadcrumb-item active">Calendar</li>
									</ol>
								</div>
								<h4 class="page-title">Calendar</h4>
							</div>
						</div>
					</div>
					<!-- end page title -->

					<div class="row">
						<div class="col-12">

							<div class="card">
								<div class="card-body">
									<div class="row">
										<div class="col-lg-3">
											<a href="#" data-toggle="modal" data-target="#add-category"
												class="btn btn-lg font-16 btn-primary btn-block  "> <i
												class="mdi mdi-plus-circle-outline"></i> Create New Event
											</a>
											<div id="external-events" class="m-t-20">
												<br>
												<p class="text-muted">Drag and drop your event or click
													in the calendar</p>
												<div class="external-event bg-success"
													data-class="bg-success">
													<i
														class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>New
													Theme Release
												</div>
												<div class="external-event bg-info" data-class="bg-info">
													<i
														class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>My
													Event
												</div>
												<div class="external-event bg-warning"
													data-class="bg-warning">
													<i
														class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>Meet
													manager
												</div>
												<div class="external-event bg-danger" data-class="bg-danger">
													<i
														class="mdi mdi-checkbox-blank-circle mr-2 vertical-middle"></i>Create
													New theme
												</div>
											</div>

											<!-- checkbox -->
											<div class="custom-control custom-checkbox mt-3">
												<input type="checkbox" class="custom-control-input"
													id="drop-remove"> <label
													class="custom-control-label" for="drop-remove">Remove
													after drop</label>
											</div>

											<div class="mt-5 d-none d-xl-block">
												<h5 class="text-center">How It Works ?</h5>

												<ul class="pl-3">
													<li class="text-muted mb-3">It has survived not only
														five centuries, but also the leap into electronic
														typesetting, remaining essentially unchanged.</li>
													<li class="text-muted mb-3">Richard McClintock, a
														Latin professor at Hampden-Sydney College in Virginia,
														looked up one of the more obscure Latin words,
														consectetur, from a Lorem Ipsum passage.</li>
													<li class="text-muted mb-3">It has survived not only
														five centuries, but also the leap into electronic
														typesetting, remaining essentially unchanged.</li>
												</ul>
											</div>
										</div>
										<!-- end col-->

										<div class="col-lg-9">
											<div id="calendar"></div>
										</div>
										<!-- end col -->

									</div>
									<!-- end row -->
								</div>
								<!-- end card body-->
							</div>
							<!-- end card -->

							<!-- Add New Event MODAL -->
							<div class="modal fade" id="event-modal" tabindex="-1">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header pr-4 pl-4 border-bottom-0 d-block">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title">Add New Event</h4>
										</div>
										<div class="modal-body pt-3 pr-4 pl-4"></div>
										<div class="text-right pb-4 pr-4">
											<button type="button" class="btn btn-light "
												data-dismiss="modal">Close</button>
											<button type="button" class="btn btn-success save-event  ">Create
												event</button>
											<button type="button" class="btn btn-danger delete-event  "
												data-dismiss="modal">Delete</button>
										</div>
									</div>
									<!-- end modal-content-->
								</div>
								<!-- end modal dialog-->
							</div>
							<!-- end modal-->

							<!-- Modal Add Category -->
							<div class="modal fade" id="add-category" tabindex="-1">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header border-bottom-0 d-block">
											<button type="button" class="close" data-dismiss="modal"
												aria-hidden="true">&times;</button>
											<h4 class="modal-title">Add a category</h4>
										</div>
										<div class="modal-body p-4">
											<form>
												<div class="form-group">
													<label class="control-label">Category Name</label> <input
														class="form-control form-white" placeholder="Enter name"
														type="text" name="category-name" />
												</div>
												<div class="form-group">
													<label class="control-label">Choose Category Color</label>
													<select class="form-control form-white"
														data-placeholder="Choose a color..." name="category-color">
														<option value="primary">Primary</option>
														<option value="success">Success</option>
														<option value="danger">Danger</option>
														<option value="info">Info</option>
														<option value="warning">Warning</option>
														<option value="dark">Dark</option>
													</select>
												</div>

											</form>

											<div class="text-right">
												<button type="button" class="btn btn-light "
													data-dismiss="modal">Close</button>
												<button type="button"
													class="btn btn-primary ml-1   save-category"
													data-dismiss="modal">Save</button>
											</div>

										</div>
										<!-- end modal-body-->
									</div>
									<!-- end modal-content-->
								</div>
								<!-- end modal dialog-->
							</div>
							<!-- end modal-->
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
					<strong>Customize </strong> the overall color scheme, layout,
					sidebar menu, etc. Note that, Hyper stores the preferences in local
					storage.
				</div>
			</div>

			<!-- Settings -->
			<h5 class="pl-2">Color Scheme</h5>
			<hr class="mb-0" />

			<div class="p-2">
				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input"
						name="color-scheme-mode" value="light" id="light-mode-check"
						checked /> <label class="custom-control-label"
						for="light-mode-check">Light Mode</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input"
						name="color-scheme-mode" value="dark" id="dark-mode-check" /> <label
						class="custom-control-label" for="dark-mode-check">Dark
						Mode</label>
				</div>
			</div>

			<h5 class="pl-2">Layout</h5>
			<hr class="mb-0" />

			<div class="p-2">
				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="layout"
						value="vertical" id="vertical-check" checked /> <label
						class="custom-control-label" for="vertical-check">Vertical
						Layout (Default)</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="layout"
						value="horizontal" id="horizontal-check" /> <label
						class="custom-control-label" for="horizontal-check">Horizontal
						Layout</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="layout"
						value="detached" id="detached-check" /> <label
						class="custom-control-label" for="detached-check">Detached
						Layout</label>
				</div>
			</div>

			<h5 class="pl-2">Width</h5>
			<hr class="mb-0" />
			<div class="p-2">
				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="width"
						value="fluid" id="fluid-check" checked /> <label
						class="custom-control-label" for="fluid-check">Fluid</label>
				</div>
				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="width"
						value="boxed" id="boxed-check" /> <label
						class="custom-control-label" for="boxed-check">Boxed</label>
				</div>
			</div>

			<h5 class="pl-2">Left Sidebar</h5>
			<hr class="mb-0" />

			<div class="p-2">
				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="theme"
						value="default" id="default-check" checked /> <label
						class="custom-control-label" for="default-check">Default</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="theme"
						value="light" id="light-check" /> <label
						class="custom-control-label" for="light-check">Light</label>
				</div>

				<div class="custom-control custom-switch mb-3">
					<input type="radio" class="custom-control-input" name="theme"
						value="dark" id="dark-check" /> <label
						class="custom-control-label" for="dark-check">Dark</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="compact"
						value="fixed" id="fixed-check" checked /> <label
						class="custom-control-label" for="fixed-check">Fixed</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="compact"
						value="condensed" id="condensed-check" /> <label
						class="custom-control-label" for="condensed-check">Condensed</label>
				</div>

				<div class="custom-control custom-switch mb-1">
					<input type="radio" class="custom-control-input" name="compact"
						value="scrollable" id="scrollable-check" /> <label
						class="custom-control-label" for="scrollable-check">Scrollable</label>
				</div>
			</div>

			<div class="p-2 text-center">
				<button class="btn btn-primary btn-block" id="resetBtn">Reset
					to Default</button>
			</div>
		</div>
	</div>

	<div class="rightbar-overlay"></div>
	<!-- /Right-bar -->



	<!-- App js -->
	<script src="assets/js/app.min.js"></script>

	<!-- third party js -->
	<script src="assets/js/vendor/jquery-ui.min.js"></script>
	<script src="assets/js/vendor/fullcalendar.min.js"></script>
	<!-- third party js ends -->

	<!-- demo app -->
	<script src="assets/js/pages/demo.calendar.js"></script>
	<!-- end demo js-->

</body>
</html>