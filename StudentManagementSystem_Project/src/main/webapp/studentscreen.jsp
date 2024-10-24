<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="view" style="height: 530px" id="view">
			<h1>Student Detail</h1>
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
						  		
						  		<c:forEach items="${details}" var="s">
						  		<tr>
						  		
						  			<th>${s.studentFullName}</th>
						  			<th>${s.studentEmail}</th>
						  			<th>${s.studentContact}</th>
						  			<th>${s.studentCollageName}</th>
						  			<th>${s.studentAge}</th>
						  			<th>${s.studentAddress}</th>
						  			<th>${s.studentCourse}</th>
						  			<th>${s.batchMode}</th>
						  			<th>${s.batchNumber}</th>
						  			<th>${s.feesPaid}</th>
						  			<th><button type="button" class="btn btn-warning"><a href="edit?contact=${s.studentContact}">Update</a></button></th>
		
						  			
						  		</tr>
						  		
						  		</c:forEach>
						  </tbody>
						</table>
		</div>
</body>
</html>