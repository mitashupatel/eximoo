<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Add Questions Quiz</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/eximoo/resources/dist/img/favicon.ico" type="image/x-icon"/>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="/eximoo/resources/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="/eximoo/resources/dist/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>

<script>
	function makeNewQuestionField(){
		var data = "<div class='row'> <div class='col-md-12 col-sm-12'> <div class='form-group'>  <label for='exampleInputEmail1'>Enter Question Here</label> <input type='text' class='form-control' id='blogtitle' placeholder='Enter title'> </div>  </div> </div><div class='row'><div class='col-md-6 col-sm-12'><div class='form-group'><label for='exampleInputEmail1'>Enter Option A: </label><input type='text' class='form-control' id='blogtitle' placeholder='Enter title'></div></div><div class='col-md-6 col-sm-12'><div class='form-group'><label for='exampleInputEmail1'>Enter Option B: </label><input type='text' class='form-control' id='blogtitle' placeholder='Enter title'></div></div></div><div class='row'><div class='col-md-6 col-sm-12'><div class='form-group'><label for='exampleInputEmail1'>Enter Option C: </label><input type='text' class='form-control' id='blogtitle' placeholder='Enter title'></div></div><div class='col-md-6 col-sm-12'><div class='form-group'><label for='exampleInputEmail1'>Enter Option D: </label><input type='text' class='form-control' id='blogtitle' placeholder='Enter title'></div></div></div><div class='row'><div class='col-md-6 col-sm-12'><div class='form-group'><label for='exampleInputEmail1'>Enter Right Answer: </label><input type='text' class='form-control' id='blogtitle' placeholder='Enter title'></div></div><div class='col-md-6 col-sm-12'></div></div></div>";
				 document.getElementById("mylocation").innerHTML = data;
	}
</script>


</head>
<body>
<%@ include file="lefthead.jsp" %>




<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1> Quiz Questions</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="dashboard.jsp">Home</a></li>
              <li class="breadcrumb-item active">Add Quiz Questions</li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          <div class="col-md-12">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Add Quiz Question </h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="/eximoo/admin/addQuestion" role="form" modelAttribute="question">
              <form:hidden path="id" class="form-control" id="id"/>
                <div class="card-body ">
                	
                	<div class="row">
                  		<div class="col-md-12 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Question Here</label>
                   				 <form:input type="text" path="questionName" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		
                		</div>
                		
                	</div>
                	
                	<div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option A: </label>
                   				 <form:input type="text" path="optionA" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option B: </label>
                   				 <form:input type="text" path="optionB" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		</div>
                		
                	</div>
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option C: </label>
                   				 <form:input type="text" path="optionC" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		<div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Option D: </label>
                   				 <form:input type="text" path="optionD" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		</div>
                		
                	</div>
                    <div class="row">
                  		<div class="col-md-6 col-sm-12">
                            <div class="form-group">
                   				 <label for="exampleInputEmail1">Enter Right Answer: </label>
                   				 <form:input type="text" path="answer" class="form-control" id="blogtitle" placeholder="Enter title"/>
                 			</div>
                		</div>
                		<div class="col-md-6 col-sm-12">
			          		
                		</div>	
                	</div>
                	
                 </div>
                 
                 <!-- <div  class="card body"id="mylocation" stye="    margin-bottom: 20px;padding-left: 20px;padding-right: 20px;border-bottom-width: 20px;padding-top: 20px;"></div>
                  <button type="button" class="btn  btn-primary" value="Comment" onclick="makeNewQuestionField()">Click here</button>
                 <div class="card-footer">
                  -->
                  
                 
                  
                  <button type="submit" class="btn btn-primary">Submit</button>
                </form:form>

                
          <!--/.col (right) -->
        </div>
        </div></div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->



</body>
</html>