angular.module('casfrontApp.taskservice',[])
  
  .factory('taskservice', function ($http) {
  	var user={};

  	var addTaskToData = function(task){
  	$http({
  		method : 'GET',
  		url : "http://127.0.0.1:8080/task",		
  	}).then(function sucessCallBack(response){
  		user = response.data;
  		})
    }

    return{
    	addTaskToData : addTaskToData	
    }
  });