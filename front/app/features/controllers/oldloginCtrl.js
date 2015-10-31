//controller used for return users
angular.module('casfrontApp')
  .controller('oldloginCtrl', function ($scope, loginservice, $location) {
   	console.log("bull");
   	$scope.getUser = function(){
   		var user= {
   			email : $scope.email,
   			password : $scope.password
   		}
   		loginservice.verifyUser(user);
   	}

     $scope.toNewUser= function(){
      $location.path("/newlogin");
     }

  });
