angular.module('casfrontApp.taskservice',[])
  
  .factory('taskservice', function ($http) {
  	var user={};

  	var addTaskToData = function(url){
  	$http({
  		method : 'GET',
  		url : "http://127.0.0.1:8080/"+url,
  		})
    }

    return{
    	addTaskToData : addTaskToData	
    }
  });