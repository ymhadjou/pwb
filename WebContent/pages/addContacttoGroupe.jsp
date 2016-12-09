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
<body>
<% List<Contact> contacts=new ContactService().listeContacts(); %>
<% List<Groupe> groupes =new GroupeService().listeGroupes(); %>
<html:form action="/AddContactToGroupe">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="form.add.groupContact"/></div>
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
		  <label for="groupe">liste contact</label>
			  <select name="idGroupe" class="form-control">
				<% for (Groupe g : groupes)
					{ %>		
				    <option value="<%=Integer.toString(g.getIdGroupe())%>">
						<%=g.toString()%>
					</option>
					<% }%>
			  </select>
		  </div>
		  
		  

		  <button type="submit" class="btn btn-default"><bean:message key="form.submit"/></button>
		</div>
	</div>
	</div>
</html:form>





	


</body>
</html>