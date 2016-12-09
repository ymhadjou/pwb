<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<%@ page import="java.util.*" %>
<%@ page import="org.lip6.struts.domain.*" %>
<%@ page import="org.lip6.struts.services.*" %>
<jsp:include page="enTete.jsp"></jsp:include>
		<title><bean:message key="main.page.title"/></title>
<html>
<% List<Contact> contacts=new ContactService().listeContacts(); %>
<% List<Groupe> groupes =new GroupeService().listeGroupes(); %>
<body>
<html:form action="/DeleteContactFromGroup">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="menu.delete.contactfromgroup"/></div>
		<div class="panel-body">
		
		
		<div class="form-group">
		    <label for="ida">ID</label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  
		 <div class="form-group">
		    <label for="idGroupe">ID du groupe</label>
		    <input type="text" class="form-control" id="idGroupe" placeholder="idGroupe" name="idGroupe">
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