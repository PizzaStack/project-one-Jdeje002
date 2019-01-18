function getEmployee() {
    let xhr = new XMLHttpRequest();
    let url = "ManagerInfo";
    let info = null;

    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            info = JSON.parse(xhr.response);

            $("#user_Name").html("Name: " + info.name)
            $("#user_Work_Site").html("Location: " + info.location)
            $("#user_Work_Number").html("Phone Number: " + info.phoneNumber)
            $("#user_Work_Email").html("Email : " + info.Email)


        }
    }
    xhr.open("GET", url, false);
    xhr.send();

}

function EmployeeList() {
    let xhr = new XMLHttpRequest();
    let url = "employeeInfo";

    
    xhr.onreadystatechange = function () {
        
        if (this.readyState === 4 && this.status === 200) {

            jsonArray = JSON.parse(xhr.response);
            
 
                $("#get_Employee").append(
                    `   <tr>
                         <td>${jsonArray.name}</td>
                         <td>${jsonArray.location}</td>
                         <td>${jsonArray.phoneNumber}</td>
                         <td>${jsonArray.Email}</td>
                         </tr>
                         `
                )

        }
    }
    xhr.open("GET", url, false);
    xhr.send();
}
function DisplayReinbursement() {
	
	let xhr = new XMLHttpRequest();
	let url = "DisplayReinbursementServlet";
	
	
	xhr.onreadystatechange = function(){
		if (this.readyState === 4 && this.status === 200) {
			let jsonArray = [];
			
			
			jsonArray = JSON.parse(xhr.response);
			console.log(jsonArray)
			for(i in jsonArray){
				json = jsonArray[i];
				console.log(json.reciept)
				
				
				$("#View_User_Reimbursement_Request").append(
						`
						<tr>
						<td>${json.id}</td>
						<td>${json.employee_id}</td>
						<td>${json.manangement_id}</td>
						<td>${json.manangement_Approval}</td>
						<td>${json.title}</td>
						<td>${json.description}</td>
						<td>${json.amount}</td>
						<td><img class="reciept_img" height="290" width="170" "/></td>
						<td><button type="submit"value ="${json.id}" class="btn-approval" >Approve</button></td>
						<td><button type="submit"value ="${json.id}" class="btn-deny">Deny</button></td>
						</tr>						
						`		
						)
					 let base64String = btoa(String.fromCharCode(...new Uint8Array(json.reciept)));
					 $("td img").attr('src', `data:image/png;base64,${base64String}`);
				
				
			}

		}	
    };
    
	

	xhr.open("GET", url)
	xhr.send()
}



// window.onload = function(){
//    console.log("load page");
//    EmployeeList(); 
//    getEmployee ()
// }

$(document).ready(function () {
    console.log("load page");
    EmployeeList();
    getEmployee();
    DisplayReinbursement();
    
    //approval
    $(document).on('click', '.btn-approval', function (){
    	
    	let val = $(this).attr("value");
    	
    	let xhr = new XMLHttpRequest();
    	let url = "ReimbursmentApproval";
    	xhr.open("POST", url);
    	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    	xhr.onreadystatechange = function(){
    		if (this.readyState === 4 && this.status === 200){}
    	}
    	
    	
    	xhr.send(`id=${val}`);
    	
    })
     //Deny
    $(document).on('click', '.btn-deny', function (){
    	
    	let val = $(this).attr("value");
    	
    	let xhr = new XMLHttpRequest();
    	let url = "DenyReimbursement";
    	xhr.open("POST", url);
    	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");

    	xhr.onreadystatechange = function(){
    		if (this.readyState === 4 && this.status === 200){}
    		
    		
    	}

    	xhr.send(`id=${val}`);
    	
    	
    })
    
});

