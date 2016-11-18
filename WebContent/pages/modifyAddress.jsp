<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<jsp:include page="enTete.jsp"></jsp:include>
		<title><bean:message key="main.page.title"/></title>
<html>


<body>
<html:form action="/ModifyAddress">

<html:errors/>
									<!-- AJOUT ADRESS A UN CONTACT	 -->
<div class="col-md-6">
	<div class="panel panel-info">
		<div class="panel-heading"><bean:message key="addmoreinfo.page.add.info"/></div>
		<div class="panel-body">
		<div class="form-group">
		    <label for="ida">ID</label>
		    <input type="text" class="form-control" id="ida" placeholder="id" name="id">
		  </div>
		  <div class="form-group">
		    <label for="firstName">Street</label>
		    <input type="text" class="form-control" id="street" placeholder="street" name="street">
		  </div>
		  <div class="form-group">
		    <label for="lastName">City</label>
		    <input type="text" class="form-control" id="city" placeholder="city" name="city">
		  </div>
		  <div class="form-group">
		    <label for="email">Zip</label>
		    <input type="text" class="form-control" id="zip" placeholder="zip code" name="zip">
		  </div>
		  <div class="form-group">
		    <label for="email">Country</label>
		    <input type="text" class="form-control" id="country" placeholder="Country" name="country">
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