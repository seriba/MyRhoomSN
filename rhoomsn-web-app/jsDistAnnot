var application = angular.module("rhoomsnapp", ['ngRoute','ui.bootstrap','ngAnimate']);
 //HOME CONTROLLER
application
	
	.controller('listContratCtrl', ['$scope', 'homeFactory', function($scope, homeFactory) {
		$scope.contrat = {};
		//CONTRAT
		homeFactory.init().success(function (data) {
			$scope.contrat  = data;
	    });
	}])
	
	.controller('listEmployeCtrl', ['$scope', 'homeFactory', function($scope, homeFactory) {
		console.log("listEmployeCtrl");
		$scope.employe = {};
		//EMPLOYE
		homeFactory.getEmploye().success(function (data) {
			if (data){
				$scope.employe  = data;
			}else {
				$scope.employe = "Aucun n'employé dans votre BDD"
			}
	    });
	}])
	
	//TOTO3CTRL
	.controller('toto3Ctrl', ['$scope', 'homeFactory', function($scope, homeFactory) {
		console.log("toto3Ctrl");
	}])
	
	//TOTO4Ctrl
	.controller('toto4Ctrl', ['$scope', 'homeFactory', function($scope, homeFactory) {
		console.log("toto4Ctrl");
	}])
; application.controller('leftMenuController', ['$scope', function($scope) {
	
	$scope.status = {
		isFirstOpen : true,
	};
}]); //HOME ROUTING
application.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/home/toto1', {
                    templateUrl: 'views/collaborateur/toto1.html',
                    controller: 'listContratCtrl'
                }).
                when('/home/toto2', {
                    templateUrl: 'views/collaborateur/toto2.html',
                    controller: 'listEmployeCtrl'
                }).
                when('/home/toto3', {
                    templateUrl: 'views/collaborateur/toto3.html',
                    controller: 'toto3Ctrl'
                }).
                when('/home/toto4', {
                    templateUrl: 'views/collaborateur/toto4.html',
                    controller: 'toto4Ctrl'
                }).
                otherwise({
                    redirectTo: '/home/toto1'
                });
    }]);
 //HOME FACTORY
application.factory('homeFactory', ['$http', function($http){

    var homeFactory = {};
    
    homeFactory.init = function () {
        return $http.get("/home/contrat");
    };
    
    homeFactory.getEmploye = function () {
     	return $http.get("/home/employe");
     };
    
	return homeFactory;
}]);