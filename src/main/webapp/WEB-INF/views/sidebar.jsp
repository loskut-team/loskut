<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Modern Business - Start Bootstrap Template</title>

    <!-- Bootstrap Core CSS -->
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/resources/css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">Start Bootstrap</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="/about">About</a>
                    </li>
                    <li>
                        <a href="/services">Services</a>
                    </li>
                    <li>
                        <a href="/contact">Contact</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Portfolio <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="/portfolio-1-col">1 Column Portfolio</a>
                            </li>
                            <li>
                                <a href="/portfolio-2-col">2 Column Portfolio</a>
                            </li>
                            <li>
                                <a href="/portfolio-3-col">3 Column Portfolio</a>
                            </li>
                            <li>
                                <a href="/portfolio-4-col">4 Column Portfolio</a>
                            </li>
                            <li>
                                <a href="/portfolio-item">Single Portfolio Item</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Blog <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="/blog-home-1">Blog Home 1</a>
                            </li>
                            <li>
                                <a href="/blog-home-2">Blog Home 2</a>
                            </li>
                            <li>
                                <a href="/blog-post">Blog Post</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown active">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Other Pages <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="/full-width">Full Width Page</a>
                            </li>
                            <li class="active">
                                <a href="/sidebar">Sidebar Page</a>
                            </li>
                            <li>
                                <a href="/faq">FAQ</a>
                            </li>
                            <li>
                                <a href="/404">404</a>
                            </li>
                            <li>
                                <a href="/pricing">Pricing Table</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Sidebar Page
                    <small>Subheading</small>
                </h1>
                <ol class="breadcrumb">
                    <li><a href="/">Home</a>
                    </li>
                    <li class="active">Sidebar Page</li>
                </ol>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <!-- Sidebar Column -->
            <div class="col-md-3">
                <div class="list-group">
                    <a href="/" class="list-group-item">Home</a>
                    <a href="/about" class="list-group-item">About</a>
                    <a href="/services" class="list-group-item">Services</a>
                    <a href="/contact" class="list-group-item">Contact</a>
                    <a href="/portfolio-1-col" class="list-group-item">1 Column Portfolio</a>
                    <a href="/portfolio-2-col" class="list-group-item">2 Column Portfolio</a>
                    <a href="/portfolio-3-col" class="list-group-item">3 Column Portfolio</a>
                    <a href="/portfolio-4-col" class="list-group-item">4 Column Portfolio</a>
                    <a href="/portfolio-item" class="list-group-item">Single Portfolio Item</a>
                    <a href="/blog-home-1" class="list-group-item">Blog Home 1</a>
                    <a href="/blog-home-2" class="list-group-item">Blog Home 2</a>
                    <a href="/blog-post" class="list-group-item">Blog Post</a>
                    <a href="/full-width" class="list-group-item">Full Width Page</a>
                    <a href="/sidebar" class="list-group-item active">Sidebar Page</a>
                    <a href="/faq" class="list-group-item">FAQ</a>
                    <a href="/404" class="list-group-item">404</a>
                    <a href="/pricing" class="list-group-item">Pricing Table</a>
                </div>
            </div>
            <!-- Content Column -->
            <div class="col-md-9">
                <h2>Section Heading</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Soluta, et temporibus, facere perferendis veniam beatae non debitis, numquam blanditiis necessitatibus vel mollitia dolorum laudantium, voluptate dolores iure maxime ducimus fugit.</p>
            </div>
        </div>
        <!-- /.row -->

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="/resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="/resources/js/bootstrap.min.js"></script>

</body>

</html>
