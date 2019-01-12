

function getEmployee (){
    let xhr = new XMLHttpRequest();
    let url = "employeeInfo";
    let info = null;
    
    xhr.onreadystatechange = function (){
        if(xhr.readyState == 4){
            info = JSON.parse(xhr.response);
            console.log(info);

            

        }
    }
    xhr.open("GET",url)
    xhr.send()
}



window.onload = function(){
   console.log("load page");
    getEmployee();
}