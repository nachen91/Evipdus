<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="evipdus" tagdir="/WEB-INF/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<evipdus:layout pageName="Error: Acceso Denegado">
	<h2 class="titulo" style="font-family: 'Open+Sans'; font-size: 30px; padding:30px"><em>La página a la que está intentando acceder no existe o no se encuentra disponible.</em></h2>
    

    <p>${fn:escapeXml(exception.message)}</p>
	<button id='volver' type="button" onclick="history.back()" name="volver atrás" value="volver atrás" style="font-family: 'Open-Sans';">Volver</button>
</evipdus:layout>
