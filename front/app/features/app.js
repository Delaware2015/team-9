
/**
 * @ngdoc overview
 * @name casfrontApp
 * @description
 * # casfrontApp
 *
 * Main module of the application.
 */
angular
  .module('casfrontApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',   
    'ngTouch',
    'casfrontApp.service',
    'casfrontApp.taskservice'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'features/views/oldlogin.html',
        controller: 'oldloginCtrl',
      })
      .when('/newlogin', {
        templateUrl: 'features/views/newlogin.html',
        controller: 'newloginCtrl',
      })
      .when('/resources', {
        templateUrl: 'features/views/resources.html',
      })
      .when('/tasks', {
        templateUrl: 'features/views/tasks.html',
        controller: 'taskCtrl',
      })
       .when('/about', {
        templateUrl: 'features/views/about.html',
      })
       .when('/contact', {
        templateUrl: 'features/views/contact.html',
      })
      .otherwise({
        redirectTo: '/'
      });
  });
