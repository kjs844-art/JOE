<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Page</title>
<c:import url="/WEB-INF/views/temp/head.jsp"></c:import>
</head>
<body class="d-flex flex-column h-100">
    <main class="flex-shrink-0">
        <c:import url="/WEB-INF/views/temp/nav.jsp"></c:import>

        <section class="py-5">
            <div class="container px-5 mb-5">
                <div class="text-center mb-5">
                    <h1 class="display-5 fw-bolder mb-0"><span class="text-gradient d-inline">Sample</span></h1>
                </div>
                <div class="row gx-5 justify-content-center">
                    <div class="col-lg-10">
                        <div class="card overflow-hidden shadow rounded-4 border-0">
                            <div class="card-body p-5">
                                <h2 class="fw-bolder mb-3">Teacher Standard Include</h2>
                                <pre class="mb-0"><code>&lt;c:import url="/WEB-INF/views/temp/head.jsp"&gt;&lt;/c:import&gt;
&lt;c:import url="/WEB-INF/views/temp/nav.jsp"&gt;&lt;/c:import&gt;
&lt;c:import url="/WEB-INF/views/temp/footer.jsp"&gt;&lt;/c:import&gt;</code></pre>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </main>
    <c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
</body>
</html>
