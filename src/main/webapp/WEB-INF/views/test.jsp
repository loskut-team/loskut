<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Optical Illusion
  Date: 20.01.2016
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="generator" content="Mobirise v2.6, mobirise.com">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="resources/assets/images/logo.png" type="image/x-icon">
    <meta name="description" content="How to create a responsive image gallery with Bootstrap, jQuery and CSS?">
    <title>Bootstrap Image Gallery with Responsive Masonry Grid</title>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:700,400&amp;subset=cyrillic,latin,greek,vietnamese">
    <link rel="stylesheet" href="resources/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/assets/socicon/css/socicon.min.css">
    <link rel="stylesheet" href="resources/assets/mobirise/css/style.css">
    <link rel="stylesheet" href="resources/assets/mobirise-gallery/style.css">
    <link rel="stylesheet" href="resources/assets/mobirise-slider/style.css">
    <link rel="stylesheet" href="resources/assets/mobirise/css/mbr-additional.css" type="text/css">
</head>
<body>
<section class="mbr-gallery mbr-section mbr-section--no-padding" id="gallery1-2"
         style="background-color: rgb(255, 255, 255);">
    <!-- Gallery -->
    <div class=" mbr-gallery-layout-default">
        <div>
            <div id="gallery" class="row mbr-gallery-row no-gutter">
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="0" data-toggle="modal">
                        <img alt="" src="resources/assets/images/115000x3338-1492000x1335-167.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="1" data-toggle="modal">
                        <img alt="" src="resources/assets/images/25000x3338-1512000x1335-161.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="2" data-toggle="modal">
                        <img alt="" src="resources/assets/images/35000x3338-1632000x1335-187.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="3" data-toggle="modal">
                        <img alt="" src="resources/assets/images/45000x3338-1662000x1335-124.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="4" data-toggle="modal">
                        <img alt="" src="resources/assets/images/55000x3338-1802000x1335-183.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="5" data-toggle="modal">
                        <img alt="" src="resources/assets/images/65000x3338-1712000x1335-160.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="6" data-toggle="modal">
                        <img alt="" src="resources/assets/images/354600x3100-1902000x1348-160.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
                <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item">
                    <a href="#lb-gallery1-2" data-slide-to="7" data-toggle="modal">
                        <img alt="" src="resources/assets/images/424600x3100-1942000x1348-111.jpg">
                        <span class="icon glyphicon glyphicon-zoom-in"></span>
                    </a>
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
    </div>

    <!-- Lightbox -->
    <div data-app-prevent-settings="" class="mbr-slider modal fade carousel slide" tabindex="-1" data-keyboard="true"
         data-interval="false" id="lb-gallery1-2">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <ol class="carousel-indicators">
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="0"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="1"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="2"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="3"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="4"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="5"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" data-slide-to="6"></li>
                        <li data-app-prevent-settings="" data-target="#lb-gallery1-2" class=" active"
                            data-slide-to="7"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item">
                            <img alt="" src="resources/assets/images/115000x3338-149.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/25000x3338-151.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/35000x3338-163.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/45000x3338-166.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/55000x3338-180.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/65000x3338-171.jpg">
                        </div>
                        <div class="item">
                            <img alt="" src="resources/assets/images/354600x3100-190.jpg">
                        </div>
                        <div class="item active">
                            <img alt="" src="resources/assets/images/424600x3100-194.jpg">
                        </div>
                    </div>
                    <a class="left carousel-control" role="button" data-slide="prev" href="#lb-gallery1-2">
                        <span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" role="button" data-slide="next" href="#lb-gallery1-2">
                        <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>

                    <a class="close" href="#" role="button" data-dismiss="modal">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
                        <span class="sr-only">Close</span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
<script src="resources/assets/jquery/jquery.min.js"></script>
<script src="resources/assets/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/assets/smooth-scroll/SmoothScroll.js"></script>
<script src="resources/assets/masonry/masonry.pkgd.min.js"></script>
<script src="resources/assets/imagesloaded/imagesloaded.pkgd.min.js"></script>
<script src="resources/assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
<script src="resources/assets/social-likes/social-likes.js"></script>
<script src="resources/assets/jarallax/jarallax.js"></script>
<script src="resources/assets/mobirise/js/script.js"></script>
<script src="resources/assets/mobirise-gallery/script.js"></script>

<script>
   $(document).ready(function(){
       $.ajax({
           type: "POST",
           url: "/cloth/read/all",
           contentType: "application/json; charset=utf-8",
           dataType: "json",
           success: function (data) {
                alert(JSON.stringify(data))
                for(var i in data.entities){
                   $('#gallery').append('<div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item"> <a href="#lb-gallery1-2" data-slide-to="'+i+'" data-toggle="modal"> <img alt="" src="'+data.entities[i].src+'"><span class="icon glyphicon glyphicon-zoom-in"></span></a></div>');
                }
           }
       });
   });
</script>

</html>