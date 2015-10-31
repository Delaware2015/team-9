angular.module('casfrontApp.service',[])
  
  .factory('loginservice', function ($http) {
  	var user={};
	var urlLink= 
	console.log(urlLink);
  	
  	var sendForVerification= function(oldUser){
  		console.log("http://127.0.0.1:8080/student?email="+oldUser.email + "&password=" + oldUser.password);

		$http({
	   		method:'GET',
	   		url : 'http://127.0.0.1:8080/student?email='+oldUser.email + "&password=" + oldUser.password
	 	}).then(function successCallback(response){
	    	user = response.data;
	  		console.log(user);
		});
	}

	var getUser= function(){
		return user
	}

	return {
		sendForVerification : sendForVerification,
		getUser : getUser
	}
  });