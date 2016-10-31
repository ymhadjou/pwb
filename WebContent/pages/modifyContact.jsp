<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<html:html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<title><bean:message key="menu.add.contact"/></title>
	<html:base/>
</head>
<!-- Menu -->
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <a class="navbar-brand" href="#"><bean:message key="main.page.description"/></a>
	    </div>
	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li><a href="main.jsp"><bean:message key="main.page.accueil"/></span></a></li>
	        <li><a href="../ContactCreation.do"><bean:message key="menu.add.contact"/></a></li>  
	        <li><a href="../AddGroupe.do"><bean:message key="menu.add.group"/></a></li>       
	         
	         <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><bean:message key="menu.add"/><span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="../AddAddress.do"><bean:message key="menu.add.adress"/></a></li>
	            <li><a href="../AddTelephone.do"><bean:message key="menu.add.phone"/></a></li>
	            <li><a href="../AddContactToGroupe.do"><bean:message key="menu.add.groupContact"/></a></li>
	          </ul>
        	</li>
        	
           <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><bean:message key="menu.delete"/><span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="../DeleteContact.do"><bean:message key="menu.delete.contact"/></a></li>
	            <li><a href="../DeleteGroup.do"><bean:message key="menu.delete.group"/></a></li>
	            <li><a href="../DeleteContactFromGroup.do"><bean:message key="menu.delete.contactfromgroup"/></a></li>
	            <li><a href="../DeletePhone.do"><bean:message key="menu.delete.phone"/></a></li>
	            <li><a href="../DeleteAddress.do"><bean:message key="menu.delete.address"/></a></li>
	          </ul>
        	</li>
        	
        	<li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><bean:message key="menu.modify"/><span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="../ModifyContact.do"><bean:message key="menu.modify.contact"/></a></li>
	            <li><a href="../ModifyGroup.do"><bean:message key="menu.modify.group"/></a></li>
	            <li><a href="../ModifyPhone.do"><bean:message key="menu.modify.phone"/></a></li>
	            <li><a href="../ModifyAddress.do"><bean:message key="menu.modify.address"/></a></li>
	          </ul>
        	</li>
        	
        	<li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><bean:message key="menu.search"/><span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="../SearchAddress.do"><bean:message key="menu.search.address"/></a></li>
	            <li><a href="../SearchContact.do"><bean:message key="menu.search.contact"/></a></li>
	            <li><a href="../SearchPhone.do"><bean:message key="menu.search.phone"/></a></li>
	          </ul>
        	</li>
        	
	       </ul>
	    </div>
	  </div>
</nav>
<!-- Fin menu -->
	<body>
	
<html:form action="/ModifyContact">
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