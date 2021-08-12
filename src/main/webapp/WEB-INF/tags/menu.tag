<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="evipdus" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<%@ attribute name="name" required="true" rtexprvalue="true"
	description="Name of the active menu: inicio, analisis de riesgos, contactanos, sobre nosotros, login"%>

<nav class="navbar navbar-default" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand"
				href="<spring:url value="/" htmlEscape="true" />"></a>
			<button type="button" class="navbar-toogle" data-toogle="collapse"
				data-target="#main-navbar">
				<span class="sr-only"><os-p>Toggle navigation</os-p></span><span class="icon-bar"></span><span
					class="icon-bar"></span><span
					class="icon-bar"></span>
			</button>
		</div>
		
			<ul class="nav navbar-nav navbar-right" style="text-align: center">

				<evipdus:menuItem active="${name eq 'Inicio' }" url="/"
					title="Inicio">
					<span>Inicio</span>
				</evipdus:menuItem>

				<evipdus:menuItem active="${name eq 'ariesgos' }" url="/ariesgos"
					title="Analisis de riesgos">
					<span>Análisis de riesgos</span>
				</evipdus:menuItem>

				<evipdus:menuItem active="${name eq 'contactInfo' }"
					url="/contactanos" title="Contactanos">
					<span>Contactanos</span>
				</evipdus:menuItem>

				<evipdus:menuItem active="${name eq 'whoWeAre' }" url="/whoweare"
					title="Quienes somos">
					<span>Quienes somos</span>
				</evipdus:menuItem>
				<sec:authorize access="!isAuthenticated()">
					<evipdus:menuItem active="${name eq 'signUp' }" url="/sign-up"
						title="Registro usuario">
						<span>Registrate</span>
					</evipdus:menuItem>
					<evipdus:menuItem active="${name eq 'login' }" url="/login"
						title="Inicio de sesion">
						<span>Inicio de sesion</span>
					</evipdus:menuItem>
				</sec:authorize>

				<sec:authorize access="isAuthenticated()">

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"></a>
						<ul class="dropdown-menu">
							<li style="text-align: center">
								<div class="navbar-login">
									<div class="row">
										<div class="col-lg-8">
											<p class="text-center">
												<strong><sec:authentication property="name" /></strong>
											</p>
											<evipdus:menuItem active="${name eq 'myprofile' }"
												url="/myprofile" title="Mi perfil">
												<span>Mi perfil</span>
											</evipdus:menuItem>
											<form action="/logout" method=post>
												<input type="hidden" name="${_csrf.parameterName}"
													value="${_csrf.token }" /> <input type="submit"
													value="Cerrar sesion" style="align-content: center">
											</form>

										</div>
									</div>

								</div>
							</li>
						</ul></li>
				</sec:authorize>
		</div>

	</div>
</nav>
