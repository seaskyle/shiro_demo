<!DOCTYPE html>
<html>
<#assign base=request.contextPath />
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">

    <title>Bootstrap Admin Template </title>
    <link rel="shortcut icon" href="${base}/bootstrap/img/favicon.ico">
    
    <!-- global stylesheets -->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
    <link rel="stylesheet" href="${base}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${base}/bootstrap/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${base}/bootstrap/css/font-icon-style.css">
    <link rel="stylesheet" href="${base}/bootstrap/css/style.default.css" id="theme-stylesheet">

    <!-- Core stylesheets -->
    <link rel="stylesheet" href="${base}/bootstrap/css/pages/login.css">
</head>

<body> 

<!--====================================================
                        PAGE CONTENT
======================================================--> 
      <section class="hero-area">
        <div class="overlay"></div>
        <div class="container">
          <div class="row">
            <div class="col-md-12 ">
                <div class="contact-h-cont">
                  <h3 class="text-center"><img src="${base}/bootstrap/img/logo.png" class="img-fluid" alt=""></h3><br>
                  <form id="login-form" action="/doLogin" method="post">
                      <#if message??>
                         <div>${message}</div>
                      </#if>
                    <div class="form-group">
                      <input type="text" class="form-control" name="userName" value="admin" placeholder="Enter Username">
                    </div>  
                    <div class="form-group">
                      <input class="form-control" type="password" value="admin" name="password">
                    </div>   
                    <button class="btn btn-general btn-blue" role="button"><i fa fa-right-arrow></i>Login</button>
                  </form>
                </div>
            </div>
          </div>  
        </div>
      </section>
      
    <!--Global Javascript -->
    <script src="${base}/bootstrap/js/jquery.min.js"></script>
    <script src="${base}/bootstrap/js/tether.min.js"></script>
    <script src="${base}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>