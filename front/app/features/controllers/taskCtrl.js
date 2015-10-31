angular.module('casfrontApp')
  .controller('taskCtrl', function ($scope, taskservice) {
  	var student = {};

  	$scope.addTask = function(){
  		var task= {
  			taskname: $scope.taskname,
  			taskDate : $scope.taskdate,
        studentId: 1,
  			status: student.status.value
  		}
  		console.log(task);
  		taskservice.addTaskToData(task);
  	}
  });