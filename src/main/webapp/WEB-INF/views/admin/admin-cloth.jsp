<%--
  Created by IntelliJ IDEA.
  User: RAYANT
  Date: 17.01.2016
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
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

    <title>Административная панель | Панель управления</title>
    <!-- Top Links -->
    <jsp:include page="/WEB-INF/templates/admin-links-top.jsp"/>
    <!-- Top Links -->
</head>
<body>
<div id="wrapper">

    <!-- Admin left navigation bar and header -->
    <jsp:include page="/WEB-INF/templates/admin-left-bar.jsp"/>
    <!-- /Admin left navigation bar and header -->

    <!-- #page-wrapper -->
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Ткани</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table id="users" class="table table-striped table-bordered table-hover"
                                   cellspacing="0" width="100%">
                                <thead>
                                <tr>
                                    <th>Фото</th>
                                    <th>Арт.</th>
                                    <th>Ширина</th>
                                    <th>Длина</th>
                                    <th>Ц. 1 м</th>
                                    <th>Total</th>
                                </tr>
                                </thead>
                            </table>
                            <table class="table table-user-information">
                                <tbody>
                                <h3 class="panel-title">Редактировать ткани</h3>
                                <tr>
                                    <td>ID ткани:</td>
                                    <td><input id="inp" class="form-control" name="transactionId" readonly required>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <%--<a id="clothIdhref" href="">--%>
                            <%--<button id="userIdBtn" type="submit" class="btn btn-primary disabled">Редактировать--%>
                            <%--</button>--%>
                            <%--</a>--%>
                        </div>
                        <!-- /.table -->
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /#page-wrapper -->
</div>

<%--data-toggle="modal" data-target="#editModal"--%>

<!-- Modal -->
<div class="modal fade" id="editModal" tabindex="-1"
     role="dialog" aria-labelledby="myModalLabel"
     style="z-index: 1051">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close"
                        data-dismiss="modal"
                        aria-label="Close"><span
                        aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="mModalLabel">
                    Редактор</h4>
            </div>

            <div class="col-xs-8">


                <div class="form-group">
                    <label for="modal-sku">Артикул<input id="modal-sku" type="text" class="form-control"
                                                         placeholder="Артикул"></label>
                </div>

                <div class="form-group">
                    <label for="modal-with">Ширина<input id="modal-with" type="text" class="form-control"
                                                         placeholder="Ширина"></label>
                </div>

                <div class="form-group">
                    <label for="modal-length">Длина<input id="modal-length" type="text"
                                                          class="form-control"
                                                          placeholder="Длина"></label>
                </div>
                <div class="form-group">
                    <label for="modal-price">Цена за 1 м<input id="modal-price" type="text"
                                                               class="form-control"
                                                               placeholder="Цена 1 м"></label>
                </div>
                <div class="form-group">
                    <label for="modal-total-price">Общая стоимость<input id="modal-total-price" type="text"
                                                                         class="form-control"
                                                                         placeholder="Общая стоимость"></label>
                </div>
                <div class="form-group">
                    <label for="modal-img-url">Фото<input id="modal-img-url" type="text"
                                                          class="form-control"
                                                          placeholder="Ссылка на фото"></label>
                </div>
            </div>


            <img id="preview-img" src="#" style="width: 100px; height: 100px">

            <div id="main-color" style="width: 50px; height: 50px;"></div>

            <hr>

            <div id="palette"></div>

            <button id="btn">НАЖМИ</button>


            <div class="modal-footer">

                <button id="update-cloth" type="submit"
                        class="btn btn-primary">Сохранить
                </button>
                <button type="button"
                        class="btn btn-default"
                        data-dismiss="modal">Отмена
                </button>
            </div>

        </div>
    </div>
</div>
<!-- Modal -->

<!-- /.panel -->
<!-- Admin bottom links -->
<jsp:include page="/WEB-INF/templates/admin-links-bottom.jsp"/>
<!-- /Admin bottom links -->
<script>
    var data = ${clothList}
</script>
<script src="/resources/js/admin/admin-cloth.js"></script>
<script src="/resources/js/color-thief.js"></script>
<script src="/resources/js/admin/color-parser-custom.js"></script>
</body>
</html>