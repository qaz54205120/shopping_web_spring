var products = /*[[${products}]]*/ [];
var a = 10;
print(a);
window.alert(5+6);


function renderProductList() {
    var list = document.getElementById('productList');
    for (var i = 0; i < products.length; i++) {
        var product = products[i];
        var tr = document.createElement('tr');
        var tdName = document.createElement('td');
        var tdPrice = document.createElement('td');
        tdName.appendChild(document.createTextNode(product.name));
        tdPrice.appendChild(document.createTextNode(product.price));
        tr.appendChild(tdName);
        tr.appendChild(tdPrice);
        list.appendChild(tr);
    }
}

window.onload = function () {
    renderProductList();
}

