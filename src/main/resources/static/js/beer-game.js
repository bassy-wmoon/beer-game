function findBeersByBrewery() {
	$("#beer").children().remove();
	$.get(
		"/api/brewery/" + $("#brewery").find(":selected").val(),
		function(data) {
			if (!data) {
				alert("エラー処理あとで考える");
				return;
			}
			buildSelectBox($("#beer"), data);
		}
	);
}

function buildSelectBox(element, data) {
	element.append($("<option></option>").text("-"));
	data.forEach(function(e){
		element.append($("<option></option>").val(e.id).text(e.name));
	});
}