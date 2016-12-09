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
<% List<Contact> contacts=new ContactService().listeContacts(); %>
<body>
<html:form action="/AddTelephone">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="form.add.phone"/></div>
		<div class="panel-body">
		
		
		<div class="form-group">
		  <label for="adresse">liste contact</label>
			  <select name="id" class="form-control">
				<% for (Contact c : contacts)
					{ %>		
				    <option value="<%=Integer.toString(c.getId())%>">
						<%=c.toString()%>
					</option>
					<% }%>
			  </select>
		  </div>
		  
		  		<div class="form-group">
		  <label for="adresse"><bean:message key="form.typePhone"/></label>
			  <select name="typeTelephone" class="form-control">	
				    <option value="fixe">fixe</option>
				    <option value="portable">Portable</option>
				    <option value="fax">Fax</option>
			  </select>
		  </div>

		  <div class="form-group">
		    <label for="numeroTelephone"><bean:message key="form.phone"/></label>
		    <input type="text" class="form-control" id="numeroTelephone" placeholder="numeroTelephone" name="numTelephone">
		  </div>
		  <div class="form-group">
		  <button type="submit" class="btn btn-default"><bean:message key="form.submit"/></button>
		</div>
	</div>
	</div>
	</div>
</html:form>





	


</body>
</html>