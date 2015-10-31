
/**
 * @ngdoc function
 * @name casfrontApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the casfrontApp
 */
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

    $scope.goToNewUser = function(){
        $location.path("/about")
    }

  });
