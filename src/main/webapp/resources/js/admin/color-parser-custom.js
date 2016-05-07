var img = new Image();

$('#btn').on('click', function () {
    var src = $('#modal-img-url').val();
    $('#preview-img').attr('src', src);

    img.crossOrigin = "anonymous";

    img.src = src;

    img.onload = function () {

        var mainColor = {};

        var colorThief = new ColorThief();
        var result = colorThief.getColor(img);
        mainColor.r = result[0];
        mainColor.g = result[1];
        mainColor.b = result[2];

        $('#main-color').css('background-color', 'rgb(' + mainColor.r + ',' + mainColor.g + ',' + mainColor.b + ')');

        var additionalColorAmount = 5;

        var additionalPalette = colorThief.getPalette(img, additionalColorAmount);

        paletteParse(additionalPalette);

        function paletteParse(additionalPalette) {
            for (var i in additionalPalette) {
                $('#palette').append("<div style='width: 50px; height: 50px; background-color: rgb(" + additionalPalette[i][0] + ", " + additionalPalette[i][1] + ", " + additionalPalette[i][2] + ");'>asdasd</div>")
            }
        }

    };
})