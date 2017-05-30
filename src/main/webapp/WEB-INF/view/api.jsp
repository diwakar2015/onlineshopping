<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap-united.css" rel="stylesheet" />

<style>
.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<title>Login</title>
</head>
<body>
	<script src="${pageContext.request.contextPath}/resources/jquery-1.8.3.js">
		
	</script>

	<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.js">
		
	</script>

	<div class="navbar navbar-default">

		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-responsive-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<div class="navbar-collapse collapse navbar-responsive-collapse">
			<form class="navbar-form navbar-right">
				<input type="text" class="form-control" placeholder="Search Product(s)">
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="add.html">Add Product</a></li>
				<li><a href="home.html">Browse Products</a></li>
				<li><a href="profile.html">Profile</a></li>
				<li class="active"><a href="profile.html">API</a></li>
				<li><a href="logout.html">Logout</a></li>
			</ul>
		</div>
		<!-- /.nav-collapse -->
	</div>



	<div class="col-lg-6 col-lg-offset-3">
		<div class="well">
			<div class="container">
				<div class="row">
					<div class="col-lg-6">
						
					
<p>
  <a class="btn btn-primary" data-toggle="collapse" href="#api1" aria-expanded="false" aria-controls="collapseExample">
   Get All Products
  </a>
</p>
<div class="collapse" id="api1">
  <div class="card card-block">
  <p>Action : To Get the all products</p>
  <p>URL: /v0/products</p>
  <p>Method: GET</p>
  </div>
</div>

<p>
  <a class="btn btn-primary" data-toggle="collapse" href="#api2" aria-expanded="false" aria-controls="collapseExample">
   Get A product by Id
  </a>
</p>
<div class="collapse" id="api2">
  <div class="card card-block">
  <p>Action : To Get a product by id</p>
  <p>URL: /v0/products/{id}</p>
  <p>Method: GET</p>
  </div>
</div>

					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>