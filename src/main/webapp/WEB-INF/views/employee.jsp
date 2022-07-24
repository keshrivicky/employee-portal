<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale = 1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"> </script>
<script src='https://kit.fontawesome.com/a076d05399.js'
	crossorigin='anonymous'></script>
</head>
<body>
<div class="container">
		<h1>Employee Detail</h1>
		
		<a href="addEmployee">
			<button type="submit" id="btnaddEmployee"
				class="btn btn-primary save-btn">add Employee</button>
		</a> <br />
		<br>
		<div class="input-group">
		 <form id="searchemp" action="searchemp",method="post">
			<input type="search" class="form-control rounded"
				placeholder="Search" aria-label="Search" name ="searchId"
				aria-describedby="search-addon" />
			<button type="submit" class="btn btn-outline-primary">search</button>
			</form>
		</div>
		<br>
		<fieldset>
			<legend>Employee List </legend>
			<table class="table table-bordered" style="width: 1400px">
				<tr>
					<th width="150" align="center"><center>Id</center></th>
					<th width="400" align="center"><center>Emp Name</center></th>
					<th width="150" align="center"><center> Emp ID</center></th>
					<th width="250" align="center"><center> EMP Department</center></th>
					<th width="100" align="center"><center>Edit</center></th>
					<th width="100" align="center"><center>Delete</center></th>
				</tr>
				<c:forEach items="${listOfEmployee}" var="employee">
					<tr>
						<td width="150" align="center">1</td>
						<td width="400" align="center">${employee.empName}</td>
						<td width="150" align="center">${employee.empId}</td>
						<td width="250" align="center">${employee.empDept}</td>
						<%-- 	<td width="60" align="center"><a href="edit/${student.id}">Edit</a></td> --%>
						<td width="100" align="center"><a href="edit/${employee.empId}">
								<button class="btn btn-success btn-sm rounded-0" type="button"
									data-toggle="tooltip" data-placement="top" title="Edit">
									<i class="fa fa-edit"></i>
								</button>
						</a></td>
						<td width="100" align="center">
							<!-- <button type="button" class="btn btn-danger">Danger</button> -->
							<a href="delete/${employee.empId}"><button
									class="btn btn-danger btn-sm rounded-0" type="button"
									data-toggle="tooltip" data-placement="top" title="Delete">
									<i class="fa fa-trash"></i>
								</button></a>

						</td>
					</tr>
				</c:forEach>
			</table>
		</fieldset>
	</div>
</body>
</html>