var cloth = {};

$(document).ready(function () {
    var idCorrect = [];

    for (var i = 0; i < data.length; i++) {
        if (data[i].src.length > 2) {
            data[i].clearimg = data[i].src;
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
            $('#inp').removeAttr("readonly");
            $('#userIdBtn').attr("class", "btn btn-danger");
            $('#editModal').modal('toggle');

            $('#modal-sku').val(rowData[0].sku);
            $('#modal-with').val(rowData[0].width);
            $('#modal-length').val(rowData[0].length);
            $('#modal-price').val(rowData[0].pricePerMeter);
            $('#modal-total-price').val(rowData[0].totalPrice);
            $('#modal-img-url').val(rowData[0].clearimg);


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