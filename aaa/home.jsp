<%@ page contentType="text/html; charset=windows-31j" pageEncoding="windows-31j"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC
	"-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=windows-31j"/>
	<title>トップ - てすと</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" media="all"/>
</head>
<body>

<div id="header">
	<jsp:include page="/WEB-INF/jsp/header.jsp"/>
</div>

<div id="content">
	<div id="main">
		<h2>トップ</h2>
		<c:if test="${unknownIssueType}">
		  	<span class="topinfo"><a href=${pageContext.request.contextPath}/controller/findIssue?init=unknownIssueType>証券区分が未設定の銘柄が存在します。</a></span>
		</c:if>
		<c:if test="${undefinedListedDate}">
		  	<span class="topinfo"><a href=${pageContext.request.contextPath}/controller/findIssue?init=undefinedListedDate>上場日が未設定の銘柄が存在します。</a></span>
		</c:if>
	</div>
	<div id="submenu">
		<jsp:include page="/WEB-INF/jsp/submenu.jsp"/>
	</div>
</div>

<div id="footer">
	<jsp:include page="/WEB-INF/jsp/footer.jsp"/>
</div>

</body>
</html>
