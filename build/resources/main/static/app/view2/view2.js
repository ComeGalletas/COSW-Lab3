'use strict';

angular.module('myApp.view2', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view2', {
    templateUrl: 'view2/view2.html',
    controller: 'View2Ctrl'
  });
}])

.controller('View2Ctrl', ['$scope', 'fabrica', 'Task', function ($scope, fabrica, Task) {

    $scope.description='';
    $scope.priority='';

    $scope.catchPendingTasks = function(){
        //fabrica.addTodo({"description":$scope.description, "priority":$scope.priority});

        var task = new Task({"description":$scope.description, "priority":$scope.priority});
        task.$save();
    }
}]);