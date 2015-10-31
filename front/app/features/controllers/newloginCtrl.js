//controller used for new usersz
angular.module('casfrontApp')
  .controller('newloginCtrl', function ($scope, loginservice, $location) {
      //create a new object, populated by the fields of the form, and send to service for verification
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

      $scope.toOldUser = function(){
        $location.path("/")
    }
  });
