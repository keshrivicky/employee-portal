<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<<meta charset = "utf-8">  
<meta name = "viewport" content = "width=device-width, initial-scale = 1">  
<link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">  
<script src = "https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"> </script>  
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<script type="text/javascript">
.errorblock{
	color:#000;
	background-color:#ffEEEE;
	boarder :3px solid #ff0000;
	padding: 8px;
	margin:16px;
}


</script>
</head>  
<body>  


  <div class="container">
        <h1> Create New Employee </h1>
      <%--   <div class="alert alert-danger" role="alert">
        <form:errors path= "student.*" cssClass="errorblock"></form:errors> 
        </div>
        --%>
        <form id="saveemployee" action="saveemployee",method="post">
            <div class="form-group">
                <label>Employee Name:</label>
                <input type="text" name="empName" id="empName" class="form-control" value="${name}" required="">
            </div>
            <div class="form-group">
                <label>Employee ID:</label>
                <textarea class="form-control" name="empId" id="age"></textarea>
            </div>
            <div class="form-group">
                <label>Employee dept:</label>
                <input type="text" name="empDept" id="empDept" class="form-control" value="" required="">
            </div>
            <button type="submit" id="btnaddEmployee" class="btn btn-primary save-btn">add Employee</button>

        </form>
        <br />

    </div> 
</body>  
</html>  