var beerPhotos;
var index = 0;

$(function(){
	getBeerPhotos();
})

function findBeersByBrewery() {
	$("#beer").children().remove();
	$.get("/api/brewery/" + $("#brewery").find(":selected").val(), function(data) {
		if (!data) {
			alert("エラー処理あとで考える");
			return;
		}
		buildSelectBox($("#beer"), data);
	});
}

function buildSelectBox(element, data) {
	element.append($("<option></option>").text("-"));
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
	$("#beer_photo").attr("src", photo.url).attr("width", photo.width * 1.2).attr("height", photo.height * 1.2);
	index++;
}