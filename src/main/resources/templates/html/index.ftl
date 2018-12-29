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
            <div class="sidebar-header d-flex align-items-center">
                <div class="avatar"><img src="${base}/bootstrap/img/avatar-1.jpg" alt="..." class="img-fluid rounded-circle"></div>
                <div class="title">
                    <h1 class="h4">Steena Ben</h1>
                </div>
            </div>
            <hr>
            <!-- Sidebar Navidation Menus-->
            <ul class="list-unstyled">

                <li class="active"> <a href="index.html"><i class="icon-home"></i>Home</a></li>
                <li><a href="#apps" aria-expanded="false" data-toggle="collapse"> <i class="icon-interface-windows"></i>Apps </a>
                    <ul id="apps" class="collapse list-unstyled">
                        <li><a href="calendar.html">Calendar</a></li> 
                        <li><a href="email.html">Email</a></li> 
                        <li><a href="media.html">Media</a></li> 
                        <li><a href="invoice.html">Invoice</a></li> 
                    </ul>
                </li>
                <li> <a href="chart.html"> <i class="fa fa-bar-chart"></i>Chart </a></li>
                <li><a href="#forms" aria-expanded="false" data-toggle="collapse"> <i class="fa fa-building-o"></i>Forms </a>
                    <ul id="forms" class="collapse list-unstyled">
                        <li><a href="basic-form.html">Basic Form</a></li> 
                        <li><a href="form-layouts.html">Form Layouts</a></li> 
                    </ul>
                </li>
                <li> <a href="maps.html"> <i class="fa fa-map-o"></i>Maps </a></li>
                <li><a href="#pages" aria-expanded="false" data-toggle="collapse"> <i class="fa fa-file-o"></i>Pages </a>
                    <ul id="pages" class="collapse list-unstyled">
                        <li><a href="faq.html">FAQ</a></li> 
                        <li><a href="empty.html">Empty</a></li> 
                        <li><a href="gallery.html">Gallery</a></li> 
                        <li><a href="login.html">Log In</a></li> 
                        <li><a href="register.html">Register</a></li> 
                        <li><a href="search-result.html">Search Result</a></li> 
                        <li><a href="404.html">404</a></li> 
                    </ul>
                </li>
                <li> <a href="tables.html"> <i class="icon-grid"></i>Tables </a></li> 
                <li><a href="#elements" aria-expanded="false" data-toggle="collapse"> <i class="fa fa-globe"></i>UI Elements </a>
                    <ul id="elements" class="collapse list-unstyled">
                        <li><a href="ui-buttons.html">Buttons</a></li> 
                        <li><a href="ui-cards.html">Cards</a></li> 
                        <li><a href="ui-progressbars.html">Progress Bar</a></li> 
                        <li><a href="ui-timeline.html">Timeline</a></li>  
                    </ul>
                </li>
            </ul><span class="heading">Extras</span>
            <ul class="list-unstyled"> 
                <li> <a href="#"> <i class="icon-picture"></i>Demo </a></li>
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