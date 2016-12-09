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
<% List<Contact> contacts=new ContactService().listeContactsWithPhone(); %>
<% List<Telephone> phones=new PhoneService().listePhone();  %>

<body>
<html:form action="/ModifyPhone">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="addmoreinfo.page.add.info"/></div>
		<div class="panel-body">
		
		<div class="form-group">
		  <label for="contact">liste contact</label>
			  <select name="id" class="form-control">
				<% for (Telephone t : phones)
					{ %>		
				    <option value="<%=Integer.toString(t.getId())%>">
						<%=t.toString()%>
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
		    <label for="numeroTelephone">Numero de Telephone</label>
		    <input type="text" class="form-control" id="numeroTelephone" placeholder="numeroTelephone" name="numTelephone">
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