        

        $(document).ready(function() {
            $('#butBtn').click(function(){
                var name = $('#name').val();
                if(!name){
                    alert("Please enter a name!");
                    return;
                }
                console.log(name);
                var total = 0;
                var message = name + ', you bought ';
                var enough = true;
                var countSum = 0;
                $('.count').each(function() {
                    var count = parseInt($(this).val());
                    var price = parseInt($(this).attr('data-price'));
                    var productName = $(this).attr('data-name');
                    var quantity = parseInt($(this).attr('data-quantity'));
                    console.log(price);
                    console.log(productName);
                    if ( count > 0 && count <= quantity){
                        var subtotal = price * count;
                        total += subtotal;
                        message += count + ' ' + productName + ' , ';
                    }else{
                        enough = false;
                        message = "Quantity of " + productName +  " are not enough";
                        return false;
                    }
                    countSum += count;
                    });
                    if(countSum ==0){
                        alert("Please select some products");
                        return;
                    }
                    if(enough){
                        message += 'total cost is ' + total + ' dollars.';
                        $('#total').text(message);
                        alert(message);
                    }else{
                        $('#total').text(message);
                        alert(message);
                    }
                    
                });
            });