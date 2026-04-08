<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<footer class="bg-white py-4 mt-auto">
	<div class="container px-5">
		<div
			class="row align-items-center justify-content-between flex-column flex-sm-row">
			<div class="col-auto">
				<div class="small m-0">Copyright &copy; Your Website 2023</div>
			</div>
			<div class="col-auto">
				<a class="small" href="#!">Privacy</a> <span class="mx-1">&middot;</span>
				<a class="small" href="#!">Terms</a> <span class="mx-1">&middot;</span>
				<a class="small" href="#!">Contact</a>
			</div>
		</div>
	</div>
</footer>

<%-- Local Vendor Script: jquery.min.js를 프로젝트 내부 vendor 폴더에서 불러옵니다. --%>
<script
	src="${pageContext.request.contextPath}/resource/vendor/jquery/jquery.min.js"></script>
<%-- Local Vendor Script: bootstrap.bundle.min.js를 프로젝트 내부 vendor 폴더에서 불러옵니다. --%>
<script
	src="${pageContext.request.contextPath}/resource/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<%-- Project Script: 화면별 추가 동작은 scripts.js에서 이어서 작성합니다. --%>
<script src="${pageContext.request.contextPath}/resource/js/scripts.js"></script>
