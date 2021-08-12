<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="evipdus" tagdir="/WEB-INF/tags" %>

<%@ attribute name="menuName" required="true" rtexprvalue="true"
              description="Name of the active menu: Inicio, Analisis de riesgos, contactanos, Quienes somos, login" %>

<evipdus:menu name="${menuName}"/>