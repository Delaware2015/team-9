angular.module('casfrontApp')
  .controller('taskCtrl', function ($scope, taskservice) {
  	var student = {};

  	$scope.addTask = function(){
      console.log($scope.taskdate);
  		var task= {
  			taskname: $scope.taskname,
  			taskDate : $scope.taskdate,
        studentId: 1,
  			status: $scope.status
  		}
  		console.log(task);
      var url="newTask?name="+ task.taskname + "&dateTime="+ task.taskdate + "&studentId="+task.studentId+"&status="+task.status;
      sendTheMail(task,"Gabe2390","gabe2390@gmail.com","gabe2390@gmail.com","01012016");
  		taskservice.addTaskToData(url);
  	}
  });