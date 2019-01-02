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
    <link rel="stylesheet" href="${base}/bootstrap/css/ui-elements/card.css">
    <link rel="stylesheet" href="${base}/bootstrap/css/style.css">
</head>

<body> 

<!--====================================================
                         MAIN NAVBAR
======================================================-->        
    <header class="header">
        <nav class="navbar navbar-expand-lg ">
            <div class="search-box">
                <button class="dismiss"><i class="icon-close"></i></button>
                <form id="searchForm" action="#" role="search">
                    <input type="search" placeholder="Search Now" class="form-control">
                </form>
            </div>
            <div class="container-fluid ">
                <div class="navbar-holder d-flex align-items-center justify-content-between">
                    <div class="navbar-header">
                        <a href="index.html" class="navbar-brand">
                            <div class="brand-text brand-big hidden-lg-down"><img src="${base}/bootstrap/img/logo-white.png" alt="Logo" class="img-fluid"></div>
                            <div class="brand-text brand-small"><img src="${base}/bootstrap/img/logo-icon.png" alt="Logo" class="img-fluid"></div>
                        </a>
                        <a id="toggle-btn" href="#" class="menu-btn active">
                            <span></span>
                            <span></span>
                            <span></span>
                        </a>
                    </div>
                </div>
            </div>
        </nav>
    </header>

<!--====================================================
                        PAGE CONTENT
======================================================-->
    <div class="page-content d-flex align-items-stretch">

        <!--***** SIDE NAVBAR *****-->
        <nav class="side-navbar">
            <!-- Sidebar Navidation Menus-->
            <ul class="list-unstyled">
                <@shiro.hasPermission  name="/appManager:view">
                    <li class="active"><a href="index.html">应用管理</a></li>
                </@shiro.hasPermission>
                <@shiro.hasPermission name="/systemManager:view">
                    <li><a href="#apps" aria-expanded="false" data-toggle="collapse">系统管理</a>
                    <ul id="apps" class="collapse list-unstyled">
                        <@shiro.hasPermission name="/userManager:view">
                        <li><a href="calendar.html">用户管理</a></li>
                        </@shiro.hasPermission>
                        <@shiro.hasPermission name="/logManager:view">
                        <li><a href="email.html">日志管理</a></li>
                        </@shiro.hasPermission>
                    </ul>
                    </li>
                </@shiro.hasPermission>
            </ul>
        </nav>

        <div class="content-inner">


        </div>
    </div> 

    <!--Global Javascript -->
    <script src="${base}/bootstrap/js/popper/popper.min.js"></script>
    <script src="${base}/bootstrap/js/jquery.min.js"></script>
    <script src="${base}/bootstrap/js/tether.min.js"></script>
    <script src="${base}/bootstrap/js/bootstrap.min.js"></script>
    <script src="${base}/bootstrap/js/jquery.cookie.js"></script>
    <script src="${base}/bootstrap/js/jquery.validate.min.js"></script>
    <script src="${base}/bootstrap/js/chart.min.js"></script>
    <script src="${base}/bootstrap/js/front.js"></script>
</body>

</html>