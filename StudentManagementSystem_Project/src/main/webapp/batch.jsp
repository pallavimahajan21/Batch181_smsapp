<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="d-flex justify-content-center align-center">
		<div class="w-50 align-middle border border-info border-3 mt-2"
			style="height: 500px">


			<h6 class="p-3 text-primary ">
				<u>Batch Details :-</u>
			</h6>
			<div class="border border-secondary m-3 p-2">
				<table class="table table-hover border border-secondary ">
					<tbody>
						<tr class="table-primary fs-6">
							<th>Student Id</th>
							<td>${s.studentId}</td>
						</tr>
						<tr class="table-primary fs-6">
							<th>Student Name</th>
							<td>${s.studentFullName}</td>
						<tr class="table-primary fs-6">
							<th>Course Name</th>
							<td>${s.studentCourse}</td>
						</tr>

						<tr class="table-primary fs-6">
							<th>Batch Number</th>
							<td>${s.batchNumber}</td>
						</tr>
						</tr>
						<tr class="table-danger fs-6">
							<th>Fees Paid</th>
							<td>${s.feesPaid}</td>
						</tr>

					</tbody>
				</table>
				<form action="updateBatch">
					<input type="text" name="studentid" value="${s.studentId}"
						hidden="true">
					<div class="bg-dark p-2 d-flex justify-content-between">
						<label for="batchNumber" class="text-info"><b>Select
								Batch<br> Number
								</b>
								</label>
								<select name="batchNumber">
								<option >Select Batch Number</option> 
					                    <option value="FDJ-181">FDJ-181</option>
									    <option value="REG-181">REG-181</option>
					                    <option value="FDJ-160">FDJ-160</option> 
					                    <option value="REG-160">REG-160</option> 			                    
					                    <option value="FDJ-161">FDJ-161</option> 
					                    <option value="REG-160">REG-161</option> 
					                    <option value="FDJ-161">FDJ-162</option> 
					                    <option value="REG-161">REG-162</option>
								</select>
										
					</div>
					<div class="d-flex justify-content-center pt-5">
						<button class="btn btn-success btn-sm ">Update Batch</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>