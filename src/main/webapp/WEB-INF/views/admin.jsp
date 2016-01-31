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
                                    <th>Id</th>
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
                            <a id="userIdhref" href="">
                                <button id="userIdBtn" type="submit" class="btn btn-primary disabled">Редактировать
                                </button>
                            </a>
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
                    Редактов</h4>
            </div>

            <div class="col-xs-4">
                <br>
                <input id="newLogin" type="text"
                       class="form-control"
                       placeholder="Артикул">
                <br>
                <input id="newPassword" type="text"
                       class="form-control"
                       placeholder="Ширина">
            </div>


            <div class="modal-footer">

                <button id="create" type="submit"
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

    $(document).ready(function () {
        var idCorrect = [];
        var data = ${clothList};

        for (var i = 0; i < data.length; i++) {
            if (data[i].src.length > 2) {
                data[i].src = '<img src="' + data[i].src + '" width="100" height="100">';
            }
            else {
                data[i].src = '<img src="/resources/images/no_photo.jpg" width="100" height="100">';
            }
        }

        var table = $('#users').DataTable({
            select: {
                style: 'single'
            },
            data: data,
            "columns": [
                {"data": "src"},
                {"data": "sku"},
                {"data": "width"},
                {"data": "length"},
                {"data": "pricePerMeter"},
                {"data": "totalPrice"}
            ],
            "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.9/i18n/Russian.json"
            }
        });

        table
                .on('select', function (e, dt, type, indexes) {
                    var rowData = table.rows(indexes).data().toArray();
                    $("input[name='transactionId']").attr("value", rowData[0].id);
                    $('#userIdhref').attr("href", "/edit-profile/" + rowData[0].id);
                    $('#inp').removeAttr("readonly");
                    $('#userIdBtn').attr("class", "btn btn-danger");
                    $('#editModal').modal('toggle');

                })
                .on('deselect', function (e, dt, type, indexes) {
                    $("input[name='transactionId']").attr("value", "");
                    $('#inp').attr("readonly", "readonly");
                    $('#userIdBtn').attr("class", "btn btn-danger disabled");
                });
    });




    //    $(document).ready(function () {
    //        var data;
    //        var filterOptions = {};
    //        filterOptions.skip = 0;
    //        filterOptions.limit = 1000000;
    //        $.ajax({
    //            type: "POST",
    //            contentType: "application/json; charset=utf-8",
    //            url: "/api/rest/profilesService/profile/read/all",
    //            data: JSON.stringify(filterOptions),
    //            success: function (response) {
    //                alert(JSON.stringify(response));
    //                data = response.entities;
    //
    //                for (var i = 0; i < data.length; i++) {
    //                    if (data[i].contact !== null) {
    //                        if (data[i].contact.pic.length > 2) {
    //                            data[i].contact.pic = '<img src="/api/rest/fileStorage/PROFILE/file/read/id/' + data[i].contact.pic + '" width="100" height="100">';
    //                        }
    //                        else {
    //                            data[i].contact.pic = '<img src="/resources/images/no_photo.jpg" width="100" height="100">';
    //                        }
    //                    }
    //                    else {
    //                        data[i].contact = {};
    //                        data[i].contact.pic = '<img src="/resources/images/no_photo.jpg" width="100" height="100">';
    //                    }
    //                }
    //
    //                var table = $('#users').DataTable({
    //                    select: {
    //                        style: 'single'
    //                    },
    //                    data: data,
    //                    "columns": [
    //                        {"data": "src"},
    //                        {"data": "sku"}
    //                    ],
    //                    "language": {
    //                        "url": "//cdn.datatables.net/plug-ins/1.10.9/i18n/Russian.json"
    //                    }
    //                });
    //
    //                table
    //                        .on('select', function (e, dt, type, indexes) {
    //                            var rowData = table.rows(indexes).data().toArray();
    //                            $("input[name='transactionId']").attr("value", rowData[0].id);
    //                            $('#userIdhref').attr("href", "/edit-profile/" + rowData[0].id);
    //                            $('#inp').removeAttr("readonly");
    //                            $('#userIdBtn').attr("class", "btn btn-danger");
    //                        })
    //                        .on('deselect', function (e, dt, type, indexes) {
    //                            $("input[name='transactionId']").attr("value", "");
    //                            $('#inp').attr("readonly", "readonly");
    //                            $('#userIdBtn').attr("class", "btn btn-danger disabled");
    //                        });
    //            }
    //        });
    //    });

    //    function submitChanges() {
    //        $.ajax({
    //            type: "POST",
    //            url: "/admin/ajaxAdminConfirm",
    //            data: {"idCorrect": JSON.stringify(idCorrect)},
    //            success: function (response) {
    //                window.location.href = '/admin';
    //            }
    //        });
    //    }
</script>
</body>
</html>