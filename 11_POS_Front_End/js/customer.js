function saveCustomer() {
    let id=$('#customerId').val()
    let name=$('#customerName').val()
    let address=$('#customerAddress').val()

    $.ajax({
        url:'http://localhost:8080/api/v1/customer',
        method:'POST',
        contentType:'application/json',

        data:JSON.stringify({
            cId:id,
            cName:name,
            cAddress:address
        }),
        success:function (res) {
            if (res.status===201){
                alert(res.message)
            }else {
                alert("customer not saved,try again")
            }
        },
        error:function (err) {
            alert(err.message)
        }
    })
}

function updateCustomer() {
    let id=$('#customerId').val()
    let name=$('#customerName').val()
    let address=$('#customerAddress').val()

    $.ajax({
        url:'http://localhost:8080/api/v1/customer',
        method:'PUT',
        contentType:'application/json',

        data:JSON.stringify({
            cId:id,
            cName:name,
            cAddress:address
        }),
        success:function (res) {
            alert('saved!')
        },
        error:function (err) {
            alert(err.message)
        }
    })
}