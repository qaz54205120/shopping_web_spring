        

        $(document).ready(function() {
            $('#butBtn').click(function(){
                var name = $('#name').val();
                console.log(name);
                var total = 0;
                var message = name + ', you bought ';
                $('.quantity').each(function() {
                    var quantity = parseInt($(this).val());
                    var price = parseInt($(this).attr('data-price'));
                    var productName = $(this).attr('data-name');
                    console.log(price);
                    console.log(productName);
                    if ( quantity > 0){
                        var subtotal = price * quantity;
                        total += subtotal;
                        message += quantity + ' ' + productName + ' , ';
                    }
                    });
                    message += 'total cost is ' + total + ' dollars.';
                    $('#total').text(message);
                    alert(message);
                });
            });