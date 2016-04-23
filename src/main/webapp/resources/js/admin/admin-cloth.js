var cloth = {};

$(document).ready(function () {
    var idCorrect = [];

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
            cloth.id = rowData[0].id;
            //$('#clothIdhref').attr("href", "/edit-profile/" + rowData[0].id);
            $('#inp').removeAttr("readonly");
            $('#userIdBtn').attr("class", "btn btn-danger");
            $('#editModal').modal('toggle');

            $('#modal-sku').val(rowData[0].sku);
            $('#modal-with').val(rowData[0].width);
            $('#modal-length').val(rowData[0].length);
            $('#modal-price').val(rowData[0].pricePerMeter);
            $('#modal-total-price').val(rowData[0].totalPrice);
            $('#modal-img-url').val(rowData[0].src);


        })
        .on('deselect', function (e, dt, type, indexes) {
            $("input[name='transactionId']").attr("value", "");
            $('#inp').attr("readonly", "readonly");
            $('#userIdBtn').attr("class", "btn btn-danger disabled");
        });
});


$('#update-cloth').on('click', function () {

    cloth.sku = $('#modal-sku').val();
    cloth.src = $('#modal-img-url').val();
    cloth.pricePerMeter = $('#modal-price').val();
    cloth.length = $('#modal-length').val();
    cloth.width = $('#modal-with').val();
    cloth.totalPrice = $('#modal-total-price').val();
    updateCloth();

});


function updateCloth() {

    $.ajax({
        type: "POST",
        url: "/cloth/update",
        contentType: "application/json",
        data: JSON.stringify(cloth),
        success: function (response) {
            alert("Успех!")
        }
    });
}


//$(document).ready(function () {
//    var data;
//    var filterOptions = {};
//    filterOptions.skip = 0;
//    filterOptions.limit = 1000000;
//    $.ajax({
//        type: "POST",
//        contentType: "application/json; charset=utf-8",
//        url: "/api/rest/profilesService/profile/read/all",
//        data: JSON.stringify(filterOptions),
//        success: function (response) {
//            alert(JSON.stringify(response));
//            data = response.entities;
//
//            for (var i = 0; i < data.length; i++) {
//                if (data[i].contact !== null) {
//                    if (data[i].contact.pic.length > 2) {
//                        data[i].contact.pic = '<img src="/api/rest/fileStorage/PROFILE/file/read/id/' + data[i].contact.pic + '" width="100" height="100">';
//                    }
//                    else {
//                        data[i].contact.pic = '<img src="/resources/images/no_photo.jpg" width="100" height="100">';
//                    }
//                }
//                else {
//                    data[i].contact = {};
//                    data[i].contact.pic = '<img src="/resources/images/no_photo.jpg" width="100" height="100">';
//                }
//            }
//
//            var table = $('#users').DataTable({
//                select: {
//                    style: 'single'
//                },
//                data: data,
//                "columns": [
//                    {"data": "src"},
//                    {"data": "sku"}
//                ],
//                "language": {
//                    "url": "//cdn.datatables.net/plug-ins/1.10.9/i18n/Russian.json"
//                }
//            });
//
//            table
//                    .on('select', function (e, dt, type, indexes) {
//                        var rowData = table.rows(indexes).data().toArray();
//                        $("input[name='transactionId']").attr("value", rowData[0].id);
//                        $('#userIdhref').attr("href", "/edit-profile/" + rowData[0].id);
//                        $('#inp').removeAttr("readonly");
//                        $('#userIdBtn').attr("class", "btn btn-danger");
//                    })
//                    .on('deselect', function (e, dt, type, indexes) {
//                        $("input[name='transactionId']").attr("value", "");
//                        $('#inp').attr("readonly", "readonly");
//                        $('#userIdBtn').attr("class", "btn btn-danger disabled");
//                    });
//        }
//    });
//});
//
//function submitChanges() {
//    $.ajax({
//        type: "POST",
//        url: "/admin/ajaxAdminConfirm",
//        data: {"idCorrect": JSON.stringify(idCorrect)},
//        success: function (response) {
//            window.location.href = '/admin';
//        }
//    });
//}