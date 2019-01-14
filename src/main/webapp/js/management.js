function getEmployee (){
    let xhr = new XMLHttpRequest();
    let url = "ManagerInfo";
    let info = null;
    
    xhr.onreadystatechange = function (){
        if(xhr.readyState == 4){
            info = JSON.parse(xhr.response);
            
            $("#user_Name").html("Name: "+ info.name)
            $("#user_Work_Site").html("Location: "+info.location)
            $("#user_Work_Number").html("Phone Number: " + info.phoneNumber)
            $("#user_Work_Email").html("Email : " + info.Email)

           
            

        }
    }
    xhr.open("GET",url)
    xhr.send()
}



window.onload = function(){
   console.log("load page");
    getEmployee();
}