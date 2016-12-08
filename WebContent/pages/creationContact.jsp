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
<html:html>
		<% List<Address> adresses=new AdresseService().getAllAddress();%>
	<body>
	
<html:form action="/AddContact">

<html:errors/>
	<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="inscription.page.add.info"/></div>
		<div class="panel-body">
		<div class="form-group">
		    <label for="ida"><bean:message key="form.id.contact"/></label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  <div class="form-group">
		    <label for="firstName"><bean:message key="form.firstName"/></label>
		    <input type="text" class="form-control" id="firstName" placeholder="prenom" name="firstName">
		  </div>
		  <div class="form-group">
		    <label for="lastName"><bean:message key="form.lastname"/></label>
		    <input type="text" class="form-control" id="lastName" placeholder="nom" name="lastName">
		  </div>
		  <div class="form-group">
		    <label for="email"><bean:message key="form.mail"/></label>
		    <input type="text" class="form-control" id="email" placeholder="Email" name="email">
		  </div>
		  
		  <div class="form-group">
		  <label for="adresse">Adresse</label>
			  <select name="idAdresse">
			  <option value="0">Aucune adresse</option>
				<% for (Address adress : adresses)
					{ %>		
				    <option value="<%=Integer.toString(adress.getId())%>">
						<%=adress.toString()%>
					</option>
					<% }%>
			  </select>
		  </div>
		  
		  <div class="form-group">
		  <button type="submit" class="btn btn-default"><bean:message key="form.submit"/></button>
		
		</div>
	</div>
	</div>
	</div>
</html:form>
	</body>
</html:html>