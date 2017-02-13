'use strict';

angular.module('directory.clientsDirectory', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/clientsDirectory', {
    templateUrl: 'clientsDirectory/clientsDirectory.html',
    controller: 'ClientsDirectoryController'
  });
}])

.controller('ClientsDirectoryController', ['$scope', '$mdDialog', 'Clients', 'Task', function ($scope, $mdDialog, Clients, Task) {

    $scope.clientsList=Clients.query();
}]);