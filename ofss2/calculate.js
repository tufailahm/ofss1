function finalBill(){
    var billAmount = document.getElementById("bill").value;
    var finalBill = document.getElementById("fbill");
    var today= new Date();
    today.setFullYear(2022,7,31);   //date on which bill has been paid
    var dueDate=new Date();
    var month=dueDate.getMonth();
    var year=dueDate.getFullYear();
    dueDate.setFullYear(year,month,15);
    if(dueDate>today ){
        finalBill.innerHTML=billAmount;
    }
    else if (billAmount ==0){
        finalBill.innerHTML=billAmount;
    }
    else {
        var day = 1000 * 60 * 60 * 24;
        x=(today-dueDate)/day;
        var finalAmount=parseInt(billAmount)+(x*50);
        finalBill.innerHTML=finalAmount;
    }
}