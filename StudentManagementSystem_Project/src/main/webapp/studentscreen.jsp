<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
	
</head>
<body>
	<div class="card">
		<nav class="d-flex justify-content-between p-2 border border-primary">
			<img src="images/cjclogo.jpeg" width="150px" height="70px">
			<div class="pt-2">
				</a> <a href="/">
					<button class="btn btn-outline-primary">Logout</button>
				</a>
			</div>
		</nav>
				<div class="card text-center">
					
								


<table class="table table-striped" border="2px">
						  <thead>
						    <tr>
						      <th scope="col">Name</th>
						      <th scope="col">EmailId</th>
						      <th scope="col">Contact</th>
						      <th scope="col">College Name</th>
						      <th scope="col">Age</th>
						      <th scope="col">Address</th>
						      <th scope="col">Course</th>
						      <th scope="col">BatchMode</th>
						      <th scope="col">BatchNumber</th>
						      <th scope="col">FessPaid</th>
						      <th scope="col">UpdateProfile</th>
						    </tr>
						  </thead>
						  <tbody>	
						 
						  		<tr>
						  			<td>${s.studentFullName}</td>
						  			<td>${s.studentEmail}</td>
						  			<td>${s.studentContact}</td>
						  			<td>${s.studentCollageName}</td>
						  			<td>${s.studentAge}</td>
						  			<td>${s.studentAddress}</td>
						  			<td>${s.studentCourse}</td>
						  			<td>${s.batchMode}</td>
						  			<td>${s.batchNumber}</td>
						  			<td>${s.feesPaid}</td>
						  			<td><button type="button" class="btn btn-warning"><a href="edit?contact=${s.studentContact}">Update</a></button></td>
		
						  			
						  		</tr>
					
						  </tbody>
						</table>s
							</div>
						</div>
</body>
</html>