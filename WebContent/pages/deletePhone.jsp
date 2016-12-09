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
<% List<Telephone> phones=new PhoneService().listePhone();  %>

<body>
<html:form action="/DeletePhone">
<html:errors/>

<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="menu.delete.phone"/></div>
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
		  <button type="submit" class="btn btn-default">Submit</button>
		</div>
	</div>
	</div>
	</div>
</html:form>





	


</body>
</html>