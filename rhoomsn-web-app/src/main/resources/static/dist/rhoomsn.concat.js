var application = angular.module("rhoomsnapp", ['ngRoute','ui.bootstrap','ngAnimate']);

;
//HOME CONTROLLER
application
	
	.controller('listContratCtrl', function($scope, homeFactory) {
		$scope.contrat = {};
		//CONTRAT
		homeFactory.init().success(function (data) {
			$scope.contrat  = data;
	    });
	})
	
	.controller('listEmployeCtrl', function($scope, homeFactory) {
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
	})
	
	//TOTO3CTRL
	.controller('toto3Ctrl', function($scope, homeFactory) {
		console.log("toto3Ctrl");
	})
	
	//TOTO4Ctrl
	.controller('toto4Ctrl', function($scope, homeFactory) {
		console.log("toto4Ctrl");
	})
;
;
application.controller('leftMenuController', function($scope) {
	
	$scope.status = {
		isFirstOpen : true,
	};
});
;
//HOME ROUTING
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
                when('/home/mes_coordonnees', {
                    templateUrl: 'views/donnees_perso/mes_coordonnees.html',
                    controller: 'listEmployeCtrl'
                }).
                otherwise({
                    redirectTo: '/home/toto1'
                });
    }]);

;
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