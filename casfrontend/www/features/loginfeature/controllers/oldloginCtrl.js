angular.module('casproject.oldcontrollers', [])

.controller('oldloginCtrl', function($scope){
	
	//console.log("This is bullshit");
	$scope.team = {name:"", password:""};
	//$scope.user = {};


	$scope.getUser = function(){
		console.log("lolllllll");
			$scope.team.name = $scope.name;
			$scope.team.password= $scope.password;
		
		console.log($scope.team);
	}


});