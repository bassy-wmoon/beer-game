var beerPhotos;
var index = 0;
$(function(){
	getBeerPhotos();
})

function findBeersByBrewery() {
	$.get("/api/brewery/" + $("#brewery").find(":selected").val(), function(data) {
		if (!data) {
			alert("エラー処理あとで考える");
			return;
		}
		buildSelectBox($("#beer"), data);
	});
}

function buildSelectBox(element, data) {
	element.children().remove();
	element.append($("<option></option>").val(0).text("-"));
	data.forEach(function(e){
		element.append($("<option></option>").val(e.id).text(e.name));
	});
}

function getBeerPhotos() {
	$.get("/api/beerPhoto/shuffle", function(data) {
		if (!data) {
			alert("エラー処理あとで考える");
			return;
		}
		beerPhotos = data;
		showPhoto(beerPhotos[index]);
	});
}

function showPhoto(photo) {
	$("#beer_photo")
	.attr("src", photo.url)
	.attr("width", photo.width * 1.2)
	.attr("height", photo.height * 1.2)
	.attr("photoId", photo.id);
	index++;
}

function answer() {
	var breweryId = $("#brewery").val();
	var beerId = $("#beer").val();
	var photoId = $("#beer_photo").attr("photoId");
	
	$.get("/api/belgianBeer/brewery/" + breweryId + "/beer/" + beerId + "/photo/" + photoId, function(data){
		if (!data) {
			$(".alert-danger").fadeIn(700);
			$(".alert-danger").fadeOut(700);
			return;
		}
		
		$(".alert-success").fadeIn(700);
		$(".alert-success").fadeOut(700);

		if (index >= beerPhotos.length) {
			alert("Game Over");
			// 初めから遊ぶリンクつける
			return;
		}
		show(data);
	});
}

function reset() {
	$("#answer_section").css("display", "block");
	$("#show_section").css("display", "none");
	$("#beer_photo").attr("src", "");
	$("#brewery").val(0);
	buildSelectBox($("#beer"), []);
}

function show(data) {
	$("#answer_section").css("display", "none");
	$("#brewery_name span").html(data.brewery.name);
	$("#beer_name span").html(data.beer.name);
	$("#beer_style span").html(data.beer.beerStyle.name);
	$("#beer_description span").html(data.beer.description);
	$("#show_section").css("display", "block");	
}

function next() {
	reset();
	showPhoto(beerPhotos[index]);	
}