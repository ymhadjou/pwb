<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<jsp:include page="enTete.jsp"></jsp:include>
		<title><bean:message key="main.page.title"/></title>
<html>

<body>
<html:form action="/SearchPhone">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="addmoreinfo.page.add.info"/></div>
		<div class="panel-body">
		<div class="form-group">
		    <label for="ida">ID</label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  <div class="form-group">
		  <button type="submit" class="btn btn-default">Submit</button>
		</div>
	</div>
	</div>
	</div>
</html:form>





	


</body>
</html>