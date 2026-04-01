<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resource/assets/favicon.ico" />
<link rel="preconnect" href="https://fonts.googleapis.com" />
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
<link
	href="https://fonts.googleapis.com/css2?family=Plus+Jakarta+Sans:wght@100;200;300;400;500;600;700;800;900&amp;display=swap"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css"
	rel="stylesheet" />
<link href="${pageContext.request.contextPath}/resource/css/styles.css"
	rel="stylesheet" />
<style>
	body {
		background: linear-gradient(180deg, #f8f9fc 0%, #ffffff 100%);
	}

	.page-shell {
		padding: 4rem 0 5rem;
	}

	.page-intro {
		max-width: 760px;
		margin: 0 auto 3rem;
		text-align: center;
	}

	.quick-card {
		height: 100%;
		border: 0;
		border-radius: 1.5rem;
		box-shadow: 0 1rem 2rem rgba(15, 23, 42, 0.08);
		transition: transform 0.2s ease, box-shadow 0.2s ease;
	}

	.quick-card:hover {
		transform: translateY(-6px);
		box-shadow: 0 1.5rem 3rem rgba(15, 23, 42, 0.12);
	}

	.quick-icon {
		width: 3rem;
		height: 3rem;
		display: inline-flex;
		align-items: center;
		justify-content: center;
		border-radius: 1rem;
		background: linear-gradient(135deg, #4f46e5, #9333ea);
		color: #fff;
		font-size: 1.25rem;
	}

	.feature-panel {
		border: 0;
		border-radius: 1.75rem;
		box-shadow: 0 1rem 2rem rgba(15, 23, 42, 0.08);
	}

	.form-panel {
		border: 0;
		border-radius: 1.5rem;
		box-shadow: 0 1rem 2rem rgba(15, 23, 42, 0.08);
	}

	.info-badge {
		display: inline-flex;
		align-items: center;
		gap: 0.4rem;
		padding: 0.45rem 0.8rem;
		border-radius: 999px;
		background: rgba(79, 70, 229, 0.08);
		color: #4f46e5;
		font-size: 0.9rem;
		font-weight: 600;
	}

	.summary-list li + li {
		margin-top: 0.75rem;
	}
</style>
