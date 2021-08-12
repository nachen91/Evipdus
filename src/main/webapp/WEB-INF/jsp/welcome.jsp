<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="evipdus" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet'>

 <evipdus:layout pageName ="home">
 
  <h3 class="titulo" style="font-family: 'Open+Sans'; font-size: 300%;  align-left"><fmt:message key="evipdus"/></h3>
   
  <div class="col">
  <div class="col-md-6">
  		<div class="btn-block">
  		<p style="font-family:'Open+Sans';font-size:32px">Conoce los riesgos de tu empresa<br/>
  		<a href="/ariesgos" target="_blank">Learn more ></a>
  		<spring:url value="/resources/images/logo.png" htmlEscape="true" var="evipdusImage"/>
  		<img class="img-responsive" src="${fn:escapeXml(evipdusImage)}"/>
  	</div>
  	
  	
  	</div>
  
  
  </div>          
 
 </evipdus:layout>