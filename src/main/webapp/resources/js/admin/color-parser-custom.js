var img = new Image();

var mainColor = {};
var colors = [];

$('#btn').on('click', function () {
    var src = $('#modal-img-url').val();
    $('#preview-img').attr('src', src);

    img.crossOrigin = "anonymous";

    img.src = src;

    img.onload = function () {

        var colorThief = new ColorThief();
        var result = colorThief.getColor(img);
        mainColor.red = result[0];
        mainColor.green = result[1];
        mainColor.blue = result[2];

        $('#main-color').css('background-color', 'rgb(' + mainColor.red + ',' + mainColor.green + ',' + mainColor.blue + ')');

        var additionalColorAmount = 5;

        var additionalPalette = colorThief.getPalette(img, additionalColorAmount);

        paletteParse(additionalPalette);

        function paletteParse(additionalPalette) {
            for (var i in additionalPalette) {

                var color = {};
                color.red = additionalPalette[i][0];
                color.green = additionalPalette[i][1];
                color.blue = additionalPalette[i][2];
                colors.push(color);
                $('#palette').append("<div style='width: 50px; height: 50px; background-color: rgb(" + additionalPalette[i][0] + ", " + additionalPalette[i][1] + ", " + additionalPalette[i][2] + ");'></div>")
            }
        }

    };
})