angular.module('casfrontApp.service',[])
  
  .factory('loginservice', function ($http) {
  	var user={};
  	
  	var verifyUser= function(oldUser){
  		console.log("http://127.0.0.1:8080/student?email="+oldUser.email + "&password=" + oldUser.password);

		$http({
	   		method:'GET',
	   		url : 'http://127.0.0.1:8080/student?email='+oldUser.email + "&password=" + oldUser.password
	 	}).then(function successCallback(response){
	    	user = response.data;
	  		console.log(user);
		});
	}
	var createNewUser= function(newUser){
		$http({
	   		method:'GET',
	   		url : "http://127.0.0.1:8080/newStudent?firstname="+newUser.firstname + "&lastname=" + newUser.lastname+"&school="+
	   			  newUser.school+ "&email="+ newUser.email + "&password="+ newUser.password +"&mentorfirstname="+
	   			   newUser.mentorfirstname +"&mentorlastname="+ newUser.mentorlastname + "&relationship=" +newUser.relationship+"&mentoremail="+
	   			   newUser.mentoremail
	 	}).then(function successCallback(response){
	    	user = response.data;
	  		console.log(user);
		});
	 }
	

	var getUser= function(){
		return user
	}

	return {
		verifyUser : verifyUser,
		createNewUser : createNewUser,
		getUser : getUser
	}
  });