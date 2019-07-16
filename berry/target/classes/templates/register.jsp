<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<link href="/css/bootstrap.min.css" rel="stylesheet">
<script src="/js/bootstrap.min.js"></script>
<script src="/jquery/jquery.min.js"></script>
<link href="/css/register.css" rel="stylesheet">
<link href="/css/style.css" rel="stylesheet">

<div class="container p-t-55">
            <form:form class="form-horizontal" method="POST" modelAttribute="userForm role="form">
                <img class="mb-4" src="images/unnamed.png" alt="" >
                <h4>&nbsp &nbsp Create your Account</h4>
                <h6>&nbsp &nbsp &nbsp &nbsp  to start sharing</h6><br>
                <div class="form-group">
                    <label for="firstName" class="col-sm-3 control-label">First Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="firstName" placeholder="First Name" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="lastName" class="col-sm-3 control-label">Last Name</label>
                    <div class="col-sm-9">
                        <input type="text" id="lastName" placeholder="Last Name" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-9">
                        <input type="email" id="email" placeholder="Email" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="userName" class="col-sm-3 control-label">Username</label>
                    <div class="col-sm-9">
                        <input type="text" id="userName" placeholder="Username" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="password" class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" id="password" placeholder="Password" class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="school" class="col-sm-3 control-label">School</label>
                    <div class="col-sm-9">
                        <select id="school" class="form-control">
                             <option>Choose</option>                           
                            <option>Sabanci University</option>
                            <option>Koc University</option>
                            <option>Istanbul Technical University</option>
                            <option>Other</option>
                        </select>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-sm-9 col-sm-offset-3">
                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                    </div>
                </div>
                <div class="text-center p-t-115">
					<span class="txt1">Have an account? </span><a class="txt2" href="login"> Sign In Instead</a>
	  			</div>
            </form:form> <!-- /form -->
        </div> <!-- ./container -->