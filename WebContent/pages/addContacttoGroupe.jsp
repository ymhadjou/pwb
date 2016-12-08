<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<jsp:include page="enTete.jsp"></jsp:include>
		<title><bean:message key="main.page.title"/></title>
<body>
<html:form action="/AddContactToGroupe">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="form.add.groupContact"/></div>
		<div class="panel-body">
		<div class="form-group">
		    <label for="ida"><bean:message key="form.id.contact"/></label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  <div class="form-group">
		    <label for="idGroupe"><bean:message key="form.group"/></label>
		    <input type="text" class="form-control" id="idGroupe" placeholder="idGroupe" name="idGroupe">
		  </div>
		  <button type="submit" class="btn btn-default"><bean:message key="form.submit"/></button>
		</div>
	</div>
	</div>
	</div>
</html:form>





	


</body>
</html>