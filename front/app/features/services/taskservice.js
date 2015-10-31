angular.module('casfrontApp.taskservice',[])
  
  .factory('taskservice', function ($http) {
  	var user={};

  	var addTaskToData = function(task){
  	$http({
  		method : 'GET',
  		url : "http://127.0.0.1:8080/newTask?firstname="+ task.name + "&dateTime="+ task.date + "&studentId="+task.studentId+"&status="+"task.status",		
  	}).then(function sucessCallBack(response){
  		user = response.data;
  		})
    }

    return{
    	addTaskToData : addTaskToData	
    }
  });