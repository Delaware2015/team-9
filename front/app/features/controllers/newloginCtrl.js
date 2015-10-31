
/**
 * @ngdoc function
 * @name casfrontApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the casfrontApp
 */
angular.module('casfrontApp')
  .controller('newloginCtrl', function ($scope, loginservice) {
  		$scope.createNewUser= function(){
  			var newUser = {
  				firstname: $scope.firstname,
  				lastname: $scope.lastname,
  				school: $scope.school,
  				email : $scope.email,
  				password: $scope.password,
  				mentorfirst : $scope.mentorfirstname,
  				mentorlast: $scope.mentorlastname,
  				relationship : $scope.relationship,
  				mentoremail: $scope.mentoremail
  			}
  			console.log(newUser);

  			loginservice.createNewUser(newUser);

  		}
  });
