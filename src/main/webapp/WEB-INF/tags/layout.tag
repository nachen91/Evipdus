<%@ tag trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="evipdus" tagdir="/WEB-INF/tags" %>

<%@ attribute name="pageName" required="true" %>
<%@ attribute name="customScript" required="false" fragment="true"%>

<!doctype html>
<html>
<evipdus:htmlHeader/>

<body>
<evipdus:bodyHeader menuName="${pageName}"/>

<div class="container-fluid">
    <div class="container xd-container">

        <jsp:doBody/>

        <evipdus:pivotal/>
    </div>
</div>
<evipdus:footer/>
<jsp:invoke fragment="customScript" />

</body>

</html>

