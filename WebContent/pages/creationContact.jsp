<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<jsp:include page="enTete.jsp"></jsp:include>
		<title><bean:message key="main.page.title"/></title>
<html:html>

	<body>
	
<html:form action="/AddContact">
<html:errors/>
	<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="inscription.page.add.info"/></div>
		<div class="panel-body">
		<div class="form-group">
		    <label for="ida">ID</label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  <div class="form-group">
		    <label for="firstName">Prénom</label>
		    <input type="text" class="form-control" id="firstName" placeholder="prenom" name="firstName">
		  </div>
		  <div class="form-group">
		    <label for="lastName">Nom</label>
		    <input type="text" class="form-control" id="lastName" placeholder="nom" name="lastName">
		  </div>
		  <div class="form-group">
		    <label for="email">Email address</label>
		    <input type="text" class="form-control" id="email" placeholder="Email" name="email">
		  </div>
		  <div class="form-group">

		  <button type="submit" class="btn btn-default">Submit</button>
		
		</div>
	</div>
	</div>
	</div>
</html:form>
	</body>
</html:html>