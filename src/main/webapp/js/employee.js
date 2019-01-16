
function getEmployee() {
	let xhr = new XMLHttpRequest();
	let url = "employeeInfo";
	let info = null;

	xhr.onreadystatechange = function() {
		if (xhr.readyState == 4) {
			info = JSON.parse(xhr.response);

			$("#user_Name").html("Name: " + info.name)
			$("#user_Work_Site").html("Location: " + info.location)
			$("#user_Work_Number").html("Phone Number: " + info.phoneNumber)
			$("#user_Work_Email").html("Email : " + info.Email)

		}
	}
	xhr.open("GET", url)
	xhr.send()
}

window.onload = function() {
	
	console.log("load page");
	getEmployee();

	$("#btn_View_User_Reimbursement_Request").click(function() {
		console.log("click")
		let xhr = new XMLHttpRequest();
		let url = "DisplayReinbursementServlet";
		let info = null;
		
		xhr.onreadystatechange = function(){
			if (this.readyState === 4 && this.status === 200) {
				let jsonArray = [];
				
				jsonArray = JSON.parse(xhr.response);
				
				for(i in jsonArray){
					json = jsonArray[i];
					console.log(json.title);
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
							</tr>						
							`		
							)
				}

			}	
		};
		

		xhr.open("GET", url)
		xhr.send()
	})

}