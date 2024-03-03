
function validation()
{
	
	//first name validation
	event.preventDefault();

let firstname=document.forms["formsend"]["fname"].value;	
	let arr1=[];
	if(/^$/.test(firstname))
	{
		arr1.push("first name should  not be empty");
	}
	else if(!/[A-Za-z$_]{6,20}/.test(firstname))
		{
			arr1.push("first name should be MIN 6 and  MAX 20");
		}
	
	document.getElementById("f_error").innerHTML=arr1.join(",");
	
	
	//Last name validation
	
	let lastname=document.forms["formsend"]["lname"].value;
	arr2=[];
	if(/^$/.test(lastname))
	{
		arr2.push("last name should not be empty ");
	}
	
	else if(!/[A-Za-z$]{6,20}/.test(lastname))
		{
			arr2.push("last name should be MIN 6 and MAX 20");
		}
	
	
	document.getElementById("l_error").innerHTML=arr2.join(",");

	
	//password validation
	
	let password=document.forms["formsend"]["passw"].value;
	arr3=[];
	if(/^$/.test(password))
	{
		arr3.push("password name should not be empty ");
	}
	else if(! /\w[a-zA-Z$_]{6,10}/.test(password))
		{
			arr3.push("enter valid password ");
		}	
	document.getElementById("p_error").innerHTML=arr3.join(",");
	
	
	//email validation
	
	let email=document.forms["formsend"]["email"].value;
	arr4=[];
	if(/^$/.test(email))
	{
		arr4.push("email should not be empty ");
	}
	else if(! /(?=.[0-9])(?=.[!@#$%^&])(?=.[A-Z])(?=.*[a-z]).{8,16}/.test(email))
		{
			arr4.push("enter valid email");
		}	
	document.getElementById("e_error").innerHTML=arr4.join(",");
	
	
	//mobile validation
	let mobile=document.forms["formsend"]["tele"].value;
	arr5=[];
	if(/^$/.test(mobile))
	{
		arr5.push("mobile number shounld not be empty ");
	}
	else if(! /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/.test(mobile))
		{
			arr5.push("enter valid mobile number");
		}	
	document.getElementById("m_error").innerHTML=arr5.join(",");

     //gender validation
	let gender=document.forms["formsend"]["gender1"].value;
	arr6=[];
	if(/^$/.test(gender))
	{
		arr6.push("gender should not be empty ");
	}	
	document.getElementById("g_error").innerHTML=arr6.join(",");
	
	
	//skills validation
	let skills=document.forms["formsend"]["skills1"].value;
	arr7=[];
	if(/^$/.test(skills))
	{
		arr7.push("skills should not be empty ");
	}	
	document.getElementById("s_error").innerHTML=arr7.join(",");
	
	//dob validation
	let dob=document.forms["formsend"]["dob"].value;
	arr8=[];
	if(/^$/.test(dob))
	{
		arr8.push("date of birth should not be empty ");
	}	
	document.getElementById("d_error").innerHTML=arr8.join(",");
  
    
    //country validation
  let country=document.forms["formsend"]["country"].value;
	arr9=[];
	if(/^$/.test(country))
	{
		arr9.push("country should not be empty ");
	}	
	document.getElementById("c_error").innerHTML=arr9.join(",");
	
	
	
	let upload=document.forms["formsend"]["file"].value;
	arr10=[];
	if(/^$/.test(upload))
	{
		arr10.push("please upolad file ");
	}	
	document.getElementById("up_error").innerHTML=arr10.join(",");
	

     //stardate validation
	let sdate=document.forms["formsend"]["time1"].value;
	arr11=[];
	if(/^$/.test(sdate))
	{
		arr11.push("please enter start date ");
	}	
	document.getElementById("sd_error").innerHTML=arr11.join(",");
	
	
	//endname validation
	let edate=document.forms["formsend"]["time2"].value;
	arr12=[];
	if(/^$/.test(edate))
	{
		arr12.push("skills should not be empty ");
	}	
	document.getElementById("ed_error").innerHTML=arr12.join(",");
	
}

 
