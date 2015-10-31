angular.module('casproject.services', [])

.factory('newloginSrv', '$http', function($http){
	var user= {};

	$http({
	   		method:'GET',
	    	url: 'http://127.0.0.1:8080/camera?ID='+id
	 	}).then(function successCallback(response){
	    	user = response.data;
	  		console.log(user);
		});

	var getUser= function(){
		return user;
	}	
})