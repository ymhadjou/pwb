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
	<div class="col-md-8">
	<div class="panel panel-default">
	<div class="panel-heading">Ajouts d'infos supplémentaires d'un contact</div>
		  <div class="panel-body">
		  
			    <div class="col-lg-6">
			    <div class="input-group">
			    <html:form action="/AddContact">
			      <input type="text" class="form-control" placeholder="Entrez l'id du contact" name=id>
			      <span class="input-group-btn">
			        <button class="btn btn-default" type="button">Chercher contact</button>
			      </span>
			      </html:form>
			    </div><!-- /input-group -->
			    </div>
		    
		    
		    
		</div>
	</div>
	</div>
</html:form>
	</body>
</html:html>