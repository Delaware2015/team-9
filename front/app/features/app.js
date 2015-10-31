'use strict';

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
    'casfrontApp.service'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'features/views/oldlogin.html',
        controller: 'oldloginCtrl',
      })
      .when('/about', {
        templateUrl: 'features/views/newlogin.html',
        controller: 'newloginCtrl',
      })
      .otherwise({
        redirectTo: '/'
      });
  });
