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
    <link rel="stylesheet" href="/resources/font-awesome/css/font-awesome.min.css">
</head>
<body>
<section class="mbr-gallery mbr-section mbr-section--no-padding" id="gallery1-2"
         style="background-color: rgb(255, 255, 255);">
    <!-- Gallery -->
    <div class=" mbr-gallery-layout-default">
        <div>
            <div id="gallery" class="row mbr-gallery-row no-gutter"></div>
        </div>
        <div class="clearfix"></div>
    </div>

    <!-- Lightbox -->
    <div data-app-prevent-settings="" class="mbr-slider modal fade carousel slide" tabindex="-1" data-keyboard="true"
         data-interval="false" id="lb-gallery1-2">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">

                    <div id ="carousel" class="carousel-inner">
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

            <div id="right-info" class="modal-body"></div>


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
    var content = [];


   $(document).ready(function(){
       $.ajax({
           type: "POST",
           url: "/cloth/read/all",
           contentType: "application/json; charset=utf-8",
           dataType: "json",
           success: function (data) {
             content = content.concat(data.entities);
               var gallery = $('#gallery');
               var carousel = $('#carousel');
                for(var i = 0; i < data.entities.length - 1; i++){
                    gallery.append('<div name="' + i + '" class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item"><a href="#lb-gallery1-2" data-slide-to="' + i + '" data-toggle="modal"> <img alt="" src="' + data.entities[i].src + '"><span class="icon glyphicon glyphicon-zoom-in"></span></a></div>');
                    carousel.append('<div id=' + i + ' class="item"><div></div><img alt="" src="' + data.entities[i].src + '"></div>');
                }
               gallery.append('<div name="' + (data.entities.length - 1) + '" class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mbr-gallery-item"><a href="#lb-gallery1-2" data-slide-to="' + (data.entities.length - 1) + '" data-toggle="modal"> <img alt="" src="' + data.entities[data.entities.length - 1].src + '"><span class="icon glyphicon glyphicon-zoom-in"></span></a></div>');
               carousel.append('<div id=' + i + ' class="item active"><img alt="" src="' + data.entities[data.entities.length - 1].src + '"></div>');

               $('.carousel-control, .mbr-gallery-item').click(function () {
                   setTimeout(function () {
                       var activeId = $('.active').attr('id');
                       var item = data.entities[activeId];
                       var rightInfo = $('#right-info').html("");
                       var sku = '<div style="margin-top: -500px; margin-left: 650px"><div style="color: #ffffff"><h2>Артикул:' + item.sku + '</h2></div>';
                       var length = '<div style="color: #ffffff"><h2>Длинна:' + item.length + '</h2></div>';
                       var width = '<div style="color: #ffffff"><h2>Ширина:' + item.width + '</h2></div>';
                       var pricePerMeter = '<div style="color: #ffffff"><h2>Цена за метр: ' + item.pricePerMeter + '</h3></div>';
                       var totalPrice = '<div style="color: #ffffff"><h2>Общая цена: ' + item.totalPrice + '</h2></div>';
                       var button = '<button onclick="onAddClick(' + activeId + ')"  type="button" data-dismiss="modal" class="btn btn-danger">В корзину</button></div>';
                       rightInfo.append(sku + length + width + pricePerMeter + totalPrice + button)
                   }, 750);
               });
           }
       });
   });

    var onAddClick = function (activeId) {
        alert("Ткань с id: " + activeId + " добавлена в корзину");
        content.splice(activeId,1);
        alert(content.length);
        $('#' + activeId).detach();
        $('div[name='+activeId+']').detach();
        $('#' + content.length-1).addClass("active");
    }

</script>

</html>